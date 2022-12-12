package org.ehrbase.application;

import java.util.Map;
import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.MapPropertySource;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.lifecycle.Startables;
import org.testcontainers.utility.DockerImageName;

@Slf4j
public class DependencyInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

  static GenericContainer<?> redis = new GenericContainer<>(DockerImageName.parse("redis:latest"))
      .withExposedPorts(6379);
  static GenericContainer<?> postgres = new GenericContainer<>(
      DockerImageName.parse("ehrbase/ehrbase-postgres:latest"))
      .withEnv(Map.of(
          "POSTGRES_PASSWORD", "postgres",
          "POSTGRES_USER", "postgres",
          "EHRBASE_USER", "ehrbase",
          "EHRBASE_PASSWORD", "ehrbase"
      ))
      .withExposedPorts(5432);

  public static Map<String, String> getProperties() {
    Startables.deepStart(Stream.of(redis, postgres)).join();

    log.info("REDIS PORT: {}", redis.getMappedPort(6379));

    String url = "jdbc:postgresql://localhost:" + postgres.getMappedPort(5432) + "/ehrbase";
    log.info("URL TO POSTGRES : {}", url);
    return Map.of(
        "spring.datasource.url", url + "?currentSchema=ehr",
        "spring.flyway.url", url,
        "spring.flyway.user", "ehrbase",
        "spring.flyway.password", "ehrbase",
        "spring.redis.port", redis.getMappedPort(6379) + ""
    );
  }

  @Override
  public void initialize(ConfigurableApplicationContext applicationContext) {
    var env = applicationContext.getEnvironment();
    env.getPropertySources().addFirst(new MapPropertySource(
        "dependencyInitializer", (Map) getProperties()
    ));
  }
}

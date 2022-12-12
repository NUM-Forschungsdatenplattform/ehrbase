package org.ehrbase.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunLocal {

  public static void main(String[] args) {
    var application = EhrBase.createSpringApplication();

    application.addInitializers(
        new DependencyInitializer()
    );

    application.setAdditionalProfiles("num");
    application.run(args);
  }
}

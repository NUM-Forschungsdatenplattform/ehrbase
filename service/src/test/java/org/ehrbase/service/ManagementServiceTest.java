package org.ehrbase.service;

import org.ehrbase.api.service.ManagementService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ManagementServiceTest {
    @Test
    public void testLogLevelSwitching() {
        ManagementService managementService = new ManagementServiceImp(null, null, null);

        managementService.setLogLevel("TRACE");
        Assertions.assertEquals(managementService.getLogLevel(), "TRACE");

        managementService.setLogLevel("DEBUG");
        Assertions.assertEquals(managementService.getLogLevel(), "DEBUG");

        managementService.setLogLevel("INFO");
        Assertions.assertEquals(managementService.getLogLevel(), "INFO");

        managementService.setLogLevel("WARN");
        Assertions.assertEquals(managementService.getLogLevel(), "WARN");

        managementService.setLogLevel("ERROR");
        Assertions.assertEquals(managementService.getLogLevel(), "ERROR");

        managementService.setLogLevel("OFF");
        Assertions.assertEquals(managementService.getLogLevel(), "OFF");

        //Testing wrong value. Default value is DEBUG
        managementService.setLogLevel("INFO2");
        Assertions.assertEquals(managementService.getLogLevel(), "DEBUG");

        managementService.setLogLevel(null);
        Assertions.assertEquals(managementService.getLogLevel(), "DEBUG");

        managementService.setLogLevel("tralala");
        Assertions.assertEquals(managementService.getLogLevel(), "DEBUG");
    }
}

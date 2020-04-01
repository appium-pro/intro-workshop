package com.appiumpro.intro_workshop;

import org.junit.jupiter.api.Test;

import io.cloudgrey.ap_workshop.ProjectCapabilities;
import io.cloudgrey.ap_workshop.TestBase;

public class IOSCapabilitiesTest extends TestBase {

    public IOSCapabilitiesTest() {
        caps = ProjectCapabilities.TheAppIOS();
    }

    @Test
    public void startSessionTest() {
    }
}

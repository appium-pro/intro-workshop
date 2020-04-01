package com.appiumpro.intro_workshop;

import org.junit.jupiter.api.Test;

import io.cloudgrey.ap_workshop.ProjectCapabilities;
import io.cloudgrey.ap_workshop.TestBase;

public class AndroidCapabilitiesTest extends TestBase {

    public AndroidCapabilitiesTest() {
        caps = ProjectCapabilities.TheAppAndroid();
    }

    @Test
    public void startSessionTest() {
    }
}

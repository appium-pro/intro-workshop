package com.appiumpro.intro_workshop;

import org.junit.jupiter.api.Test;

import com.appiumpro.intro_workshop.ProjectCapabilities;
import com.appiumpro.intro_workshop.TestBase;

public class IOSCapabilitiesTest extends TestBase {

    public IOSCapabilitiesTest() {
        caps = ProjectCapabilities.TheAppIOS();
    }

    @Test
    public void startSessionTest() {
    }
}

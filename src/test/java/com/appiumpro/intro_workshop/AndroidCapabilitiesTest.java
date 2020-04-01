package com.appiumpro.intro_workshop;

import org.junit.jupiter.api.Test;

import com.appiumpro.intro_workshop.ProjectCapabilities;
import com.appiumpro.intro_workshop.TestBase;

public class AndroidCapabilitiesTest extends TestBase {

    public AndroidCapabilitiesTest() {
        caps = ProjectCapabilities.TheAppAndroid();
    }

    @Test
    public void startSessionTest() {
    }
}

package com.appiumpro.intro_workshop;

import org.junit.jupiter.api.Test;

import io.cloudgrey.ap_workshop.ProjectCapabilities;
import io.cloudgrey.ap_workshop.TestBase;

public class AndroidSourceTest extends TestBase {

    public AndroidSourceTest() {
        caps = ProjectCapabilities.TheAppAndroid();
    }

    @Test
    public void startSessionTest() {
        System.out.println(driver.getPageSource());
    }
}

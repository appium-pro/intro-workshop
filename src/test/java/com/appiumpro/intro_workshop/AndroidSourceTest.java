package com.appiumpro.intro_workshop;

import org.junit.jupiter.api.Test;

import com.appiumpro.intro_workshop.ProjectCapabilities;
import com.appiumpro.intro_workshop.TestBase;

public class AndroidSourceTest extends TestBase {

    public AndroidSourceTest() {
        caps = ProjectCapabilities.TheAppAndroid();
    }

    @Test
    public void startSessionTest() {
        System.out.println(driver.getPageSource());
    }
}

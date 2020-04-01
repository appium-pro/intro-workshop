package com.appiumpro.intro_workshop;

import org.junit.jupiter.api.Test;

public class AndroidSourceTest extends TestBase {

    public AndroidSourceTest() {
        caps = ProjectCapabilities.TheAppAndroid();
    }

    @Test
    public void startSessionTest() {
        System.out.println(driver.getPageSource());
    }
}

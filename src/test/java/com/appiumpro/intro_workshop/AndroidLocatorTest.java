package com.appiumpro.intro_workshop;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;

public class AndroidLocatorTest extends TestBase {

    public AndroidLocatorTest() {
        caps = ProjectCapabilities.TheAppAndroid();
    }

    @Test
    public void locatorTest() throws InterruptedException {
        Thread.sleep(3000);
        WebElement el = driver.findElement(MobileBy.AccessibilityId("Login Screen"));
        System.out.println(el);
    }
}

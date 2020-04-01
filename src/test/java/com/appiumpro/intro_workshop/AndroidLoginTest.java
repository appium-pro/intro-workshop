package com.appiumpro.intro_workshop;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import com.appiumpro.intro_workshop.ProjectCapabilities;
import com.appiumpro.intro_workshop.TestBase;

public class AndroidLoginTest extends TestBase {

    public AndroidLoginTest() {
        caps = ProjectCapabilities.TheAppAndroid();
    }

    @Test
    public void loginTest() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(MobileBy.AccessibilityId("Login Screen")).click();
        driver.findElement(MobileBy.AccessibilityId("username")).sendKeys("alice");
        driver.findElement(MobileBy.AccessibilityId("password")).sendKeys("mypassword");
        driver.findElement(MobileBy.AccessibilityId("loginBtn")).click();

        driver.findElement(By.xpath("//*[@text='You are logged in as alice']"));
    }
}

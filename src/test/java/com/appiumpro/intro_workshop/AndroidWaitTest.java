package com.appiumpro.intro_workshop;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;

public class AndroidWaitTest extends TestBase {

    public AndroidWaitTest() {
        caps = ProjectCapabilities.TheAppAndroid();
    }

    @Test
    public void loginTest() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(
            MobileBy.AccessibilityId("Login Screen"))).click();
        driver.findElement(MobileBy.AccessibilityId("username")).sendKeys("alice");
        driver.findElement(MobileBy.AccessibilityId("password")).sendKeys("mypassword");
        driver.findElement(MobileBy.AccessibilityId("loginBtn")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(
            By.xpath("//*[@text='You are logged in as alice']")));
    }
}

package com.appiumpro.intro_workshop;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

abstract public class TestBase {
    protected AppiumDriver<WebElement> driver;
    protected DesiredCapabilities caps;

    protected AppiumDriver<WebElement> getDriver() {
        return this.driver;
    }

    protected String resourcePath(String resourceName) {
        return Paths.get(System.getProperty("user.dir"), "src", "test", "resources",
            resourceName).toString();
    }

    protected String getResourceB64(String fileName) throws IOException {
        Path refImgPath = Paths.get(resourcePath(fileName));
        return Base64.getEncoder().encodeToString(Files.readAllBytes(refImgPath));
    }

    @BeforeEach
    public void setUp() throws MalformedURLException {
        final URL server = new URL("http://localhost:4723/wd/hub");
        if (caps.getCapability("platformName").equals("Android")) {
            this.driver = new AndroidDriver<>(server, caps);
        } else {
            this.driver = new IOSDriver<>(server, caps);
        }
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

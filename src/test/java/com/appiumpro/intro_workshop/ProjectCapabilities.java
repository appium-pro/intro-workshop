package com.appiumpro.intro_workshop;

import java.nio.file.Paths;

import org.openqa.selenium.remote.DesiredCapabilities;

public class ProjectCapabilities {

    public static String localApp(String appName) {
        return Paths.get(System.getProperty("user.dir"), "apps", appName).toString();
    }

    private static DesiredCapabilities AndroidBase() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("automationName", "UiAutomator2");
        return caps;
    }

    private static DesiredCapabilities IOSBase() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("platformVersion", "13.3");
        caps.setCapability("deviceName", "iPhone 11");
        return caps;
    }

    public static DesiredCapabilities TheAppAndroid() {
        DesiredCapabilities caps = AndroidBase();
        caps.setCapability("app",  localApp("TheApp.apk"));
        caps.setCapability("appWaitActivity", "com.reactnativenavigation.controllers.NavigationActivity");
        return caps;
    }

    public static DesiredCapabilities TheAppIOS() {
        DesiredCapabilities caps = IOSBase();
        caps.setCapability("app",  localApp("TheApp.app.zip"));
        return caps;
    }

    public static DesiredCapabilities TheApp() {
        if (System.getenv("PLATFORM").toLowerCase().equals("android")) {
            return TheAppAndroid();
        }
        return TheAppIOS();
    }

    public static DesiredCapabilities FilesAppAndroid() {
        DesiredCapabilities caps = AndroidBase();
        caps.setCapability("appPackage",  "com.android.documentsui");
        caps.setCapability("appActivity",  ".files.FilesActivity");
        return caps;
    }

    public static DesiredCapabilities ApiDemosAndroid() {
        DesiredCapabilities caps = AndroidBase();
        caps.setCapability("app",  localApp("ApiDemos-debug.apk"));
        return caps;
    }

    public static DesiredCapabilities PhotosAndroid() {
        DesiredCapabilities caps = AndroidBase();
        caps.setCapability("appPackage", "com.google.android.apps.photos");
        caps.setCapability("appActivity", ".home.HomeActivity");
        return caps;
    }

    public static DesiredCapabilities WordpressAndroid() {
        DesiredCapabilities caps = AndroidBase();
        caps.setCapability("app", localApp("wordpress.apk"));
        caps.setCapability("appWaitActivity", "org.wordpress.android.ui.accounts.LoginActivity");
        return caps;
    }

    public static DesiredCapabilities Safari() {
        DesiredCapabilities caps = IOSBase();
        caps.setBrowserName("Safari");
        return caps;
    }

    public static DesiredCapabilities Chrome() {
        DesiredCapabilities caps = AndroidBase();
        caps.setBrowserName("Chrome");
        return caps;
    }

}

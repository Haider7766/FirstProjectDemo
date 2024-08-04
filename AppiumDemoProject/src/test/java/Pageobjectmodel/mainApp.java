package Pageobjectmodel;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;


public class mainApp {
    public static AndroidDriver driver;

    public static void initializeDriver() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Oppo A5");
        cap.setCapability("platformName", "Android");
        cap.setCapability("automationName", "uiautomator2");
        cap.setCapability("app", "C:\\Users\\HAIDER ALI\\Desktop\\QA\\Apk\\Android-MyDemoAppRN.1.3.0.build-244.apk");
        cap.setCapability("noReset", true);
        cap.setCapability("platformVersion", "8.1.0");
        //cap.setCapability("adbExecTimeout", "20000");
        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AndroidDriver(url, cap);  // Assign to the static driver field
        Thread.sleep(5000);
        System.out.println("Application started....");
    }

    public static AndroidDriver getDriver() {
        return driver;
    }

    public static void tearDown() {
        System.out.println("Session closed!");
        if (driver != null) {
            driver.quit();
        }
    }
}
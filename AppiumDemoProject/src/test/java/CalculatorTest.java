import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {

    static AppiumDriver<MobileElement> driver;

    public static void main(String[] args) {
        try {
            openCalculator();
        } catch (Exception exp) {
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
    public static void openCalculator() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Samsung SM-A515F");
        cap.setCapability("udid", "R58N14625JV");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "10");
        cap.setCapability("appPackage", "app.com.brd"); // Replace with the correct app package
        cap.setCapability("appActivity", "com.android.vending"); 
        URL url = new URL("http://localhost:4723/wd/hub");
        driver = new AppiumDriver<>(url, cap);
        System.out.println("Application started....");    
    }
} 
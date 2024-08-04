package Pageobjectmodel;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Web.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;

public class MainTests {
    private static AndroidDriver<?> driver;

   @BeforeClass
    public static void setUp() throws MalformedURLException, InterruptedException {
        mainApp.initializeDriver();
        driver = mainApp.getDriver();
    }
    @Test(priority = 1)
    public static void tst() {
    	test t1 = new test();
    	t1.testaction();
    }
   // @Test(priority = 6)
    public void logincredential() {
        LoginFlow object = new LoginFlow(driver);
        object.uname();
        object.pswd();
        object.signclick();
    }

    @Test(priority = 2)
    public void paymentsclick() {
        Payments pyobject = new Payments(driver);
        pyobject.payAnyone();
    }
    
  //  @Test(priority = 3)
    public void click() {
        MyPayees pyobject = new MyPayees(driver);
        pyobject.clickFuncation();
        pyobject.paynowFuncation();
    }

    @AfterClass
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

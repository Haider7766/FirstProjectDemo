package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class BMVPRELOGIN {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//System.out.println("Inconsistent Capitalization in QR Code Expiry AlertInconsistent Capitalization in QR Code Expiry Alert ");
				 DesiredCapabilities cap = new DesiredCapabilities();
				  cap.setCapability("deviceName", "Sumsung SM A515F");
				  cap.setCapability("platformName", "Android");
			        cap.setCapability("automationName", "uiautomator2");
			        cap.setCapability("app", "C:\\Users\\O3\\Desktop\\o3QA\\apk folder\\release-1033-v3.26.0-arm64-v8a-protected.apk");
			        cap.setCapability("platformVersion", "10"); 
			        //cap.setCapability("appPackage", "app.com.brd");
			        //cap.setCapability("appActivity", "app.com.brd.ui.activities.BaseActivity");
			        URL url =URI.create("http://127.0.0.1:4723/").toURL();
			        AndroidDriver driver = new AndroidDriver(url, cap);
			        Thread.sleep(5000);
			        System.out.println("Application started....");
			        WebElement skip= driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"app.com.brd:id/\" and @text=\"Skip\"]"));
			        skip.click();
			        Thread.sleep(2000);
			        WebElement agree= driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"app.com.brd:id/\"]"));
			        agree.click();
			        Thread.sleep(2000);
		             WebElement deny2 =driver.findElement(By.id("com.android.permissioncontroller:id/permission_deny_button"));
		             deny2.click();
		             Thread.sleep(5000);
		             WebElement getButton = null;
		             try {
		                 getButton = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"app.com.brd:id/\"]"));
		             } catch (org.openqa.selenium.NoSuchElementException e) {
		                 System.out.println("Get button is not visible on the screen.");
		             }
		             
		             // If the button is found, click on it and check if the safety update screen is present
		             if (getButton != null) {
		            	 System.out.println("safety update screen is  present.");
		                 getButton.click();
		             }
		             else {
		            	 System.out.println("safety update screen is not present.");
		             }
		            WebElement morebtn= driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"app.com.brd:id/more\"]"));
		             morebtn.click();
		             Thread.sleep(2000);
		             WebElement bio= driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"app.com.brd:id/\" and @text=\"Biometric Verification\"]"));
		             Thread.sleep(2000);
		             bio.click();
		             WebElement allowed= driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]"));
		             allowed.click();
		             WebElement getstrted= driver.findElement(By.xpath("= //android.widget.Button[@resource-id=\"app.com.brd:id/compContinue\"]"));
		             getstrted.click();
		             
		             
		             
		             
		             
		             
	}

}

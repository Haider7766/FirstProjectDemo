package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class APKInstall {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		//Gather desired capabilities
		  DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("deviceName", "Pixel 2");
		  cap.setCapability("platformName", "Android");
	        cap.setCapability("automationName", "uiautomator2");
	        cap.setCapability("app", "C:\\Users\\O3\\Desktop\\o3QA\\apk folder\\release-963-v3.24.3-arm64-v8a-protected.apk");
	        cap.setCapability("platformVersion", "10");
	        URL url =URI.create("http://127.0.0.1:4723/").toURL();
	        AndroidDriver driver = new AndroidDriver(url, cap);
	        Thread.sleep(9000);
	        System.out.println("Application started...."); 
	        
	        //driver.quit();close session  
	        String expected = "google.com";
	        String actual = driver.getCurrentUrl();
	        String sdk = "your mobile is not connected";
	        if(actual.equals(expected)) {
	        	System.out.println("Url is matched");
	        }
	        else {
	        	System.out.println("Url is not matched please try again.");
	        }
	        
	}

}

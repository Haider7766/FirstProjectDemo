package Demo;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class AutomateApp {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		//System.out.println("Inconsistent Capitalization in QR Code Expiry AlertInconsistent Capitalization in QR Code Expiry Alert ");
		 DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("deviceName", "Pixel 2");
		  cap.setCapability("platformName", "Android");
	        cap.setCapability("automationName", "uiautomator2");
	        cap.setCapability("app", "C:\\Users\\O3\\Desktop\\o3QA\\apk folder\\release-993-v3.25.3-arm64-v8a-protected.apk");
	        cap.setCapability("platformVersion", "10"); 
	        //cap.setCapability("appPackage", "app.com.brd");
	        //cap.setCapability("appActivity", "app.com.brd.ui.activities.BaseActivity");
	        URL url =URI.create("http://127.0.0.1:4723/").toURL();
	        AndroidDriver driver = new AndroidDriver(url, cap);
	        Thread.sleep(5000);
	        System.out.println("Application started....");
        WebElement swip = driver.findElement(By.id("app.com.brd:id/tv_swipe_to"));
          // Perform a swipe up gesture
             int startX = swip.getLocation().getX() + swip.getSize().getWidth() / 2;
             int startY = swip.getLocation().getY() + swip.getSize().getHeight() / 2;
             int endY = startY - 1000;  // Adjust the distance of the swipe based on your requirements
             TouchAction touchAction = new TouchAction(driver);
             touchAction.press(PointOption.point(startX, startY))
                     .moveTo(PointOption.point(startX, endY))
                     .release()
                     .perform();
             System.out.println("Swiped up successfully");
            

  }
  
           }
           
            
            
     	
	
package Pageobjectmodel;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;

public class LoginFlow {
    public static WebDriver driver;
    private WebDriverWait wait;
    private boolean PaymentClicked =false;

    public LoginFlow(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 5); // Set a reasonable timeout for waits
    }

    
    public void swipeUp()  {
        // Get Screen size
        Dimension size = driver.manage().window().getSize();
        
        // Find the position where you need to touch
        int startX = size.getWidth() / 2;
        int startY = size.getHeight() / 2;
        
        // Position till you want to move your finger to swipe
        int endX = startX;
        int endY = (int) (size.getHeight() * 0.35); // Adjusted endY value
        
        // PointerInput class to create a sequence of actions 
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        
        // Sequence object, which is a list of actions that will be performed on the device
        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(200))) // Wait for some time
                .addAction(finger1.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), endX, endY))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg())); 

        // Perform the Sequence of action
        ((RemoteWebDriver) driver).perform(Collections.singletonList(sequence));
        
        // Wait for a while for the swipe action to complete
       // Thread.sleep(5000);
        
        // Wait for a while before quitting the driver
       // Thread.sleep(2000);
        
       
        
       
    }  
    
    By username = By.xpath("//android.widget.EditText[@resource-id=\"app.com.brd:id/\" and @text=\"Username\"]");
    public void uname() {
        // Code to click on username field
     
        driver.findElement(username).sendKeys("Atish524");

    }
    By password = By.xpath("//android.widget.EditText[@resource-id=\"app.com.brd:id/\" and @text=\"Password\"]");
    public void pswd() {
        // Code to click password field
     
        driver.findElement(password).sendKeys("Abbasi123");

    }
  
   By signin = By.xpath("//android.widget.Button[@resource-id=\"app.com.brd:id/login_button\"]");
   public boolean signclick() {
	    System.out.println("Attempting to click the sign-in button.");
	    try {
	        // Click the sign-in button
	        driver.findElement(signin).click();
	        System.out.println("Sign-in button clicked, waiting for user name to be displayed.");

	        // Wait for the user name to appear
	        WebElement name = wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.xpath("//android.widget.TextView[@resource-id=\"app.com.brd:id/\" and @text=\"Show Balance\"]")));

	        // Check if the name element is displayed
	        if (name.isDisplayed()) {
	            System.out.println("Login successful! User 'Haider Ali' is displayed.");
	            if (!PaymentClicked) {
	                paymentFuncation();  // Call the payment function if not previously clicked
	                PaymentClicked = true;  // Set to true to avoid multiple triggers
	            }
	            return true;  // Return true if the name is visible, indicating successful login
	        } else {
	            System.out.println("Login failed. User name not visible.");
	        }
	    } catch (Exception e) {
	        // Log any exceptions that occur during the process
	        System.out.println("Login failed: " + e.getMessage());
	    }
	    return false;  // Return false if the login failed or the name was not displayed
	}

  

   By paymentbutton = By.xpath("//android.widget.TextView[@resource-id=\"app.com.brd:id/\" and @text=\"Payments\"]");

   public void paymentFuncation() {
	   WebDriverWait wait = new WebDriverWait(driver, 3); // Reduced timeout for quick checks
       List<WebElement> alertElements = (List<WebElement>) driver.findElements(paymentbutton); // findElements to check presence
       if (!alertElements.isEmpty()) {
           try {
               WebElement alertElement = wait.until(ExpectedConditions.visibilityOfElementLocated(paymentbutton));
               alertElement.click();
               System.out.println("payment button visible");
           } catch (TimeoutException e) {
               System.out.println("payment button not visible");
           }
       } else {
           System.out.println(" payment  button not visible  ");
       }
   }

   
   
  
}
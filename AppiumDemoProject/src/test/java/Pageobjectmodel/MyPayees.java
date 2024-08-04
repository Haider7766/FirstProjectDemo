package Pageobjectmodel; 

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyPayees {
	private WebDriver driver;
	private WebDriverWait wait;
	private boolean paytoproceedClicked = false;
	private boolean paynowClicked = false;
	private boolean sentClicked = false;
	


        public MyPayees(WebDriver driver) {
            this.driver = driver;
            this.wait = new WebDriverWait(driver, 5); 
        }

        By click = By.xpath("(//android.widget.FrameLayout[@resource-id=\"app.com.brd:id/\"])[2]/android.view.ViewGroup");

        public void clickFuncation() {
        	 WebDriverWait wait = new WebDriverWait(driver, 5); // Reduced timeout for quick checks
             List<WebElement> alertElements = (List<WebElement>) driver.findElements(click); // findElements to check presence
             if (!alertElements.isEmpty()) {
            	 WebElement alertElement = wait.until(ExpectedConditions.visibilityOfElementLocated(click));
                 alertElement.click();
            	 
             } else {
                 System.out.println(" not showing pay to proceed button ");
             }
             if (!paytoproceedClicked) { 	 
            	 PaytoproceedFuncation(); 
             
         }
        }
        
        By paytoproceed = By.xpath("//android.widget.Button[@resource-id=\"app.com.brd:id/\"]");

        public void PaytoproceedFuncation() {
        	 WebDriverWait wait = new WebDriverWait(driver, 5); // Reduced timeout for quick checks
             List<WebElement> alertElements = (List<WebElement>) driver.findElements(paytoproceed); // findElements to check presence
             if (!alertElements.isEmpty()) {
            	 WebElement alertElement = wait.until(ExpectedConditions.visibilityOfElementLocated(paytoproceed));
                 alertElement.click();
            	 
             } else {
                 System.out.println(" not showing pay to proceed button ");
             }
         }
            public void paynowFuncation() {
                try {
                    WebDriverWait wait = new WebDriverWait(driver, 10); // Extend wait if necessary
                    By payNowButton = By.xpath("//android.widget.Button[@resource-id='app.com.brd:id/' and @text='Pay Now']");
                    
                    WebElement payNowElement = wait.until(ExpectedConditions.elementToBeClickable(payNowButton));
                    
                    // Click the button
                    payNowElement.click();
                    System.out.println("Clicked on the 'Pay Now' button successfully.");
                if (!sentClicked) {
                	sentFuncation();
                	sentClicked =true;
                }
                } catch (TimeoutException e) {
                    System.out.println("Timeout waiting for 'Pay Now' button: " + e.getMessage());
                } catch (NoSuchElementException e) {
                    System.out.println("'Pay Now' button not found on the page: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Failed to click on 'Pay Now' button: " + e.getMessage());
                }
            }
public void sentFuncation() {
	 try {
         WebDriverWait wait = new WebDriverWait(driver, 10); // Extend wait if necessary
         By AmountSent = By.xpath("//android.widget.TextView[@resource-id=\"app.com.brd:id/\" and @text=\"Amount Sent\"]");
         
         WebElement AmountSentElement = wait.until(ExpectedConditions.elementToBeClickable(AmountSent));
         
         // Click the button
         AmountSentElement.click();
         System.out.println("amount sent successfully.");
     } catch (TimeoutException e) {
         System.out.println("Timeout waiting for 'Pay Now' button: " + e.getMessage());
     } catch (NoSuchElementException e) {
         System.out.println("'Pay Now' button not found on the page: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("Failed to click on 'Pay Now' button: " + e.getMessage());
     }
 }
}


//android.widget.TextView[@resource-id="app.com.brd:id/" and @text="Amount Sent"]


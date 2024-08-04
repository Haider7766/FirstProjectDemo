package Pageobjectmodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class Payments {
	private WebDriver driver;
	//private WebDriverWait wait;
	private boolean getStartedClicked = false;
	private boolean AccountClicked= false;
	private boolean paynowClicked= false;
	private boolean dropdownClicked= false;
	private boolean billpaymentClicked = false;
	private boolean continuetClicked = false;
	private boolean amountClicked = false;
    public Payments (WebDriver driver) {
        this.driver = driver;
        //this.wait = new WebDriverWait(driver, 5); // Set a reasonable timeout for waits
    }
    By anyone = By.xpath("(//android.view.ViewGroup[@resource-id=\"app.com.brd:id/\"])[5]/android.widget.LinearLayout");
    public void payAnyone() {
    	WebDriverWait wait = new WebDriverWait(driver, 5); // Extend wait if necessary
        WebElement paymentElement = wait.until(ExpectedConditions.elementToBeClickable(anyone));
        paymentElement.click();
        if(!getStartedClicked) {
        	Getstarted();
        }
        if(!AccountClicked) {
        	easypaisaFuncation();
        }
        if(!paynowClicked) {
        	paynowFuncation();
        }
        if(!dropdownClicked) {
        	dropdownFuncation();
        }
        if(!billpaymentClicked) {
        	billpaymentFuncation();
        }
        if(!continuetClicked) {
        	 continueFuncation();
        }
        if(!amountClicked) {
        	amountFuncation();
       }
       
    }
    By getstarted= By.xpath("//android.widget.Button[@resource-id=\"app.com.brd:id/compContinue\"]");
    public void Getstarted() {
            WebDriverWait wait = new WebDriverWait(driver, 3); // Reduced timeout for quick checks
            List<WebElement> alertElements = (List<WebElement>) driver.findElements(getstarted); // findElements to check presence
            if (!alertElements.isEmpty()) {
                try {
                    WebElement alertElement = wait.until(ExpectedConditions.visibilityOfElementLocated(getstarted));
                    alertElement.click();
                    System.out.println("payAnyone screen is present ");
                } catch (TimeoutException e) {
                    System.out.println("exception in pyanyone screen.");
                }
            } else {
                System.out.println("PayAnyone screen already clicked");
            }
        }
    
    
    By easypaisaaccount = By.xpath("//android.widget.ImageView[@content-desc=\"UBL Digital\"]");

    public void easypaisaFuncation() {
    	 WebDriverWait wait = new WebDriverWait(driver, 3); // Reduced timeout for quick checks
         List<WebElement> alertElements = (List<WebElement>) driver.findElements(easypaisaaccount); // findElements to check presence
         if (!alertElements.isEmpty()) {
             try {
                 WebElement alertElement = wait.until(ExpectedConditions.visibilityOfElementLocated(easypaisaaccount));
                 alertElement.click();
                 System.out.println(" Account is found");
             } catch (TimeoutException e) {
                 System.out.println(" no account");
             }
         } else {
             System.out.println("Account not found please add first");
         }
     }
    
    By Paynow = By.xpath("//android.widget.Button[@resource-id=\"app.com.brd:id/component_continue\"]");

    public void paynowFuncation() {
    	 WebDriverWait wait = new WebDriverWait(driver, 3); // Reduced timeout for quick checks
         List<WebElement> alertElements = (List<WebElement>) driver.findElements(Paynow); // findElements to check presence
         if (!alertElements.isEmpty()) {
             try {
                 WebElement alertElement = wait.until(ExpectedConditions.visibilityOfElementLocated(Paynow));
                 alertElement.click();
                 System.out.println(" pay now button found");
             } catch (TimeoutException e) {
                 System.out.println("where is the button ");
             }
         } else {
             System.out.println("pay now not visible ");
         }
     }
    By dropdown = By.xpath("//android.widget.TextView[@resource-id=\"app.com.brd:id/selection_value\"]");

    public void dropdownFuncation() {
    	 WebDriverWait wait = new WebDriverWait(driver, 3); // Reduced timeout for quick checks
         List<WebElement> alertElements = (List<WebElement>) driver.findElements(dropdown); // findElements to check presence
         if (!alertElements.isEmpty()) {
             try {
                 WebElement alertElement = wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
                 alertElement.click();
                 System.out.println("dropdown button found");
             } catch (TimeoutException e) {
                 System.out.println("where is the button ");
             }
         } else {
             System.out.println(" dropdown Button not visible ");
         }
     }
    
    
    By billbutton = By.xpath("//android.widget.Button[@resource-id=\"app.com.brd:id/\" and @text=\"Bill Payment\"]");

    public void billpaymentFuncation() {
    	 WebDriverWait wait = new WebDriverWait(driver, 3); // Reduced timeout for quick checks
         List<WebElement> alertElements = (List<WebElement>) driver.findElements(billbutton); // findElements to check presence
         if (!alertElements.isEmpty()) {
             try {
                 WebElement alertElement = wait.until(ExpectedConditions.visibilityOfElementLocated(billbutton));
                 alertElement.click();
                 System.out.println("bill payment button found");
             } catch (TimeoutException e) {
                 System.out.println("where is the button ");
             }
         } else {
             System.out.println(" dropdown Button not visible ");
         }
     }
    By continuebutton = By.xpath("//android.widget.Button[@resource-id=\"app.com.brd:id/component_continue\"]");
    public void continueFuncation() {
    	 WebDriverWait wait = new WebDriverWait(driver, 5);
    	 // Reduced timeout for quick checks
         List<WebElement> alertElements = (List<WebElement>) driver.findElements(continuebutton); // findElements to check presence
         if (!alertElements.isEmpty()) {
        	 WebElement alertElement = wait.until(ExpectedConditions.visibilityOfElementLocated(continuebutton));
             alertElement.click();
        	 
         } else {
             System.out.println(" cotinue button not visible  ");
         }
     }
    By enteramount = By.xpath("//android.widget.EditText[@resource-id=\"app.com.brd:id/\" and @text=\"0\"]");
    public void amountFuncation() {
    	 WebDriverWait wait = new WebDriverWait(driver, 5);
    	 // Reduced timeout for quick checks
         List<WebElement> alertElements = (List<WebElement>) driver.findElements(enteramount); // findElements to check presence
         if (!alertElements.isEmpty()) {
        	 WebElement alertElement = wait.until(ExpectedConditions.visibilityOfElementLocated(enteramount));
        	 alertElement.sendKeys("1");
             
        	 
         } else {
             System.out.println("continue button is not available ");
         }
     }
    
}



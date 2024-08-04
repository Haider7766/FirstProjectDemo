package Web;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Url {



		    public static void main(String[] args) {
		        // Set the path to the ChromeDriver executable
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HAIDER ALI\\eclipse-workspace\\AppiumDemoProject\\chromedriver.exe");

		        // Create a new instance of the ChromeDriver
		        WebDriver driver = new ChromeDriver();

		        // Navigate to the desired URL
		        driver.get("http://ec2-52-213-96-250.eu-west-1.compute.amazonaws.com/#/auth/login");

		        driver.manage().window().maximize();
		       // driver.close();
		    }
		}
 
	



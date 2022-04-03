package BaseModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
public static WebDriver driver; //Static Object can be accessed anywhere
public static String AppUrl;	
	
	@BeforeSuite()
	public void config() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		AppUrl = "http://automationpractice.com/index.php";
	}
	
	@BeforeTest()
	public void setup() {
		driver.manage().time
	}
	
	
	
	
	
	
	
	@AfterSuite
	public void closing() {
		driver.quit();
	}
	
}

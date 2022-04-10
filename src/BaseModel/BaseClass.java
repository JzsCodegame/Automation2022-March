package BaseModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	
	public static WebDriver driver; //Static Object can be accessed anywhere
    public static String AppUrl;//Static Variable can be accessed anywhere 
    public static String Google;
	
	
    
    
    
    @BeforeSuite() //Declare The Annotations
	public void config() {  //Declare The Method
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");//Write The statements or code based on requirement
		Google = "https://www.google.com/";
		AppUrl = "http://automationpractice.com/index.php";
	}
	
	@BeforeTest()
	public void setup() {
		driver = new ChromeDriver();//ChromeDriver() is the Constructor ChromeDriver class.
		
	}
	
	@BeforeClass()
	 public void Synchronize(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicitly wait in general for 10 seconds.
	}
	
	@BeforeMethod() 
	public void BrowserConfig() {
		driver.manage().window().maximize();
	}
    
	@AfterMethod()
	public void validations(){
    	System.out.println("Validations succesfully");
    	System.out.println("Method executed succesfully");
    	
    }
	@AfterClass() 
	  public void PageValidations() {
		System.out.println("Page executed succesfully");
	}
	
	@AfterTest()
	public void BrowserClosing() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		
	}
	
	
	@AfterSuite
	public void terminate() {
		driver.quit();
	}
	
}

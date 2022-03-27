package Sprint1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class Day2 {
	WebDriver driver;//Driver is an object of Webdriver class
	@Test(priority = 0)
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://google.com");
	}
	@Test(priority = 1)
	public void start() {
		System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("http://facebook.com");
	}
}

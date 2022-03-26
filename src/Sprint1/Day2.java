package Sprint1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Day2 {
	@Test
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver;
	driver = new ChromeDriver();
	driver.get("http://google.com");
}
}
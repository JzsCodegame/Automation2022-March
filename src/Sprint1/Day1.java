package Sprint1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import BaseModel.BaseClass;

public class Day1 extends BaseClass {
	WebElement SignIn;//SignIn is an object of Selenium WebElement class
	@Test()
	public void Opening() {
		//driver.get(Google);
		driver.get(AppUrl);
		driver.findElement(By.className("login")).click();//Direct way to find and locate WebElements.
		SignIn = driver.findElement(By.className("login"));//signIn becomes WebElement variable
		SignIn.click();//using WebElement variable to click on the SignIn object or element.
	}
	
	


}

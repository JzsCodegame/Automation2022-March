package Sprint1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import BaseModel.BaseClass;


public class Day2 extends BaseClass {
	
	WebElement EmailAddress;
	WebElement CreateAnAccount;
	
	@Test()
	public void Authenficate() {
		
		driver.findElement(By.id("email_create")).sendKeys("email");
		
		driver.findElement(By.id("email_create")).clear();
		
		EmailAddress = driver.findElement(By.id("email_create"));//Email Address box
		
		EmailAddress.sendKeys("xyz2022@gmailll.com");
		
		//name = "SubmitCreate"
		
		CreateAnAccount = driver.findElement(By.name("SubmitCreate"));//WebElement Objects has executable ability when assigned as variable.
		
		CreateAnAccount.click();
		
	}
	
	
}

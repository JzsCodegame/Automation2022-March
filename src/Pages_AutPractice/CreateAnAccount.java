package Pages_AutPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAnAccount {
WebDriver Driver;
	
	@FindBy(tagName= "h3")
	WebElement Title;
	@FindBy(xpath = "//*[@id=\"id_gender1\"]")
	WebElement Mr;
	@FindBy(name = "//input[@name='firstname']")
	WebElement FirstName;
}

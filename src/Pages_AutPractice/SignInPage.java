package Pages_AutPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {
	WebDriver Driver;
	
	@FindBy(className= "login")
	WebElement login;
}

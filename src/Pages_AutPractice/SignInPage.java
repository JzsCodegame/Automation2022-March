package Pages_AutPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage { //This is the page object model for Sign In Page
	WebDriver Driver;
	
	@FindBy(className= "login")
	WebElement login;
	@FindBy(id = "email_create")
	WebElement EmailAddress;
	@FindBy(name = "SubmitCreate")
	WebElement CreateAnAccount;
}

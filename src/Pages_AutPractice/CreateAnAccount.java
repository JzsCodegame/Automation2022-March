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
	
	@FindBy(xpath = "//select[starts-with(@id, 'd')]")
	WebElement Day;// Xpath rule 5
    
	@FindBy(xpath = "//select[starts-with(@name,'mon')]")
	WebElement Month;
	
	@FindBy(xpath = "//select[starts-with(@id,'yea') and (@name ='years')]")
	WebElement Year;
	
	
}

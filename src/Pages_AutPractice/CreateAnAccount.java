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
	WebElement Month;// Xpath rule 6
	
	@FindBy(xpath = "//select[starts-with(@id,'yea') and (@name ='years')]")
	WebElement Year;// Xpath rule 7
	
	
	@FindBy(xpath = "//*[@id='optin']/preceding::input[1]")
	WebElement newsLetter;// Xpath advance rule --***preceding
	
	
	@FindBy(xpath = "//*[@id='newsletter']/following::input[1]")
	WebElement specialOffers;// Xpath advance rule --***following
	
	
	
	
	@FindBy(css = "input[id='company']")
	WebElement company;//CSS rule 1-tagname[attribute='value']
	

	
	@FindBy(css = "input#address1")
	WebElement address;//CSS rule 2-tagname#id-value
	
	
}

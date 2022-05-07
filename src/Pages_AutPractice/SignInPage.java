package Pages_AutPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage { //This is the page object model for Sign In Page
	WebDriver Driver;
	
	@FindBy(className= "login")   //We stored our Xpath as a object repo.
	WebElement SignIn;
	@FindBy(xpath = "//*[@class='is_required validate account_input form-control' and @name='email_create']")
	WebElement EmailAddress;// Xpath Rule 7
	@FindBy(xpath = "//button[contains(@type,'sub') and @id='SubmitCreate']")
	WebElement CreateAnAccount;//Xpath Rule 12
	
	public SignInPage(WebDriver driver) {//WebDriver driver is parameter inside the class constructor.
		this.Driver = driver;//This refers to SignInPage
		
		PageFactory.initElements(driver , this);//It associates the PageFactory Class with SignInPage.
		}
	//get title of form page
	public void OpenApp(String Url) { //Instance Custom Method

    	Driver.get(Url);//driver.findElement not required because of @FindBy

    }
	
    public String getmainpageTitle(){

	     return    Driver.getTitle();
 }
    
    public void clickSignIn() { //Instance Custom Method

    	SignIn.click();//driver.findElement not required because of @FindBy

    }
    
    public void EnterEmail(String email) { //Instance Custom Method

    	EmailAddress.sendKeys(email);

    }
   
    public void ClickSubmit() { //Instance Custom Method

    	CreateAnAccount.click();

    }
    
    public void openSignup(String Url,String email) {

        //Fill Fill Email name
    	this.OpenApp(Url);
    	this.getmainpageTitle();
    	this.clickSignIn();
    	this.EnterEmail(email);
    	this.ClickSubmit();
        
         
    }
	
}

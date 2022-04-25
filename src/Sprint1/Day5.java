package Sprint1;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.testng.annotations.Test;

import BaseModel.BaseClass;
import Pages_AutPractice.SignInPage;

public class Day5 extends BaseClass {

	
	@Test(priority = 5)
	public void signin() {
		SignInPage X;
		X = new SignInPage(driver);
		driver.get(AppUrl);
		X.openSignup("xyz2022@gmailll.com");
	}
}

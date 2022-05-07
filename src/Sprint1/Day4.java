package Sprint1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseModel.BaseClass;

public class Day4 extends BaseClass  {

	WebElement Day;
	
	WebElement Month;
	
	WebElement Year;
	
	Select input;
	
	 
	
	@Test(priority = 4)
	public void CreateAccount2() {
		
		//DropDowns Practice
		
		
		//select[contains(@id,'days')] -- Xpath Rule 3
		
		Day = driver.findElement(By.xpath("//select[contains(@id,'days')]"));
		
		input = new Select(Day); //Select() expects a variable parameter or WebElement.
		
		input.selectByIndex(1);
		
		String actual = Day.getAttribute("value");
		
		String expected = "1";
		
		
		
		Assert.assertEquals(actual, expected);
	
		System.out.println(actual+" & "+expected);
		
		
		//tagname[starts-with(@attribute,'value')]-- Xpath Rule 4

		Month = driver.findElement(By.xpath("//select[starts-with(@name,'mon')]"));
		
		input = new Select(Month);
		
		input.selectByValue("4");
		
		actual = Month.getAttribute("value");
		
		expected = "4";
		
		Assert.assertEquals(actual, expected);
		
		
		System.out.println(actual+" & "+expected);
		
		
		
		//tagname[starts-with(@attribute,'value') and (@attribute,'value')] -- Xpath Rule 5
		
		Year = driver.findElement(By.xpath("//select[starts-with(@id,'yea') and (@name ='years')]"));
		
		//Year = Ex.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[starts-with(@name,'mon')]")))
		
		input = new Select(Year);
		
		input.selectByVisibleText("2019  ");
	
		actual = input.getFirstSelectedOption().getText();
		
		expected = "2019  ";
         
		Assert.assertEquals(actual, expected);
		
		System.out.println(actual+" & "+expected);
	}
	
}

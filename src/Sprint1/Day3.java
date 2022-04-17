package Sprint1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseModel.BaseClass;
import PracticeClass.Student;
import PracticeClass.Vehicle;

public class Day3 extends BaseClass  {
WebElement Title;
WebElement Mr;
WebElement FirstName;
	@Test(priority = 3)
	public void CreateAccount() {
		
		Title = driver.findElement(By.tagName("h3"));
		Title = Ex.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h3")));
		System.out.println("Title is displayed"+" "+Title.isDisplayed());
		System.out.println(Title.getTagName());
		
		Mr = driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
	    Mr = Ex.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"id_gender1\"]")));
		Mr.click();
		System.out.println("Mr is selected"+" "+Mr.isSelected());
	
		//	/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[1]/input - Example of Absolute Xpath.
		//tagname[@attribute='value'] - Xpath Rule #1 template
		FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		FirstName = Ex.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='firstname']")));
		System.out.println("FirstName is selected"+" "+FirstName.isEnabled());
		
		FirstName.click();
		FirstName.sendKeys("Javid");
		String NameValue = driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
	    Assert.assertEquals("Javid" , NameValue);//Assert will not print any results but if fails then code will stop in this line
	    System.out.println(NameValue+" "+"Assert passed");
	}
	}



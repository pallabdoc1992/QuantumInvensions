package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.base.TestBase;
import com.qa.data.DataProvider;


public class Home extends TestBase{
	
		
	@FindBy (xpath = "//title")
	WebElement txtTitle;
	
	@FindBy (id = "hplogo")
	WebElement imgLogo;
	
	@FindBy (xpath = "//input[@title='Search']")
	WebElement txtSearchBox;
	
	@FindBy (xpath = "//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")
	WebElement btnSearch;
	
	public Home() {
		PageFactory.initElements(driver, this);
	}
	
	public void searchGoogle(DataProvider dp, String TestCaseName) {
		
		Assert.assertEquals(imgLogo.isDisplayed(), true);
		txtSearchBox.sendKeys(dp.getData(TestCaseName, "Search"));
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		btnSearch.click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
	

}

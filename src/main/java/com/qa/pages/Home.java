package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.base.TestBase;
import com.qa.data.DataProvider;

public class Home extends TestBase{
	
	DataProvider dp = new DataProvider();
	
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
	
	public void searchGoogle(String searchValue) {
		
		Assert.assertEquals("Google", txtTitle.getText());
		Assert.assertEquals(true, imgLogo.isDisplayed());
		txtSearchBox.sendKeys(searchValue);
		btnSearch.click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}

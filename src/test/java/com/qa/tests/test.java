package com.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.data.DataProvider;
import com.qa.pages.Home;

public class test extends TestBase{
	
	DataProvider dp = new DataProvider();
	Home agent = new Home();
	
	public test() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		TestBase.initDriver();
	}

	@Test
	public void Run() {
		agent.searchGoogle(dp.getData("test", "Search"));
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}

}

package com.qa.tests;

import com.qa.ignition.TestCase;
import com.qa.pages.GoogleHome;

public class Test1 extends TestCase{

	@Override
	public void Test() {
		
		driver.get(prop.getProperty("url"));
		GoogleHome agent = new GoogleHome();
		System.out.println(dp.getData("Test1", "Search"));
		agent.searchGoogle(dp, "Test1");
	}
	

}

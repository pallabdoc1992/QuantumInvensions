package com.qa.tests;

import com.qa.ignition.TestCase;
import com.qa.pages.GoogleHome;

public class Test5 extends TestCase{

	@Override
	public void Test() {
		
		driver.get(prop.getProperty("url_2"));
		GoogleHome agent = new GoogleHome();
		System.out.println(dp.getData("Test5", "Search"));
		agent.searchGoogle(dp,"Test5");
	}
	

}

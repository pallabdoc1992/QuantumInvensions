package com.qa.tests;

import com.qa.ignition.TestCase;
import com.qa.pages.Home;

public class Test4 extends TestCase{

	@Override
	public void Test() {
		
		Home agent = new Home();
		System.out.println(dp.getData("Test4", "Search"));
		agent.searchGoogle(dp,"Test4");
	}
	

}

package com.qa.tests;

import com.qa.ignition.TestCase;
import com.qa.pages.Home;

public class Test2 extends TestCase{

	@Override
	public void Test() {
		
		Home agent = new Home();
		System.out.println(dp.getData("Test2", "Search"));
		agent.searchGoogle(dp,"Test2");
	}
	

}
package com.qa.tests;

import com.qa.ignition.TestCase;
import com.qa.pages.Home;

public class Test1 extends TestCase{

	@Override
	public void Test() {
		
		Home agent = new Home();
		System.out.println(dp.getData("Test1", "Search"));
		agent.searchGoogle(dp, "Test1");
	}
	

}

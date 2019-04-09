package com.qa.tests;

import com.qa.ignition.TestCase;
import com.qa.pages.Home;

public class test extends TestCase{

	@Override
	public void Test() {
		
		Home agent = new Home();
		System.out.println(dp.getData("test", "Search"));
		agent.searchGoogle(dp);
	}
	

}

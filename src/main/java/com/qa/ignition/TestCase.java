package com.qa.ignition;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

public abstract class TestCase extends TestBase{
	
	public TestCase() {
		super();
	}
	
	@BeforeTest
	public void Start(){
		TestBase.initDriver();
	}

	@Test
	public abstract void Test();

	
	@AfterTest
	public void End(){
		driver.close();
	}
	
	
	
	
	
	

}

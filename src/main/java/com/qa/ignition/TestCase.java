package com.qa.ignition;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

public abstract class TestCase extends TestBase{
	
	public TestCase() {
		super();
	}
	
	@BeforeClass
	public void Start(){
		TestBase.initDriver();
	}

	@Test
	public abstract void Test();

	
	@AfterClass
	public void End(){
		driver.close();
	}
	
	
	
	
	
	

}

package com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class TestBase {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase() {

		try {
			prop = new Properties();
			File src = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\config\\config.properties");
			FileInputStream input = new FileInputStream(src);
			prop.load(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void initDriver() {
		
		if (prop.getProperty("browser").equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\libs\\chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(prop.getProperty("url"));
			
		}else if (prop.getProperty("browser").equalsIgnoreCase("FireFox")) {
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\libs\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(prop.getProperty("url"));
			
		}
		
	}
	
	
	
	
	

}

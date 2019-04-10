package com.qa.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.base.TestBase;

public class ScreenPrints extends TestBase {
	
	
	public static void captureScreenShot() {
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		
		File source = screen.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(source, new File("./ScreenShots/"+unquiName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static File unquiName() {
		
		String fileName = "Screen.png";
		String extension = "";
		String name = "";
		File f = null;

		int idxOfDot = fileName.lastIndexOf('.'); // Get the last index of . to separate extension
		extension = fileName.substring(idxOfDot + 1);
		name = fileName.substring(0, idxOfDot);

		for (int i = 1; i <= 500; i++) {

			Path path = Paths.get("./ScreenShots/Screen_" + i + ".png");

			if (Files.notExists(path)) {
				fileName = name + "_" + i + "." + extension;
				f = new File(fileName);
				break;
			}

		}
		return f;
	}
	
	

}

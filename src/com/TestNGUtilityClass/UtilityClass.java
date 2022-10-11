package com.TestNGUtilityClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	public static void Screenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot t = (TakesScreenshot)driver;
		File sourceFile = t.getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMYYYY_HHmmss");
		String timestamp = sdf.format(d);
		File destFile = new File ("D:\\TakesScreenshots\\page"+timestamp+".jpg");
		FileHandler.copy(sourceFile, destFile);
		
	}

}

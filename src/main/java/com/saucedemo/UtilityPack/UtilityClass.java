package com.saucedemo.UtilityPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass
{
	public static void getScreenshot(WebDriver driver,String name) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;		
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);     //byte format		
		File destFile = new File("C:\\Users\\Lenovo\\eclipse-workspace\\ASauceDemo1\\ScreenShots\\"+name+".jpg");		
		FileHandler.copy(sourceFile, destFile);
	}


}

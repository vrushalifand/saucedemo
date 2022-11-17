package com.saucedemo.TestPack;

import org.testng.annotations.Test;

import com.saucedemo.UtilityPack.UtilityClass;

import org.testng.AssertJUnit;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_VerifyLoginFunctionality extends Test_Base_Class
{
	@Test
	public void verifyLogin() throws IOException 
	 {
		//take screenshot of login page
		UtilityClass.getScreenshot(driver,"loginPage-3nov");
		
		//validation
		log.info("Apply validation in testng using hard assertion");		
		String expectedTitle = "Swag Labs";   //BA/dev		
		String actaulTitle =driver.getTitle();
		
		log.info("actaulTitle-"+actaulTitle);
		
		//hard assertion
		Assert.assertEquals(actaulTitle, expectedTitle);

	}
}

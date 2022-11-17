package com.saucedemo.TestPack;

import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePOMClass;
import com.saucedemo.UtilityPack.UtilityClass;

import org.testng.AssertJUnit;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//import POM.LoginPOMclass;

public class TC02_VerifyLogOutFunctionality extends Test_Base_Class 
{
	@Test
	public void verifyLogout() throws IOException 
	{
		//take screenshot of homePage
		UtilityClass.getScreenshot(driver, "homePage-TB");

		HomePOMClass hp=new HomePOMClass(driver);
		hp.clickOnMenuButton();
		log.info("Clicked on menu Button");
		
		hp.clickOnLogOutButton();
		log.info("Clicked on logOut Button");
		
		//loginPage
		log.info("Went on LoginPage");

		//validation
		log.info("Apply validation");		
		String expectedTitle = "Swag Labs";   //BA/dev		
		String actaulTitle =driver.getTitle();
		log.info("actaulTitle-"+actaulTitle);
		
		//hard assertion
		Assert.assertEquals(actaulTitle, expectedTitle);

	
	}

}

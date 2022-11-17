package com.saucedemo.TestPack;

import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePOMClass;

import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03_Verify_BagProduct_AddToCart_Functionality extends Test_Base_Class 
{
	@Test
	public void verifyBagProductAddToCart() 
	{
		HomePOMClass hp = new HomePOMClass(driver);
		hp.clickAddToCartBagButton();
		log.info("Bag Product is selected");
		
		//validation
		log.info("Apply Validation");
		
		String exepctedProductCount = "1";	
		String actualProductCount = hp.getTextOfAddToCartButton();
		log.info("actualProductCount-"+actualProductCount);
	
      	//hard assertion
        Assert.assertEquals(actualProductCount, exepctedProductCount);
    
	}
}

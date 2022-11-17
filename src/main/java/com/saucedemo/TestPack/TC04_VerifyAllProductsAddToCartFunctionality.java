package com.saucedemo.TestPack;

import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePOMClass;

import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC04_VerifyAllProductsAddToCartFunctionality extends Test_Base_Class
{
	@Test
	public void verifyAllProductsAddToCart()
	{
		//all products select
		HomePOMClass hp = new HomePOMClass(driver);
		hp.clickAllProducts();
		log.info("All products will be get selected");
				
		//validation
		log.info("Apply Validation");
						
		String exepctedProductCount = "6";	
		String actualProductCount = hp.getTextOfAddToCartButton();
		log.info("total products selected are->"+actualProductCount);
		
		//hard assertion
	    Assert.assertEquals(actualProductCount, exepctedProductCount);
		 	
}
}

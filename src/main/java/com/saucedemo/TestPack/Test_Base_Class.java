package com.saucedemo.TestPack;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.saucedemo.POMPack.LoginPOMClass;
import com.saucedemo.UtilityPack.UtilityClass;

public class Test_Base_Class 
{
   WebDriver driver;
   
   Logger log= Logger.getLogger("ASauceDemo1");
   
    @Parameters("browserName") 
	@BeforeMethod
	public void setUp(String browserName) throws IOException
	{
		if(browserName.equals("chrome"))
		{
			 System.setProperty("webdriver.chrome.driver", 
				//		"D:\\vrushali\\chromedriver_win32 (1)\\chromedriver.exe");	
			 "C:\\Users\\Lenovo\\eclipse-workspace\\ASauceDemo1\\DriverFile\\chromedriver.exe");		
		    driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{	    
		    System.setProperty("webdriver.gecko.driver", 
					"C:\\Users\\Lenovo\\eclipse-workspace\\Automation\\DriverFile\\geckodriver.exe");	
		    driver = new FirefoxDriver();
		}
		else 
		{
		  System.out.println("throw error");	
		}
		
		PropertyConfigurator.configure("log4j.properties");
		log.info("Browser is opened");
		
//    @BeforeMethod
//	public void setUp() throws IOException
//	{
//          System.setProperty("webdriver.chrome.driver", 
//					"D:\\vrushali\\chromedriver_win32 (1)\\chromedriver.exe");			
//	      driver = new ChromeDriver();
		
	
	
	driver.manage().window().maximize();
	log.info("Browser is maximzed");
	
	driver.get("https://www.saucedemo.com/");
	log.info("Url is opened");
	log.info("Went on LoginPage");
	
	//take screenshot
	UtilityClass.getScreenshot(driver, "loginPage-TB");
	
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	//loginActivity
	LoginPOMClass lp = new LoginPOMClass(driver);
	lp.sendUsername();
	log.info("Username is entered");
	
	lp.sendPassword();
	log.info("Password is entered");
	
	lp.clickLoginButton();
	log.info("Clicked on login Button");
	
	//homePage
	log.info("Went on HomePage");
}

   @AfterMethod
   public void tearDown()
  {	
	driver.quit();
	log.info("browser is closed");
  }

   
}

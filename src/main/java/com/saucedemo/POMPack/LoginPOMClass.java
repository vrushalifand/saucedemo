package com.saucedemo.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass
{
	//webelement and actions on them maintain
	//1.WebDriver declare
		private WebDriver driver;
		private Actions act;
		
		//2.ele find
//		WebElement username= driver.findElement(By.xpath("xpath"));
//		@FindBy --->start @ -->annoatation
//		its like a method only
		
		@FindBy(xpath ="//input[@id='user-name']")
		private WebElement userName;
		//3.Action of ele
		public void sendUsername()
		{
			userName.sendKeys("standard_user");
		}
		
		@FindBy(xpath ="//input[@id='password']")
		private WebElement password;
		
		public void sendPassword()
		{
			password.sendKeys("secret_sauce");
		}
		
		
		@FindBy(xpath ="//input[@id='login-button']")
		private WebElement loginButton;
		
		//click method-webElement interface
//		public void clickLoginButton()
//		{
//			loginButton.click();
//		}
		
		//click method-mouse action
		public void clickLoginButton()
		{
			act.click(loginButton).perform();
		}
		
		//4.Const declared
		public LoginPOMClass(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver,this);
			act = new Actions(driver);
		}
		
		
		//POM Steps
		//1.WebDriver declare
		//2.@FindBY ele find
		//3.method-Ele actions
		//4.const declare

}

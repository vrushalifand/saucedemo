package com.saucedemo.POMPack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMClass 
{
	//POM Steps
	//1.WebDriver declare
	//2.@FindBY ele find
	//3.method-Ele actions
	//4.const declare
		
	private WebDriver driver;
	private Select s;
		
	//click menuBtn
	@FindBy(xpath ="//button[@id='react-burger-menu-btn']")
	private WebElement menuButton;
		
	public void clickOnMenuButton()
	{
		menuButton.click();
	}

	//click logOutBtn
	@FindBy(xpath ="//a[@id='logout_sidebar_link']")
	private WebElement logOutButton;
		
	public void clickOnLogOutButton()
	{
		logOutButton.click();
	}
		
	//bagEle
	@FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement bagProduct;
		
	public void clickAddToCartBagButton()
	{
		bagProduct.click();;
	}
		
	//add to cart ele
	@FindBy(xpath ="//a[@class='shopping_cart_link']")
	private WebElement addToCartLink;
		
	public String getTextOfAddToCartButton()
	{
    	String actualCount= addToCartLink.getText();
		return actualCount;
	}
		
		//all product ele
		@FindBy(xpath ="//button[text()='Add to cart']")
		private List<WebElement> allProducts;
		
		public void clickAllProducts()
		{
		    //assignment-->use for each loop
			
			for(int i=0; i<allProducts.size();i++)
			{
				allProducts.get(i).click();
			}		
		}
		
		
		
	    public HomePOMClass(WebDriver driver)
	    {
	    	this.driver = driver;
	    	PageFactory.initElements(driver, this);
	    	s = new Select(filterDropDown);
	    }
		
		//filter dropdown
	    @FindBy(xpath ="//select[@class='product_sort_container']")
		private WebElement filterDropDown;
	    
	    public void clickFilterDropDown()
	    {
	    	filterDropDown.click();
	    	s.selectByValue("az");    	
	    }
		
}

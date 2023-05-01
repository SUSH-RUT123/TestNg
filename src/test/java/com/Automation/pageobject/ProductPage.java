package com.Automation.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage 

{
	WebDriver ldriver;
	public ProductPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@id=\"search_product\"]")
	private WebElement SearchBar;
	
	@FindBy(xpath="//button[@id=\"submit_search\"]")
	private WebElement Submit_Search;
	
	@FindBy(xpath="(//div[@class=\"productinfo text-center\"])[3]")
	private WebElement T_shirt_img;
	
    @FindBy(xpath="//a[text()=\"Add to cart\"]")
    private WebElement Add_To_Cart;
    
    public void enterSearchbar(String text)
    {
    	SearchBar.sendKeys(text);
    }
    
    public void enterSubmitSearch()
    {
    	Submit_Search.click();
    }
    
    public void moveToImg()
    {
    	Actions act=new Actions(ldriver);
    	act.moveToElement(T_shirt_img);
    }
    
    public void ClickonAddtocart()
    {
    	Add_To_Cart.click();
    }
}

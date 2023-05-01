package com.Automation.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver ldriver;
	
	public HomePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[text()=\" Signup / Login\"]")
	private WebElement LoginLink;
	
	@FindBy(xpath="//a[@data-qa=\"continue-button\"]")
	private WebElement Continuebtn;
	
	@FindBy(xpath="//a[text()=\" Delete Account\"]")
	private WebElement Delete;
	
	public void ClickonLogin()
	{
		LoginLink.click();
	}
	
	public void ClickContinue()
	{
		Continuebtn.click();
	}
	
	public void DeleteAcc()
	{
		Delete.click();
	}

}

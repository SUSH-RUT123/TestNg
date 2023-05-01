package com.Automation.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage

{
	WebDriver ldriver;
	
	public ContactUsPage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver, this);
	}

}

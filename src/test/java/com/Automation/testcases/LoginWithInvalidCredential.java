package com.Automation.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Automation.pageobject.HomePage;
import com.Automation.pageobject.LoginPage;

public class LoginWithInvalidCredential extends BaseClass

{
	HomePage home;
	LoginPage login;
	

	@BeforeClass
	public void openbrowser()
	{
		initializebrowser();
		home=new HomePage(driver);
		login=new LoginPage(driver);
	}
	
	@Test
	public void InvalidCredential()
	{
		home.ClickonLogin();
		login.enterloginUserName("sushrutparab1996@gmail.com");
		login.EnterInvalidPassword();
		login.clickLogin();
	}
	
	@Test
	public void VerifyErrorMessage()
	{
		String Errmsgact="Your email or password is incorrect!";
        String s="Your email or password is incorrect!";
			
		Assert.assertEquals(Errmsgact, s);
	}
	
	

	
}

package com.Automation.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Automation.pageobject.HomePage;
import com.Automation.pageobject.LoginPage;

public class LoginTestCase extends BaseClass

{
    HomePage home;
    LoginPage login;
    
    @BeforeClass
    public void openbrowser()
    {
    	initializebrowser();
    	log.info("Url open");
    	home=new HomePage(driver);
    	login=new LoginPage(driver);
    }
    
    @Test
    public void logintoAcc()
    {
    	home.ClickonLogin();
    	login.enterloginPassword("Ssp@12345");
    	login.enterloginUserName("sushrutparab1996@gmail.com");
    	login.clickLogin();
    }
    
}

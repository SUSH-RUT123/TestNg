package com.Automation.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Automation.pageobject.HomePage;
import com.Automation.pageobject.LoginPage;
import com.Automation.pageobject.SignUpPage;

public class SignUpTestCase extends BaseClass

{
	
	   HomePage home;
       LoginPage login;
       SignUpPage SignUp;
       
       @BeforeClass
       public void openbrowser()
       {
    	   initializebrowser();
    	   log.info("Url Open");
    	   home=new HomePage(driver);
    	   login=new LoginPage(driver);
    	   SignUp=new SignUpPage(driver); 
  
       }
       
       @BeforeMethod
       public void validuserSignup()
       {
    	   
    	   home.ClickonLogin();
    	   login.enterSignUpName("Sushrut");
    	   login.enterSignUpemail("parab.sushrut.123@gmail.com");
    	   login.clickSignUp();
    	   log.info("Sign Up");
       }
       
       @Test
       public void AddSignUpInfo()
       {
    	   SignUp.ClickonTitle();
    	   SignUp.EnterPassword("Ssp@12345");
    	   SignUp.ClickSignNewsletter();
    	   SignUp.ClickReciveCheckbox();
    	   SignUp.EnterFirstName("Sushrut");
    	   SignUp.EnterLastName("Parab");
    	   SignUp.EnterbirthDay("21");
    	   SignUp.EnterbirthMonth("October");
    	   SignUp.EnterbirthYear("1996");
    	   SignUp.EnterCompany("NONE");
    	   SignUp.EnterAddress1("Warje");
    	   SignUp.EnterAdress2("Pune");
    	   SignUp.EnterCity("Pune");
    	   
    	   SignUp.EnterZipCode();
    	   SignUp.EnterStat("Maharashtra");
    	   SignUp.EnterMobileNumber("9422207133");
    	   SignUp.ClickOnCreateAcc();
    	   log.info("Sign Up Successfully");
    	   
    	
       }
       
       @AfterMethod
       public void DeleteAccount()
       {
    	   home.ClickContinue();
    	   home.DeleteAcc();
    	   log.info("Delete Successful");
       }
       
       @AfterClass
       public void CloseBrowser()
       {
    	   driver.close();
       }
}

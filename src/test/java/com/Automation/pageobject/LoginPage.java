package com.Automation.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.testcases.LoginTestCase;

public class LoginPage 

{
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@data-qa=\"login-email\"]")
	private WebElement loginEmail;
	
	@FindBy(xpath="//input[@data-qa=\"login-password\"]")
	private WebElement loginPassword;
	
	@FindBy(xpath="//button[@data-qa=\"login-button\"]")
	private WebElement LoginIntoAcc;
	
	@FindBy(xpath="//input[@data-qa=\"signup-name\"]")
	private WebElement SignUpName;
	
	@FindBy(xpath="//input[@data-qa=\"signup-email\"]")
	private WebElement SignUpEmail;
	
	@FindBy(xpath="//button[@data-qa=\"signup-button\"]")
	private WebElement SignUpBtn;
	
	@FindBy(xpath="//p[text()=\"Your email or password is incorrect!\"]")
	private WebElement GetLoginErrormsg;
	
	
	
    public void verifyErrormsg()
    {
	 System.out.println(GetLoginErrormsg.getText());
    }
    
	public void enterloginUserName(String Loginmail)
	{
		loginEmail.sendKeys(Loginmail);
	}
	
	public void enterloginPassword(String PasswordLogin)
	{
		loginPassword.sendKeys(PasswordLogin);
	}

	public void clickLogin()
	{
		LoginIntoAcc.click();
	}
	
	public void enterSignUpName(String SignName)
	{
		SignUpName.sendKeys(SignName);
	}
	
	public void enterSignUpemail(String Email)
	{
		SignUpEmail.sendKeys(Email);
	}
	
	public void clickSignUp()
	{
		SignUpBtn.click();
	}
	
	public void EnterInvalidUser()
	{
		loginEmail.sendKeys("Sususuh");
	}
	
	public void EnterInvalidPassword()
	{
		loginPassword.sendKeys("Sdodofp");
	}
}

package com.Automation.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage 

{
	
	WebDriver ldriver;
	
	public SignUpPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@id=\"id_gender1\"]")
	private WebElement TitleMr;
	
	@FindBy(xpath="//input[@id=\"id_gender2\"]")
	private WebElement TitleMrs;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	private WebElement Password;
	
	@FindBy(xpath="//input[@id=\"newsletter\"]")
	private WebElement NewsletterCheckbox;
	
	@FindBy(xpath="//input[@id=\"optin\"]")
	private WebElement ReciveCheckbox;
	
	@FindBy(xpath="//input[@id=\"first_name\"]")
	private WebElement FirstName;
	
	@FindBy(xpath="//input[@id=\"last_name\"]")
	private WebElement LastName;
	
	@FindBy(xpath="//input[@id=\"company\"]")
	private WebElement Company;
	
	@FindBy(xpath="//input[@id=\"address1\"]")
	private WebElement Address;
	
	@FindBy(xpath="//input[@id=\"address2\"]")
	private WebElement Address2 ;
	
	@FindBy(xpath="//input[@id=\"state\"]")
	private WebElement State ;
	
	@FindBy(xpath="//input[@id=\"city\"]")
	private WebElement City;
	
	@FindBy(xpath="//input[@id=\"zipcode\"]")
	private WebElement ZipCode;
	
	@FindBy(xpath="//input[@id=\"mobile_number\"]")
	private WebElement MobileNumber;
	
	@FindBy(xpath="//button[@data-qa=\"create-account\"]")
	private WebElement CreatAccBtn;
	
	@FindBy(xpath="//select[@id=\"days\"]")
	private WebElement DayDrpDwn;
	
	@FindBy(xpath="//select[@id=\"months\"]")
	private WebElement MonthDrpDown;
	
	@FindBy(xpath="//select[@id=\"years\"]")
	private WebElement YearDrpDown;
	
	public void ClickonTitle()
	{
		TitleMr.click();
	}
	
	public void EnterPassword(String SignUpPassword)
	{
		Password.sendKeys(SignUpPassword);
	}
	
	public void ClickSignNewsletter()
	{
		NewsletterCheckbox.click();
	}
	
	public void ClickReciveCheckbox()
	{
		ReciveCheckbox.click();
	}
	
	public void EnterFirstName(String FirstNameSignUp)
	{
		FirstName.sendKeys(FirstNameSignUp);
	}
	
	public void EnterLastName(String LastNameSignUp)
	{
		LastName.sendKeys(LastNameSignUp);
	}
	
	public void EnterCompany(String Company1)
	{
		Company.sendKeys(Company1);
	}
	
	public void EnterAddress1(String Address1)
	{
		Address.sendKeys(Address1);
	}
	
	public void EnterAdress2(String Address)
	{
		Address2.sendKeys(Address);
		
	}

	public void EnterStat(String State1)
	{
	   State.sendKeys(State1);	
	}
	
	public void EnterCity(String City1)
	{
		City.sendKeys(City1);
	}
	
	public void EnterZipCode()
	{
		ZipCode.sendKeys("416606");
	}
	
	public void EnterMobileNumber(String MobNo)
	{
		MobileNumber.sendKeys(MobNo);
	}
	
	public void ClickOnCreateAcc()
	{
		CreatAccBtn.click();
	}
	
	public void EnterbirthDay(String Day)
	{
		Select day=new Select(DayDrpDwn);
		day.selectByValue(Day);
	}
	
	public void EnterbirthMonth(String Month)
	{
		Select month=new Select(MonthDrpDown);
		month.selectByVisibleText(Month);
	}
	
	public void EnterbirthYear(String Year)
	{
		Select year=new Select(YearDrpDown);
		year.selectByValue(Year);
	}
	
	
	
}

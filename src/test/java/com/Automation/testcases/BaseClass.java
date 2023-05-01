package com.Automation.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.apache.logging.log4j.*;
import com.Automation.utilities.ReadConfig;

public class BaseClass

{
	public WebDriver driver;
	ReadConfig read=new ReadConfig();

	String url=read.getBaseURl();
	String browser1=read.getBrowser();
	
	public static Logger log;
	

	public void initializebrowser()
	{
		
		
		if(browser1.equals("chrome"))
		{
			ChromeOptions co=new ChromeOptions();	
			co.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(co);
			
		}
		
		else if(browser1.equals("firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		
		else if(browser1.equals("edge"))
		{
			driver=new EdgeDriver();
			
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get(url);
		log=LogManager.getLogger("TestNgProject");
		
	}


	public void teardown()
	{
		driver.quit();
		
	}
}

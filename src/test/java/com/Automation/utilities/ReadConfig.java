package com.Automation.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadConfig 

{
	Properties pro;
	
	String path="C:\\Users\\Lenovo\\eclipse-workspace\\TestNgProject\\Configuration\\config.properties";
	
	public ReadConfig() 
	{
		pro=new Properties();
		try {
			FileInputStream file=new FileInputStream(path);
			pro.load(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public String getBaseURl()
	{
		String value=pro.getProperty("baseUrl");
		if(value!=null)
			return value;
			else
				throw new RuntimeException("URL not Specified");
	}
	
	public String getBrowser()
	{
		String value1=pro.getProperty("browser");
		if(value1!=null)
			return value1;
			else
				throw new RuntimeException("Browser not Specified");
	}

	
}

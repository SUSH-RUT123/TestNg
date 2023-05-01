package com.Automation.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportClass

{
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	public void StartReport()
	{
		htmlReporter=new ExtentSparkReporter("com.Automation.utilities");
		reports=new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		//add Enviroment Detail
		reports.setSystemInfo("Machine", "Lenovo");
		reports.setSystemInfo("Broser", "Chrome");
		
		//configuration for look and fill
		htmlReporter.config().setDocumentTitle("Extent Report Demo");
		htmlReporter.config().setTheme(Theme.DARK);
	}

}

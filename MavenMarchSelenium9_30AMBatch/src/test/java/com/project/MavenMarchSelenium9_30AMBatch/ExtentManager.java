package com.project.MavenMarchSelenium9_30AMBatch;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager extends BaseTest
{
	
	public static ExtentReports report;
	
	public static ExtentReports getInstane()
	{
		if(report==null)
		{
			report = new ExtentReports(projectPath+"//HtmlReports//report.html");
			report.loadConfig(new File(projectPath +"//extentreportconfig.xml"));
			report.addSystemInfo("Selenium language Binding", "3.141.59").addSystemInfo("Environment",parentProp.getProperty("env"));
		}
		
		return report;
	}

}

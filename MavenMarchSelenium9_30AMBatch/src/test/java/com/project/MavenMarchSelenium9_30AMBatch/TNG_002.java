package com.project.MavenMarchSelenium9_30AMBatch;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;

public class TNG_002 extends BaseTest
{
	  
  @BeforeMethod(groups = {"regression","sanity"})
  @Parameters("browser")
  public void startProcess(String bType) throws Exception
  {
	  System.out.println("iam beforemethod....");
	  	init();
		test = report.startTest("TNG_002");
		test.log(LogStatus.INFO, "Init the Properties files.....");
		
		browserLaunch(bType);
		test.log(LogStatus.INFO, "Opened the browser :-" + p.getProperty("chromebrowser"));
		
		navigate("amazonurl");
		test.log(LogStatus.INFO, "Navigated to url :-" + childProp.getProperty("amazonurl"));
		
		maximizeWindow();
  }
  
  @Test(groups = {"regression","sanity"})
  public void amazon() 
  {
	 
	  System.out.println("iam amazon testmethod....");
	    selectOption("amazondropdown_id","Books");
		test.log(LogStatus.PASS, "Selected the option Books by using locaotr :- "+ orProp.getProperty("amazondropdown_id"));
		
		typeText("amazontextbox_id","Harry Potter");
		test.log(LogStatus.FAIL, "Entered the Harry Potter by using the locator :- "+ orProp.getProperty("amazontextbox_id"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(LogStatus.INFO, "Clicked on Amazon search button By using locator :-" + orProp.getProperty("amazonsearchbutton_xpath"));
		
		 //throw new SkipException("Test is skipped....");
  }

  @AfterMethod(groups = {"regression","sanity"})
  public void endProcess() 
  {
	  System.out.println("iam aftermethod....");
	    driver.quit();
	    
	    report.endTest(test);
		report.flush();
  }

}

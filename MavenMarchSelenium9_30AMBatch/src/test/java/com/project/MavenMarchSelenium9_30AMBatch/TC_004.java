package com.project.MavenMarchSelenium9_30AMBatch;

import com.relevantcodes.extentreports.LogStatus;

public class TC_004 extends BaseTest 
{
	

	public static void main(String[] args) throws Exception
	{
		
		init();
		test = report.startTest("TC_004");
		test.log(LogStatus.INFO, "Init the Properties files.....");
		
		browserLaunch("chromebrowser");
		test.log(LogStatus.INFO, "Opened the browser :-" + p.getProperty("chromebrowser"));
		
		navigate("amazonurl");
		test.log(LogStatus.INFO, "Navigated to url :-" + childProp.getProperty("amazonurl"));
		
		maximizeWindow();
		
		selectOption("amazondropdown_id","Books");
		test.log(LogStatus.PASS, "Selected the option Books by using locaotr :- "+ orProp.getProperty("amazondropdown_id"));
		
		typeText("amazontextbox_id","Harry Potter");
		test.log(LogStatus.FAIL, "Entered the Harry Potter by using the locator :- "+ orProp.getProperty("amazontextbox_id"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(LogStatus.INFO, "Clicked on Amazon search button By using locator :-" + orProp.getProperty("amazonsearchbutton_xpath"));
		
		report.endTest(test);
		report.flush();
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		//loc.sendKeys("Books");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		
	}

	

}

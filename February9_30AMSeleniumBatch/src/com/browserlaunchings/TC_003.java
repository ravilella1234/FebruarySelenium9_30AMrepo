package com.browserlaunchings;

import org.apache.log4j.Logger;

public class TC_003 extends BaseTest 
{
	
	private static final Logger log = Logger.getLogger(TC_003.class);

	public static void main(String[] args) throws Exception
	{
		init();
		log.info("Init the Properties files.....");
		
		browserLaunch("chromebrowser");
		log.info("Opened the browser :-" + p.getProperty("chromebrowser"));
		
		navigate("amazonurl");
		log.info("Navigated to url :-" + childProp.getProperty("amazonurl"));
		
		maximizeWindow();
		
		selectOption("amazondropdown_id","Books");
		log.info("Selected the option Books by using locaotr :- "+ orProp.getProperty("amazondropdown_id"));
		
		typeText("amazontextbox_id","Harry Potter");
		log.info("Entered the Harry Potter by using the locator :- "+ orProp.getProperty("amazontextbox_id"));
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked on Amazon search button By using locator :-" + orProp.getProperty("amazonsearchbutton_xpath"));
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		//loc.sendKeys("Books");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		
	}

	

}

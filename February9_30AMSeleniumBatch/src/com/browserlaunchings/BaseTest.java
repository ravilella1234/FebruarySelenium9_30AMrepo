package com.browserlaunchings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	public static WebDriver driver;
	
	public static void browserLaunch(String browser)
	{
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
	}
	
	public static void navigate(String url)
	{
		driver.get(url);
	}
	
	public static void windowClose() 
	{
		driver.quit();
	}

	public static void windowRefresh() 
	{
		driver.navigate().refresh();
	}

	public static void windowForward() 
	{
		driver.navigate().forward();
	}

	public static void windowBack() 
	{
		driver.navigate().back();
	}

	public static void deleteCookies() 
	{
		driver.manage().deleteAllCookies();
	}

	public static String windowCurrentUrl() 
	{
		String url = driver.getCurrentUrl();
		return url;
	}

	public static String windowTitle() 
	{
		String title = driver.getTitle();
		return title;
	}

	public static void maximizeWindow()
	{
		driver.manage().window().maximize();
	}
	
	public static void wait(int milliSeconds) throws Exception
	{
		Thread.sleep(milliSeconds);
	}


}

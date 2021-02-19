package com.browserlaunchings;

public class TC_001 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		browserLaunch("firefoxbrowser");
		
		navigate("bestbuyurl");
		
		maximizeWindow();
		
		String title = windowTitle();
		System.out.println("Title : "  + title);
		
		String url = windowCurrentUrl();
		System.out.println("Url : " + url);
		
		deleteCookies();
		
		windowBack();
		
		wait(5000);
		
		windowForward();
		
		wait(5000);
		
		windowRefresh();
		
		windowClose();
	}
}

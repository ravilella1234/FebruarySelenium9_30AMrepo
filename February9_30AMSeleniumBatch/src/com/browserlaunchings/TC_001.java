package com.browserlaunchings;

public class TC_001 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		browserLaunch("chrome");
		
		navigate("https://www.amazon.in");
		
		maximizeWindow();
		
		String title = windowTitle();
		System.out.println("Title : "  + title);
		
		String url = windowCurrentUrl();
		System.out.println("Url : " + url);
		
		deleteCookies();
		
		windowBack();
		
		wait(5000);
		
		windowForward();
		
		wait(4000);
		
		windowRefresh();
		
		windowClose();
	}
}

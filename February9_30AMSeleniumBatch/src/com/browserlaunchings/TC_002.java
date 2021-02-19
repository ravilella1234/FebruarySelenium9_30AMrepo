package com.browserlaunchings;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) 
	{
		browserLaunch("firefox");
		
		navigate("https://www.bestbuy.com");
		
		maximizeWindow();
		
		deleteCookies();
		
		String url = windowCurrentUrl();
		System.out.println(url);
		
		windowClose();

	}

}

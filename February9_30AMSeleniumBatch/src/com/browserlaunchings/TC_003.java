package com.browserlaunchings;

public class TC_003 extends BaseTest 
{

	public static void main(String[] args) throws Exception
	{
		init();
		
		browserLaunch("chromebrowser");
		
		navigate("amazonurl");
		
	}

}

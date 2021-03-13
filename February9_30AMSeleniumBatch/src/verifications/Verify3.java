package verifications;

import org.openqa.selenium.chrome.ChromeDriver;

import com.browserlaunchings.BaseTest;

public class Verify3 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\grid\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		test = report.startTest("Verify3");
		
		String expectedLink = "New Release";
		
		if(!isLinkEquals(expectedLink))
			reportfailure("Both links are not equal....");
		else
			reportSuccess("Both Links are equal....");
		
		report.endTest(test);
		report.flush();
	}

}

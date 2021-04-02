package excelDataDrivern;

import org.testng.annotations.Test;

import com.project.MavenMarchSelenium9_30AMBatch.BaseTest;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;

public class FaceBookwithDataProvider extends BaseTest
{
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String> h) 
  {
	  if(h.get("RunMode").equals("N"))
		  throw new SkipException("Test is Skipped...");
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\grid\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com");
		 
		 driver.findElement(By.id("email")).sendKeys(h.get("UserName"));
		 driver.findElement(By.id("pass")).sendKeys(h.get("UserPassword")); 
  }

  @DataProvider
  public Object[][] getData() throws Exception 
  {
	    ExcelAPI e = new ExcelAPI("C:\\Users\\DELL\\Desktop\\suitex.xlsx");
		sheetName = "data";
		testCaseName = "LoginTest";
		
		return DataUtils.getTestData(e, sheetName, testCaseName);
  }
}

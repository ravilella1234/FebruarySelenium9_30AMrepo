package pom;

import org.testng.annotations.Test;

import com.project.MavenMarchSelenium9_30AMBatch.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class POM_001 extends BaseTest
{
	
  @BeforeMethod
  public void startProcess() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\grid\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://automationpractice.com/index.php");
  }
  
  
  @Test
  public void login() throws InterruptedException 
  {
	  Login l = new Login(driver);
	  l.login();
	  Assert.assertEquals(l.verifyLogin(), "Authentication failed.");
  }


  @AfterMethod
  public void endprocess()
  {
	  
  }

}

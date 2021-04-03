package pom;

import org.testng.annotations.Test;

import com.project.MavenMarchSelenium9_30AMBatch.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest extends BaseTest
{
	  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\grid\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://automationpractice.com/index.php");
  }
  
  @Test
  public void f() 
  {
	  driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
	  driver.findElement(By.id("email")).sendKeys("qatest8765@gmail.com");
	  driver.findElement(By.id("passwd")).sendKeys("password");
	  driver.findElement(By.id("SubmitLogin")).click();
	  String actualTest = driver.findElement(By.xpath("//li[contains(text(),'Authentication failed.')]")).getText();
	  String expectedTest = "Authentication failed.";
	  Assert.assertEquals(actualTest, expectedTest);
  }

  @AfterMethod
  public void afterMethod()
  {
	  
  }

}

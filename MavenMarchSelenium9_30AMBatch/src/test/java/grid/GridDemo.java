package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridDemo 
{
  @Test
  public void test1() throws InterruptedException 
  {
	  try 
	  {
		System.out.println("Starting test1 ");
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setBrowserName("firefox");
		ds.setPlatform(Platform.ANY);
		  
		WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.3:4444/wd/hub"), ds);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		System.out.println("Title is : "+ driver.getTitle());
		Thread.sleep(6000);
		driver.quit();
		System.out.println("Ending test1 ");
	  }  
	  catch (MalformedURLException e) 
	  {
		e.printStackTrace();
	  }
  }
  
  
  @Test
  public void test2() throws InterruptedException 
  {
	  try 
	  {
		System.out.println("Starting test2 ");
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setBrowserName("firefox");
		ds.setPlatform(Platform.ANY);
		  
		WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.3:4444/wd/hub"), ds);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		System.out.println("Title is : "+ driver.getTitle());
		Thread.sleep(6000);
		driver.quit();
		System.out.println("Ending test2 ");
	  }  
	  catch (MalformedURLException e) 
	  {
		e.printStackTrace();
	  }
  }
  
  @Test
  public void test3() throws InterruptedException 
  {
	  try 
	  {
		System.out.println("Starting test3 ");
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setBrowserName("firefox");
		ds.setPlatform(Platform.ANY);
		  
		WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.3:4444/wd/hub"), ds);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		System.out.println("Title is : "+ driver.getTitle());
		Thread.sleep(6000);
		driver.quit();
		System.out.println("Ending test3 ");
	  }  
	  catch (MalformedURLException e) 
	  {
		e.printStackTrace();
	  }
  }
  
  @Test
  public void test4() throws InterruptedException 
  {
	  try 
	  {
		System.out.println("Starting test4 ");
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setBrowserName("firefox");
		ds.setPlatform(Platform.ANY);
		  
		WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.3:4444/wd/hub"), ds);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		System.out.println("Title is : "+ driver.getTitle());
		Thread.sleep(6000);
		driver.quit();
		System.out.println("Ending test4 ");
	  }  
	  catch (MalformedURLException e) 
	  {
		e.printStackTrace();
	  }
  }
  
  
  @Test
  public void test5() throws InterruptedException 
  {
	  try 
	  {
		System.out.println("Starting test5 ");
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setBrowserName("chrome");
		ds.setPlatform(Platform.ANY);
		  
		WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.3:4444/wd/hub"), ds);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		System.out.println("Title is : "+ driver.getTitle());
		Thread.sleep(6000);
		driver.quit();
		System.out.println("Ending test5 ");
	  }  
	  catch (MalformedURLException e) 
	  {
		e.printStackTrace();
	  }
  }
  
  @Test
  public void test6() throws InterruptedException 
  {
	  try 
	  {
		System.out.println("Starting test6 ");
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setBrowserName("chrome");
		ds.setPlatform(Platform.ANY);
		  
		WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.3:4444/wd/hub"), ds);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		System.out.println("Title is : "+ driver.getTitle());
		Thread.sleep(6000);
		driver.quit();
		System.out.println("Ending test6 ");
	  }  
	  catch (MalformedURLException e) 
	  {
		e.printStackTrace();
	  }
  }
  
  @Test
  public void test7() throws InterruptedException 
  {
	  try 
	  {
		System.out.println("Starting test7 ");
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setBrowserName("chrome");
		ds.setPlatform(Platform.ANY);
		  
		WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.3:4444/wd/hub"), ds);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		System.out.println("Title is : "+ driver.getTitle());
		Thread.sleep(6000);
		driver.quit();
		System.out.println("Ending test7 ");
	  }  
	  catch (MalformedURLException e) 
	  {
		e.printStackTrace();
	  }
  }
  
}

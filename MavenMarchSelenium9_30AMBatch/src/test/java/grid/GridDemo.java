package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridDemo 
{
  @Test
  public void f() 
  {
	  try 
	  {
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setBrowserName("chrome");
		ds.setPlatform(Platform.ANY);
		  
		//ChromeOptions option = new ChromeOptions();
		//option.addArguments("user-data-dir=C:\\Users\\DELL\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 19");
		//new Remo
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.43.48:4444/wd/hub"), ds);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		System.out.println("Title is : "+ driver.getTitle());
	  }  
	  catch (MalformedURLException e) 
	  {
		e.printStackTrace();
	  }
  }
}

package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")public WebElement signIn;
	@FindBy(id="email")public WebElement emailAddress;
	@FindBy(id="passwd")public WebElement password;
	@FindBy(id="SubmitLogin")public WebElement submitLogin;
	@FindBy(xpath="//li[contains(text(),'Authentication failed.')]")public WebElement getLoginError;
	
	public Login(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void login() throws InterruptedException
	{
		signIn.click();
		Thread.sleep(3000);
		emailAddress.sendKeys("qatest9584958@gmail.com");
		password.sendKeys("password");
		submitLogin.click();
	}
	
	public String verifyLogin()
	{
		return getLoginError.getText();
	}

}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{

	public LoginPage(WebDriver driver) 
	{
		super(driver);

	}
	//Elements
	@FindBy(xpath="//input[@id=\"input-email\"]")
	WebElement Email;
	
	@FindBy(xpath="//input[@id=\"input-password\"]")
	WebElement password;
	
	@FindBy(xpath="//input[@value=\"Login\"]")
	WebElement login;
	
	//Action Methods
	
	public void setEmail(String email)
	{
		Email.sendKeys(email);
	}
	
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		login.click();
	}
	
	
}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{

	public HomePage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	//Elements
   @FindBy(xpath="//span[normalize-space()=\"My Account\"]")
   WebElement clickMyAccount;
   
   @FindBy(xpath="//ul[@class=\"dropdown-menu dropdown-menu-right\"]//a[normalize-space()=\"Register\"]")
   WebElement clickRegAccount;
   
   @FindBy(xpath="//a[normalize-space()=\"Login\"]")
   WebElement clickLogin;
   
   //Action Methods
   public void myAccount() 
   {
        clickMyAccount.click();
   }
    
   public void RegAccount() 
   {
       clickRegAccount.click();
   }
   
   public void Login()
   {
	   clickLogin.click();   
   }
 
}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegPage extends BasePage
{
     public RegPage(WebDriver driver) 
     {
    	 super(driver);
	}
     
     //Elements
     @FindBy(xpath="//input[@id=\"input-firstname\"]")
     WebElement txtfirstName;
     
     @FindBy(xpath="//input[@id=\"input-lastname\"]")
     WebElement txtlastName;
     
     @FindBy(xpath="//input[@id=\"input-email\"]")
     WebElement txtemail;
     
     @FindBy(xpath="//input[@id='input-telephone']")
     WebElement txttelephone;
     
     @FindBy(xpath="//input[@id=\"input-password\"]")
     WebElement txtpassword;
     
     @FindBy(xpath="//input[@id=\"input-confirm\"]")
     WebElement txtConfpassword;
     
     @FindBy(xpath="//input[@name=\"agree\"]")
     WebElement checkbox;
     
     @FindBy(xpath="//input[@value=\"Continue\"]")
     WebElement btncontinue;
     
     @FindBy(xpath="//h1[normalize-space()=\"Your Account Has Been Created!\"]")
     WebElement msgconfirmation;

	     
     //Action Methods
     public void setFirstName(String fname) 
     {
       txtfirstName.sendKeys(fname);
	 }
     
     public void setLastName(String lname) 
     {
       txtlastName.sendKeys(lname);
	 }
     
     public void setEmail(String email) 
     {
       txtemail.sendKeys(email);
	 }
     
     public void setTelephone(String number) 
     {
    	 txttelephone.sendKeys(number);
     }
     
     public void setPassword(String password) 
     {
       txtpassword.sendKeys(password);
	 }
     
     public void setConfPassword(String password) 
     {
    	 txtConfpassword.sendKeys(password);
	 
     }
     public void setclick() 
     {
       checkbox.click();
	 }
     
     public void clickContinue() 
     {
         btncontinue.click();
    	// JavascriptExecutor jk= (JavascriptExecutor) driver;
    	 //jk.executeScript("arguments[0].click();",btncontinue);
    	 
	 }

     public String getConfirmationMsg()
     {
    	 try
    	 {
         return (msgconfirmation.getText());
         }
    	 catch(Exception e)
    	 {
    		 return(e.getMessage());
    	 }
	 }



}

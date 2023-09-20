package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBases.BaseClass;

public class TC_002_LoginTest extends BaseClass
{
     @Test(groups= {"Sanity","Master"})
     public void testLogin()
     {
    	 try
    	 {
    		 
    	 logger.info("*********Starting TC_002_LoginTest********");
    	 
    	 
    	 HomePage hp = new HomePage(driver);
    	 hp.myAccount();
    	 hp.Login();
    	 
    	 LoginPage lp= new LoginPage(driver);
    	 lp.setEmail(rb.getString("email")); // valid email, get it from properties file
    	 lp.setPassword(rb.getString("password"));// valid password, get it from properties file
    	 lp.clickLogin();
    	 
    	 MyAccountPage macc= new MyAccountPage(driver);
    	 boolean targetpage = macc.isMyAccountPageExists();
    	 
    	 Assert.assertEquals(targetpage, true);
    	 }
    	 catch (Exception e) 
    	 {
		    Assert.fail();
    	 }
    	 
    	 logger.info("*****Finished TC_002_LoginTest********");
    	 
     }






}

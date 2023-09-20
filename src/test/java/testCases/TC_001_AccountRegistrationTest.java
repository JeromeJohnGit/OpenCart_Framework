package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegPage;
import testBases.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass {

	

	@Test(groups= {"Regression", "Master"})
	public void testAccountRegistration()
	{
		logger.debug("application logs......");
		logger.info("****Starting TC_001_AccountRegistrationTest****");
		
		try 
		{
			HomePage hp = new HomePage(driver);
			
			hp.myAccount();
			logger.info("Clicked on My account link");
			
			hp.RegAccount();
			logger.info("Clicked on register link");

			RegPage rp = new RegPage(driver);
			
			logger.info("Providing customer data");
			
			rp.setFirstName(randomString().toUpperCase());

			rp.setLastName(randomString().toUpperCase());

		    rp.setEmail(randomString() + "@gmail.com");
			
			rp.setTelephone(randomNumber());

			//rp.setPassword(randomAlphaNumeric());
			
			String password=randomAlphaNumeric();
			rp.setPassword(password);
			rp.setConfPassword(password);

			rp.setclick();

			rp.clickContinue();
			logger.info("Clicked on continue");

			String confirmationMsg = rp.getConfirmationMsg();
			
			logger.info("Validating expected message");
			Assert.assertEquals(confirmationMsg, "Your Account Has Been Created!", "TestFailed");

		} 
		catch (Exception e) 
		{
			logger.error("test failed");
			Assert.fail();
		}
		logger.info("***  Finished TC_001_AccountRegistrationTest ***");		
	}
}

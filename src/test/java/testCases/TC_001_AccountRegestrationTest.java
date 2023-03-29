package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegestrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegestrationTest extends BaseClass {

	
	
	@Test(priority=1,groups= {"Regression","Master"})
	void test_account_Regestration() {
		logger.debug("Application logs");
		logger.info("*** Started TC_001_AccountRegestrationTest **** ");
		try {
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked on account");
			hp.clickRegister();
			logger.info("Clicked on register");
			AccountRegestrationPage ar=new AccountRegestrationPage(driver);
			ar.setFirstName("Ravi");
			logger.info("Entered first name");
			ar.setLastName("pavan");
			logger.info("Entered last name");
			ar.setEmail( AlphaNumericValue()+"@gmail.com");
			logger.info("Entered email");
			ar.setPassword("Asdfghjkl@986");
			logger.info("Entered password");
			
				try {
					ar.clickAgreeChb();
					logger.info("Clicked on checkbox");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			
			ar.clickContinue();
			logger.info("Clicked on continue");
			Assert.assertEquals(ar.getConfirmation(),"Your Account Has Been Created!","not registered");
		} catch (Exception e) {
			logger.info("log failed in exception block");
			logger.error("Test failed");
			e.getMessage();
			Assert.fail();
		}
		
	}
	
	
	
	
	
	
	
}

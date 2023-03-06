package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {
@Test(groups= {"Sanity","Master"})
	public void test_login() {
	try {
		logger.info("******Login Test**************");
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on myaccount");
		hp.cickLogin();
		logger.info("Clicked on Login");
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(rb.getString("email"));
		logger.info("Entered Email");
		lp.setPassword(rb.getString("password"));
		logger.info("Entered Password");
		lp.clickLogin();
		logger.info("Clicked on Login button");
		MyAccountPage ap=new MyAccountPage(driver);
		/*boolean logo = ap.logoMyAccountPage();
		if(logo=true) {
			System.out.println("Passed the logo");
		}
		else {
			Assert.fail();
		}*/
		
		Assert.assertEquals(ap.logoMyAccountPage(),"My Account");
		//Assert.assertTrue(ap.logoMyAccountPage());
		logger.info("Validations");
	} catch (Exception e) {
		Assert.fail();
	}
	logger.info("***********login finished********");
}
}

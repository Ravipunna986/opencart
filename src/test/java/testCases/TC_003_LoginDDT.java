package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDDT extends BaseClass {
//@Test(dataProvider="LoginData") this line is enough when we create dataproviders in same class but we created seperate class for data providers the we nee to add one more syntax in test annotation class

	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void test_loginDDT(String email,String password,String exp) 
	{
	
		logger.info("************Starting the test Case data Driven model**********");
		try {
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			
			hp.cickLogin();
			
			LoginPage lp=new LoginPage(driver);
			lp.setEmail(email);
			
			lp.setPassword(password);
			
			lp.clickLogin();
			
			MyAccountPage ap=new MyAccountPage(driver);
			//Assert.assertEquals(ap.logoMyAccountPage(),"My Account");
String target=ap.logoMyAccountPage();
if(exp.equals("Valid")) {
if(target.equals("My Account")) {
			ap.clicklogout();
			Assert.assertTrue(true);
}
else {
			Assert.fail();
}
}
 else if(exp.equals("Invalid")) {
 if(target.equals("My Account")) {
				ap.clicklogout();
				Assert.fail();
				
			}
			else {
				Assert.assertTrue(true);
			}

}
		} catch (Exception e) {
		
			Assert.fail();
		}
logger.info("***********finished test Case data Driven model**********");
	}
	
	
	
	
	
	
	
	
	
	
}

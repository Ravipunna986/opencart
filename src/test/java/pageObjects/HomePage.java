package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Locators of elements
	@FindBy(xpath="//span[text()='My Account']") WebElement myAccount;
	@FindBy(linkText="Register") WebElement Register;
	@FindBy(linkText="Login") WebElement Login;
	//Action methods
	
	public void clickMyAccount() {
		myAccount.click();
	}
	
	public void clickRegister() {
		Register.click();
	}
	
	public void cickLogin() {
		Login.click();
	}
	
	
	

}

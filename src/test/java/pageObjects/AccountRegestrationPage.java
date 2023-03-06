package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegestrationPage extends BasePage {

	public AccountRegestrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(name="firstname")WebElement txtfirstname;
@FindBy(name="lastname")WebElement txtlastname;
@FindBy(name="email")WebElement txtemail;
@FindBy(name="password")WebElement txtpassword;
@FindBy(xpath="//input[@name='agree']")WebElement chkbxAgree;
@FindBy(xpath="//button[text()='Continue']")WebElement btnContinue;
@FindBy(xpath="//div[@id='content']//h1")WebElement verfyCon;

public void setFirstName(String firstname) {
	txtfirstname.sendKeys(firstname);
}

public void setLastName(String lastname) {
	txtlastname.sendKeys(lastname);
}
	
public void setEmail(String Email) {
	txtemail.sendKeys(Email);
}
public void setPassword(String Password) {
	txtpassword.sendKeys(Password);
}
public void clickAgreeChb() {
	chkbxAgree.click();
}
public void clickContinue() {
	btnContinue.click();
}
public String getConfirmation() {
	try {
		return (verfyCon.getText());
	} catch (Exception e) {
		
		return (e.getMessage());
	}
	
}
		
}

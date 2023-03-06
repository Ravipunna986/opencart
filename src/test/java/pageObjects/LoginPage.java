package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
@FindBy(name="email") WebElement txtemail;
@FindBy(name="password") WebElement txtPassword;
@FindBy(xpath="//button[text()='Login']") WebElement btnLogin;
	
public void setEmail(String email) {
	txtemail.sendKeys(email);
}

public void setPassword(String password) {
	txtPassword.sendKeys(password);
}

public void clickLogin() {
	//btnLogin.click();
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", btnLogin);
}

}

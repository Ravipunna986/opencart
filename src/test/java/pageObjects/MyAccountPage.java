package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
		}
@FindBy(xpath="(//div[@id='content']//child::h2)[1]") WebElement logoMyAccount;
@FindBy(linkText="Logout") WebElement btnlogout;

public String logoMyAccountPage() {
	return (logoMyAccount.getText());
	
	//return logoMyAccount.isDisplayed();
	
}
public  void clicklogout() {
	btnlogout.click();	
}
}

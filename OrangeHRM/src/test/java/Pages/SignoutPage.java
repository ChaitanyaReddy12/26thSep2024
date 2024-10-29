package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignoutPage {

	public WebDriver driver;

	public SignoutPage(WebDriver driver) {

		this.driver = driver;
	}

	// 1st way

	/*
	 *2nd way:
@FindBy(xpath = "//*[text()='Logout']")
public WebElement logout_Tab;
	 */
	
	
	@FindBy(xpath ="//*[text()='About']")
	public WebElement about_Tab;
	
	@FindBy(xpath ="//*[text()='Support']")
	public WebElement support_Tab;
	
	@FindBy(xpath ="//*[text()='Change Password']")
	public WebElement changePassword_Tab;
	
	@FindBy(xpath ="//*[text()='Logout']")
	public WebElement logout_Tab;
	
	public void clickLogout() {

		logout_Tab.click();
	}
	
	public void clickChangePassword() {

		changePassword_Tab.click();
	}
	
	public void clickSupport() {

		support_Tab.click();
	}
		
	public void clickAbout() {

		about_Tab.click();
	}

}

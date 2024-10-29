package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	// Syntax: accessmodifier By webelementname = By.locator(“”);

	// 1st way

	private By application_Logo = By.xpath("//*[@alt='company-branding']");

	private By username_Textbox = By.xpath("//input[@name='username']");

	private By password_Textbox = By.xpath("//input[@name='password']");

	private By login_Button = By.xpath("//button[@type='submit']");

	private By forgotYourPassword_Link = By.xpath("//*[text()='Forgot your password? ']");

	public void verifyLogo() {

		driver.findElement(application_Logo).isDisplayed();
	}

	public void verifyForgotYourPassword() {

		driver.findElement(forgotYourPassword_Link).isDisplayed();
	}
	
	
	public void enterUsername() {

		driver.findElement(username_Textbox).sendKeys("Admin");
	}
	
	public void enterPassword() {

		driver.findElement(password_Textbox).sendKeys("admin123");
	}
	
	public void clickLogin() {

		driver.findElement(login_Button).click();
	}
	
	public void clickForgotYourPassword() {

		driver.findElement(forgotYourPassword_Link).click();
	}
}

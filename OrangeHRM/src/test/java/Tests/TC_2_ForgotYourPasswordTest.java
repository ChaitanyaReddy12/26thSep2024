package Tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import BaseOrCommon.BaseOrCommonClass;
import Methods.ForgotYourPasswordMethods;
import Pages.LoginPage;

public class TC_2_ForgotYourPasswordTest  extends BaseOrCommonClass {
	
	LoginPage lp;
	
	ForgotYourPasswordMethods fpm;

	@BeforeSuite
	public void launchBrowser() throws IOException {

		browserLaunching("chrome");
		
		lp = new LoginPage(driver);
		
		fpm = new ForgotYourPasswordMethods(driver);
		
		screenshot("TC_2_ForgotYourPasswordTest_launchBrowser");

		System.out.println(" in @BeforeSuite method");
	}

	@BeforeClass
	public void launchURL() throws IOException {

		browserMaximize();

		urlLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println(" in @BeforeClass method");
		
		screenshot("TC_2_ForgotYourPasswordTest_launchURL");
	}

	@BeforeMethod
	public void waiting() {

		waitFortheWebElement();

		System.out.println(" in @BeforeMethod method");	
	}
	
	@Test (priority =  -1)
	public void verifyForgotYourPasswordLink() throws IOException {
		
		lp.verifyForgotYourPassword();
		
		System.out.println(" in @test verifyForgotYourPasswordLink method");
		
		screenshot("TC_2_ForgotYourPasswordTest_enterUsername");
	}
	
	
	@Test (priority =  0)
	public void clickForgotYourPasswordLink() throws IOException {
		
		lp.clickForgotYourPassword();
		
		System.out.println(" in @test clickForgotYourPasswordLink method");
		
		screenshot("TC_2_ForgotYourPasswordTest_enterUsername");
	}
	
	@Test (priority =  1)
	public void enterUsername() throws IOException {
		
		fpm.enterUsername();
		
		System.out.println(" in @test enterUsername method");
		
		screenshot("TC_2_ForgotYourPasswordTest_enterUsername");
	}
	
	@Test (priority =  2)
	public void clickCancel() {
		
		fpm.clickCancel();
		
		System.out.println(" in @test clickCancel method");
	}
	
	@AfterMethod
	public void waiting1() {

		waitFortheWebElement();

		System.out.println(" in @AfterMethod method");

	}

	@AfterSuite
	public void closeBrowser() throws IOException {
		
		screenshot("TC_2_ForgotYourPasswordTest_CloseBrowser");
		
		browserClosing();

		System.out.println(" in @afterSuite method");

	}


}

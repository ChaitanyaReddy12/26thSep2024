package Tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import BaseOrCommon.BaseOrCommonClass;
import Pages.LoginPage;

public class VidhyaCode  extends BaseOrCommonClass {
		
	LoginPage lp;

	@BeforeSuite
	public void launchBrowser() throws IOException {

		browserLaunching("chrome");
		
		lp = new LoginPage(driver);
		
		screenshot("TC_1_LoginTest_launchBrowser");

		System.out.println(" in @BeforeSuite method");
	}

	@BeforeClass
	public void launchURL() throws IOException {

		browserMaximize();

		urlLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println(" in @BeforeClass method");
		
		screenshot("TC_1_LoginTest_launchURL");
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
		
		screenshot("TC_1_LoginTest_enterUsername");
	}
	
	
	@Test (priority =  0)
	public void verifyLogoIcon() throws IOException {
		
		lp.verifyLogo();
		
		System.out.println(" in @test verifyLogoIcon method");
		
		screenshot("TC_1_LoginTest_enterUsername");
	}
	
	@Test (priority =  1)
	public void enterUsername() throws IOException {
		
		lp.enterUsername();
		
		System.out.println(" in @test enterUsername method");
		
		screenshot("TC_1_LoginTest_enterUsername");
	}
	
	@Test (priority =  2)
	public void enterPassword() throws IOException {
		
		lp.enterPassword();
		
		System.out.println(" in @test enterPassword method");
		
		screenshot("TC_1_LoginTest_enterPassword");

	}
	
	@Test (priority =  3)
	public void clickLogin() {
		
		lp.clickLogin();
		
		System.out.println(" in @test clickLogin method");
	}
	
	@AfterMethod
	public void waiting1() {

		waitFortheWebElement();

		System.out.println(" in @AfterMethod method");

	}

	@AfterSuite
	public void closeBrowser() throws IOException {
		
		screenshot("TC_1_LoginTest_CloseBrowser");
		
		browserClosing();

		System.out.println(" in @afterSuite method");

	}


}

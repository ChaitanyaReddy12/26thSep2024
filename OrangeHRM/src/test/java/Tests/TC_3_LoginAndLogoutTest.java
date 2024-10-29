package Tests;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import BaseOrCommon.BaseOrCommonClass;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignoutPage;

public class TC_3_LoginAndLogoutTest extends BaseOrCommonClass {
		
	LoginPage lp;
	
	HomePage hp; 
	
	SignoutPage sp;

	@BeforeSuite
	public void launchBrowser() throws IOException {

		browserLaunching("chrome");
		
		lp = new LoginPage(driver);
		
		//Classname objectname = pagefactory.initElements(web driver object, pagefactoryclass.class)
		
		hp = PageFactory.initElements(driver, HomePage.class);
		
		sp = PageFactory.initElements(driver, SignoutPage.class);
		
		screenshot("TC_3_LoginAndLogoutTest_launchBrowser");

		System.out.println(" in @BeforeSuite method");
	}

	@BeforeClass
	public void launchURL() throws IOException {

		browserMaximize();

		urlLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println(" in @BeforeClass method");
		
		screenshot("TC_3_LoginAndLogoutTest_launchURL");
	}

	@BeforeMethod
	public void waiting() {

		waitFortheWebElement();

		System.out.println(" in @BeforeMethod method");	
	}
	
	@Test (priority =  1)
	public void enterUsername() throws IOException {
		
		lp.enterUsername();
		
		System.out.println("in @test enterUsername method");
		
		screenshot("TC_3_LoginAndLogoutTest_enterUsername");
	}
	
	@Test (priority =  2)
	public void enterPassword() throws IOException {
		
		lp.enterPassword();
		
		System.out.println("in @test enterPassword method");
		
		screenshot("TC_3_LoginAndLogoutTest_enterPassword");

	}
	
	@Test (priority =  3)
	public void clickLogin() {
		
		lp.clickLogin();
		
		System.out.println(" in @test clickLogin method");
	}
	

	@Test (priority =  4)
	public void clickUserDropdown() throws IOException {
		
		hp.clickDropdownMenu();
		
		System.out.println("in @test clickUserDropdown method");
		
		screenshot("TC_4_LoginAndLogoutTest_clickUserDropdown");

	}
	
	@Test (priority =  5)
	public void clickLogoutTab() throws IOException {
		
		sp.clickLogout();
		
		System.out.println("in @test clickLogoutTab method");
		
		screenshot("TC_5_LoginAndLogoutTest_clickLogoutTab");

	}
	
	@AfterMethod
	public void waiting1() {

		waitFortheWebElement();

		System.out.println(" in @AfterMethod method");
	}

	@AfterSuite
	public void closeBrowser() throws IOException {
		
		screenshot("TC_3_LoginAndLogoutTest_CloseBrowser");
		
		browserClosing();

		System.out.println(" in @afterSuite method");

	}


}

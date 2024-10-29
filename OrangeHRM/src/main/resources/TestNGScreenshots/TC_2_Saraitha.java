package TestNGScreenshots;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import BaseOrCommon.BaseOrCommonClass;

public class TC_2_Saraitha  extends BaseOrCommonClass {

	@BeforeSuite
	public void launchBrowser() throws IOException {

		browserLaunching("chrome");
		
		screenshot("TC_2_Saraitha_launchBrowser");

		System.out.println(" in @BeforeSuite method");
	}

	@BeforeClass
	public void launchURL() throws IOException {

		browserMaximize();

		urlLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println(" in @BeforeClass method");
		
		screenshot("TC_2_Saraitha_launchURL");
	}

	@BeforeMethod
	public void waiting() {

		waitFortheWebElement();

		System.out.println(" in @BeforeMethod method");
	
	}
	
	@Test (priority =  1)
	public void enterUsername() throws IOException {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		System.out.println(" in @test enterUsername method");
		
		screenshot("TC_2_Saraitha_enterUsername");
	}
	
	@Test (priority =  2)
	public void enterPassword() throws IOException {
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		System.out.println(" in @test enterPassword method");
		
		screenshot("TC_2_Saraitha_enterPassword");

	}
	
	@Test (priority =  3)
	public void clickLogin() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println(" in @test clickLogin method");
	}
	
	@AfterMethod
	public void waiting1() {

		waitFortheWebElement();

		System.out.println(" in @AfterMethod method");

	}

	@AfterSuite
	public void closeBrowser() throws IOException {
		
		screenshot("TC_2_Saraitha_CloseBrowser");
		
		browserClosing();

		System.out.println(" in @afterSuite method");

	}


}

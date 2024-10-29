package TestNgAssertions;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseOrCommon.BaseOrCommonClass;

public class SoftAssertion_Example extends BaseOrCommonClass {

	@BeforeSuite
	public void launchBrowser() {

		browserLaunching("chrome");

		System.out.println(" in @BeforeSuite method");
	}

	@BeforeClass
	public void launchURL() {

		browserMaximize();

		urlLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println(" in @BeforeClass method");
	}

	@BeforeMethod
	public void waiting() {

		waitFortheWebElement();

		System.out.println(" in @BeforeMethod method");

	}
	
	@Test (priority =  0)
	public void verifyTite() {
		
		SoftAssert sa = new SoftAssert(); 
		
		String actualTitle = driver.getTitle();
		
		String expectedValue = "Bala";
		
		sa.assertEquals(actualTitle, expectedValue);
		
		System.out.println("Hi Quality Thoughts Team");
		
	}
	
	@Test (priority =  1)
	public void enterUsername() {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		System.out.println(" in @test enterUsername method");
	}
	
	@Test (priority =  2)
	public void enterPassword() {
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		System.out.println(" in @test enterPassword method");
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
	public void closeBrowser() {

		browserClosing();

		System.out.println(" in @afterSuite method");

	}

}

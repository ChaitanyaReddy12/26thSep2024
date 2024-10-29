package TestNgAttributes;


import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import BaseOrCommon.BaseOrCommonClass;

public class Attribute_DependsOnMethods extends BaseOrCommonClass {

	@BeforeSuite
	public void launchBrowser() {

		browserLaunching("edge");

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
	
	@Test
	public void enterUsername() {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		System.out.println(" in @test enterUsername method");
	}
	
	@Test (dependsOnMethods = "enterUsername")
	public void enterPassword() {
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		System.out.println(" in @test enterPassword method");
	}
	
	@Test (dependsOnMethods = "enterPassword")
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

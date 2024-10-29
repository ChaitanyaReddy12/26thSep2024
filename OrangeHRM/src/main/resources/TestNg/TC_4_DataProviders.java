package TestNg;


import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseOrCommon.BaseOrCommonClass;

public class TC_4_DataProviders extends BaseOrCommonClass {

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
	
	@DataProvider(name= "credentials")
	public Object[][] addCredentials(){
		
		Object[][] values = new Object[3][2];
		
		values[0][0] = "Shereen";
		values[0][1] = "Shaik";
		
		values[1][0] = "Bala";
		values[1][1] = "Krishna";
		
		values[2][0] = "Vidhya";
		values[2][1] = "Testing";		
		
		return values;		
		
	}

	@Test(priority = 1, dataProvider = "credentials")
	public void enterLoginCredentials(String username, String password) {		

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		
		clearDataInTheTextBox(By.xpath("//input[@name='username']"));
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);

		System.out.println(" in @test enterLoginCredentials method");
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

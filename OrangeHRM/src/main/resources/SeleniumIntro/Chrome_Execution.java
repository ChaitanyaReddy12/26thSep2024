package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Execution {
	
	public static void main(String[] args) {
		
		//Syntax: interface objectname = new classname();
		
		//System.setProperty("", "");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		
	}

}

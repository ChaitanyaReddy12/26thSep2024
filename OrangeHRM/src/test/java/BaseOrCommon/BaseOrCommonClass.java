package BaseOrCommon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class BaseOrCommonClass {

	public static WebDriver driver;

	public void browserLaunching(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();
		} else if (browsername.equalsIgnoreCase("safari")) {

			driver = new SafariDriver();
		} else {

			driver = new FirefoxDriver();
		}

	}

	public void browserClosing() {

		driver.quit();
	}

	public void urlLaunching(String url) {

		driver.get(url);
	}

	public void browserMaximize() {

		driver.manage().window().maximize();
	}

	public void waitFortheWebElement() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}

	public void clearDataInTheTextBox(By webelement) {

		Actions act = new Actions(driver);

		WebElement textbox = driver.findElement(webelement);

		act.keyDown(Keys.CONTROL);

		act.sendKeys(textbox, "a").build().perform();

		act.sendKeys(Keys.DELETE).build().perform();

		act.keyUp(Keys.CONTROL);
	}
	
	public void screenshot(String screenshotName) throws IOException {
		
		File vidhya = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(vidhya, new File("C:\\Users\\Abcom\\eclipse-workspace\\26thSep2024\\OrangeHRM\\src\\test\\java\\Screenshots\\" + screenshotName + ".png"));
	}

}

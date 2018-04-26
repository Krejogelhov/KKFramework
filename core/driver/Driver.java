package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	public enum BrowserType {
		CHROME,
		FIREFOX,
		IE
	}
	
	public static WebDriver getDriver(BrowserType type) {
		WebDriver driver = null;
		switch(type) {
			case CHROME:
				System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver");
				driver = new ChromeDriver();
				break;
			default:
				System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver");
				driver = new ChromeDriver();
				break;
				
		}
		return driver;
	}

}

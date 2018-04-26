package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver.Driver;

public class AviaSalesFrontPage {
	
	WebDriver driver = Driver.getDriver(Driver.BrowserType.CHROME);
	
	protected WebElement header = driver.findElement(By.xpath("//h1"));
	
	public String getHeaderText() {
		return header.getText();
	}

}

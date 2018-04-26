package businessLogic;

import driver.Driver;
import pages.AviaSalesFrontPage;

public class FrontPageLogic {
	
	AviaSalesFrontPage page = new AviaSalesFrontPage();
	
	public String getHeaderText() {
		return page.getHeaderText();
	}
	
	public void navigateToFrontPage() {
		Driver.getDriver(Driver.BrowserType.CHROME).get("www.aviasales.ru");
	}

}

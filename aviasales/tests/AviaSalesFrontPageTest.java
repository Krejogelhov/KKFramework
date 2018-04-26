package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import businessLogic.FrontPageLogic;

public class AviaSalesFrontPageTest {
	
	FrontPageLogic frontPage = new FrontPageLogic();
	
	@BeforeMethod
	public void navigateToFrontPage() {
		frontPage.navigateToFrontPage();
	}
	
	@Test
	public void frontPageLoadedTest() {
		Assert.assertEquals("Поиск дешевых авиабилетов", frontPage.getHeaderText(), "Header does not match expected value");
	}

}

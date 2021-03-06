package com.search.app;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.Screenshoter;
import utils.WebDriverSingleton;

public class Solution {
	protected static WebDriver driver;
	
	@BeforeTest(description = "Start Browser")
	public static void initializeBrowser(){
		driver = WebDriverSingleton.getWebDriverSingleton();
	}
	
	/*@Test(description = "First Test")
	public static void catalogElements(){
		CatalogPage catalogPage = new HomePage(driver).openHomePage().openCatalogPage();
		Screenshoter.takeScreenshot();
		int res = catalogPage.getList().size();
		Assert.assertTrue(res < 20, "Too much items! Should be less than 20!!!");
	}*/
	
	@Test(description = "Second Test", priority = 1)
	public static void forumElementsSearch(){
		new HomePage(driver).openHomePage().openCatalogPage().openForumPage().getSearchResults();
		Screenshoter.takeScreenshot();
	}
	
	@AfterTest(description = "Close Browser")
	public static void closeBrowser(){
		driver.close();
	}

}

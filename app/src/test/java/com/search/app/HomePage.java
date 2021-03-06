package com.search.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject{
	@FindBy(xpath = "//a[contains(@href,'catalog')]")
	WebElement catalogLink;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public HomePage openHomePage(){
		driver.get("https://www.onliner.by/");
		return this;
	}
	
	public CatalogPage openCatalogPage(){
		catalogLink.click();
		return new CatalogPage(driver);
	}
	
}

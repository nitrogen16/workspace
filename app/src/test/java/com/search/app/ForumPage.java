package com.search.app;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForumPage extends PageObject {
	
	public ForumPage(WebDriver driver) {
		super(driver);
	}
	
	private static final String SEARCH = "fast-search__input";
	@FindBy(className = SEARCH)
    private WebElement searchField;
	
	private static final String FRAME_CLASS = "modal-iframe";
	@FindBy(className = FRAME_CLASS)
    private WebElement iFrame;
	
	private static final String RESULTS = "search__results";
	@FindBy(className = RESULTS)
    private WebElement results;
	
	public int getSearchResults(){
		searchField.sendKeys("life");
		//new Actions(driver).sendKeys(searchField, "life").build().perform();
		new WebDriverWait(driver, 30).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className(FRAME_CLASS)));
    	List<WebElement> list = results.findElements(By.tagName("li"));
    	System.out.println(list.size());
        return list.size();
	}

}

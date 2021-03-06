package com.search.app;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CatalogPage extends PageObject {
	@FindBy(xpath = "//a[contains(@href,'forum')]")
	WebElement forumLink;
	
	public CatalogPage(WebDriver driver) {
		super(driver);
	}

	public List<WebElement> getList(){
        List<WebElement> list = driver.findElements(By.xpath(".//*[@class='catalog-bar']/ul")); 
        /*for(WebElement item : list){
        	System.out.println(item.getText());
        }*/
        return list;
	}
	
	public ForumPage openForumPage(){
		//forumLink.click();
		new Actions(driver).click().build().perform();
		return new ForumPage(driver);
	}

}

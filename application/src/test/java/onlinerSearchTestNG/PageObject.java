package onlinerSearchTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	protected WebDriver driver;
	
	public PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Каталог")
	@CacheLookup
    private WebElement catalogPage;
	
	//@FindBy(linkText = "Форум")
	@FindBy(xpath = "//a[contains(@href,'forum')]")
	@CacheLookup
    private WebElement forumMenuItem;
    
	public OnlinerCatalogPage clickOnCatalogPage() {
		catalogPage.click();
		return new OnlinerCatalogPage(driver);
	}
	
	public OnlinerForumPage clickOnForumPage() {
		forumMenuItem.click();
		return new OnlinerForumPage(driver);
	}
	
	public OnlinerMainPage open() {
		driver.get("http:\\onliner.by");
		return new OnlinerMainPage(driver);
	}
}

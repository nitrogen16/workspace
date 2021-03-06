package onlinerSearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	@FindBy(linkText = "Каталог")
	@CacheLookup
    private WebElement catalogPage;
	
	@FindBy(linkText = "//a[@href='https://onliner.by']")
	@CacheLookup
    private WebElement newsPage;
	
//	@FindBy(linkText = "Форум")
	@FindBy(linkText = "//a[contains(@href,'forum')]")
	@CacheLookup
    private WebElement forumMenuItem;
	protected WebDriver driver;
	
	public PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    
	public OnlinerCatalogPage clickOnCatalogPage() {
		catalogPage.click();
		return new OnlinerCatalogPage(driver);
	}
	
	/*public OnlinerForumPage clickOnNewsPage() {
		newsPage.click();
		return new OnlinerNewsPage(driver);
	}*/
	
	public OnlinerForumPage clickOnForumPage() {
		forumMenuItem.click();
		return new OnlinerForumPage(driver);
	}
}

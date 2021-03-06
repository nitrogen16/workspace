package onlinerSearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OnlinerMainPage extends PageObject{
	@FindBy(linkText = "Каталог")
	@CacheLookup
    private WebElement catalogPage;
	
	public OnlinerMainPage(WebDriver driver) {
		super(driver);
	}

	public OnlinerMainPage open() {
		driver.get("http:\\onliner.by");
		return this;
	}

	public OnlinerCatalogPage clickOnCatalog() {
		catalogPage.click();
		return new OnlinerCatalogPage(driver);
	}
}

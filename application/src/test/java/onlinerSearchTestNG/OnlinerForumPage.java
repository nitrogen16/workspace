package onlinerSearchTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OnlinerForumPage extends PageObject{
	
	private static final String SEARCH = "fast-search__input";
	@FindBy(className = SEARCH)
	@CacheLookup
    private WebElement search;
	
	private static final String FRAME_CLASS = "modal-iframe";
	@FindBy(className = FRAME_CLASS)
	@CacheLookup
    private WebElement iFrame;
	
	private static final String RESULTS = "search__results";
	@FindBy(className = RESULTS)
	@CacheLookup
    private WebElement results;
	
	
	public OnlinerForumPage(WebDriver driver) {
		super(driver);
	}

    public int getElements() {

    	search.sendKeys("life");
    	new WebDriverWait(driver, 30).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className(FRAME_CLASS)));
    	
    	
    	List<WebElement> list = results.findElements(By.tagName("li"));
        System.out.println(list.size());
        return list.size();
    }
}
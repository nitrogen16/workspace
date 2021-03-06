package onlinerSearch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OnlinerForumPage extends PageObject{

	private static final String FRAME_CLASS = "search__results";

	@FindBy(className = FRAME_CLASS)
	@CacheLookup
    private WebElement iFrame;
	
	
	public OnlinerForumPage(WebDriver driver) {
		super(driver);
	}

    public void getElements() {
    	driver.findElement(By.className("fast-search__input")).sendKeys("life");
    	new WebDriverWait(driver, 30).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id(FRAME_CLASS)));
    	
    	//List<WebElement> list = driver.findElements(By.tagName("li"));
    	List<WebElement> list = iFrame.findElements(By.tagName("li"));
        System.out.println(list.size());
        
    	/*for(WebElement item : list){
        	System.out.println(item.getText());
        }*/
    }
}
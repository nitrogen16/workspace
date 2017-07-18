package onlinerSearchTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OnlinerCatalogPage extends PageObject{
	
	public OnlinerCatalogPage(WebDriver driver) {
		super(driver);
	}
	
    public void getElements() {
        List<WebElement> list = driver.findElements(By.xpath(".//*[@class='catalog-bar']/ul")); 
        for(WebElement item : list){
        	System.out.println(item.getText());
        }
    }
}

package google_search.application;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MozillaSearch extends Browser{
	@Test
	public void doesWebDriverWork() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Viachaslau_Amelin\\Downloads\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		// search page
		WebDriverWait wait = new WebDriverWait(driver, 20);
		String inputSearchField = "input[name='q']";
		WebElement inputFieldQ = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(inputSearchField)));
		inputFieldQ.sendKeys("Java Tutorials");
		
		String cssOfSearchButton = "input[name='btnK']";
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cssOfSearchButton)));
		searchButton.click();
		
		// search results page
		WebElement thirdHref = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='rso']/div/div/div[3]/div/div/h3/a"))); 
		thirdHref.click();
		//driver.close();
		//driver.quit();
	}
}
// see https://github.com/mozilla/geckodriver. The latest version can be downloaded from https://github.com/mozilla/geckodriver/releases
//java.lang.IllegalStateException: The path to the driver executable must be set by the webdriver.gecko.driver system property; for more information, see https://github.com/mozilla/geckodriver. The latest version can be downloaded from https://github.com/mozilla/geckodriver/releases




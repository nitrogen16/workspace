package google_search.application;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearch extends Browser{
	@Test
	public void doesWebDriverWork() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Viachaslau_Amelin\\Downloads\\chromedriver_2_27\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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

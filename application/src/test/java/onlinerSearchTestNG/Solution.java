package onlinerSearchTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Solution extends FunctionalTest {
	
	protected static WebDriver driver;
	@BeforeTest
	public static void setUp() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Viachaslau_Amelin\\Downloads\\chromedriver_2_27\\chromedriver.exe");
		//driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Viachaslau_Amelin\\Downloads\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	}
	
	@Test
	public void signUp() {
		OnlinerMainPage onlinerMainPage = new OnlinerMainPage(driver);
		OnlinerCatalogPage onlinerCatalogPage = onlinerMainPage.open().clickOnCatalogPage();
		onlinerCatalogPage.getElements();

		OnlinerForumPage onlinerForumPage = onlinerCatalogPage.clickOnForumPage();
		Assert.assertTrue(onlinerForumPage.getElements() > 0, "Element not found");
	}
	
	@AfterTest
	public void close(){
		driver.close();
	}
	
}
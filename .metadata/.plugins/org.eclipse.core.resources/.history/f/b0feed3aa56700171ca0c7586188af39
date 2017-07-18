package onlinerSearch;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FunctionalTest {
	protected static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Viachaslau_Amelin\\Downloads\\chromedriver_2_27\\chromedriver.exe");
		driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Viachaslau_Amelin\\Downloads\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		//driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/*@After
	public void cleanUp() {
		driver.manage().deleteAllCookies();
	}

	@AfterClass
	public static void tearDown() {
		driver.close();
	}*/
}
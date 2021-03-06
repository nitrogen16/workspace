package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverSingleton {
	private static WebDriver instance;
	
	private WebDriverSingleton(){
	}
	
	public static WebDriver getWebDriverSingleton(){
		if(instance != null){
			return instance;
		}
		return instance = init();
	}
	
	private static WebDriver init(){
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Viachaslau_Amelin\\Downloads\\chromedriver_2_27\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Viachaslau_Amelin\\Downloads\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		return driver;
	}
	
	public static void kill(){
		if(instance != null){
			try{
				instance.quit();	
			}catch(Exception e){
				//Logger.error("Cannot kill browser launched!");
			}finally{
				instance = null;
			}
			
		}
	}
}

package utils;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshoter {
	private static final String SCREENSHOT_NAME_TPL = "C:\\Users\\Viachaslau_Amelin\\workspace\\app\\screenshots\\";
	//private static final String SCREENSHOT_NAME_TPL = "/app/screenshots";
	
	public static void takeScreenshot(){
		WebDriver driver = WebDriverSingleton.getWebDriverSingleton();
		File sreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try{
			String screenshotName = SCREENSHOT_NAME_TPL + System.nanoTime();
			File copy = new File(screenshotName + ".png");
			FileUtils.copyFile(sreenshot, copy);
		}catch(IOException e){
			//Logger.
		}
	}
}
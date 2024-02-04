package PracticeFramwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {


	WebDriver driver;
	public void initializeBrowser() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","E:\\java\\chromedriver.exe\\");
		driver = new ChromeDriver(options);
		
		
		driver.get("https://kite.zerodha.com/");	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	
	
	
}

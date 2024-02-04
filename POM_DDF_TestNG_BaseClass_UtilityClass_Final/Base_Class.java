package POM_DDF_TestNG_BaseClass_UtilityClass_Final;



import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base_Class {

	WebDriver driver;
	public void initializeBrowser() throws IOException {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","E:\\java\\chromedriver.exe\\");
		driver = new ChromeDriver(options);
		
		
		driver.get(Utility_Class.readPropertyFileData("URL"));	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
		
	}
	
	
	
	
	
}

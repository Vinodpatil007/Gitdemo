package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class Practice1 {
	
	@Test
	public void TC() {
		
		System.setProperty("webdriver.gecko.driver","E:\\java\\geckodriver.exe\\");
		WebDriver driver = new FirefoxDriver();
	

		driver.get("https://kite.zerodha.com");
		
	}
	}

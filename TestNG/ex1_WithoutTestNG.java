package TestNG;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ex1_WithoutTestNG {

public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","E:\\program\\selenium\\java\\java\\chromedriver exe file\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
	
		driver.get("https://kite.zerodha.com/");
	
}
	
}

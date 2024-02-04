package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class example16_Parallel2 {

	@Test
	public void TC1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\program\\selenium\\java\\java\\chromedriver exe file\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		
		Thread.sleep(5000);		
		
	}
}

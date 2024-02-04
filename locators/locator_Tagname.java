package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_Tagname {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\java\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver(); 
		
 	driver.get("file:///E:/java/HTML/tag.html");
 	
 	// FN
 	driver.findElement(By.tagName("input")).sendKeys("123");
	
 	//LN
 	driver.findElement(By.tagName("input")).sendKeys("123");

}

}

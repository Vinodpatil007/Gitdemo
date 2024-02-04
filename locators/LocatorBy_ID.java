package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorBy_ID {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\java\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver(); 

		d.get("file:///E:/java/HTML/id.html");
		
		//FN
	d.findElement(By.id("123")).sendKeys("asd");
	
	  //LN
	d.findElement(By.id("123")).sendKeys("acb");
}
}

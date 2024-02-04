package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorBy_Name {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\java\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver(); 
	
		d.get("file:///E:/java/HTML/name.html");
		
		
		//FN
		d.findElement(By.name("abc1")).sendKeys("ccc");

		//LN
		d.findElement(By.name("abc1")).sendKeys("ccc");
}       
}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathby_Index {
	
 public static void main(String[] args) throws InterruptedException {
	
	 
	 System.setProperty("webdriver.chrome.driver","E:\\java\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();
	 
		d.get("https://en-gb.facebook.com/");
		
		Thread.sleep(2000);
		
	d.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	Thread.sleep(2000);
		
	d.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abc");	
	
}
}

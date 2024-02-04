package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathby_text {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\java\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://en-gb.facebook.com/");
		
		d.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		// d.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	
     	// 	Thread.sleep(1000);
		
		//	d.findElement(By.xpath("//a[text()='facebook']")).click();
		
		//	Thread.sleep(1000);
		
		// d.navigate().back();
		 
		//	Thread.sleep(1000);
		
		//	d.findElement(By.xpath("//a[text()='google']")).click();
		
		//	Thread.sleep(1000);
		
		//	d.navigate().back();
	}
	
}

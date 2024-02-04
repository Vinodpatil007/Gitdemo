package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathby_Attribute {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\java\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver(); 
		
		d.get("https://www.facebook.com/");
		
		d.findElement(By.xpath("//input[@id='email']")).sendKeys("8087429863");
		d.findElement(By.xpath("//input[@id='pass']")).sendKeys("Tushar@123");
		
	  Thread.sleep(2000);
		d.findElement(By.xpath("//button[@name='login']")).click();

		
	}
	
	
	
	
	
}

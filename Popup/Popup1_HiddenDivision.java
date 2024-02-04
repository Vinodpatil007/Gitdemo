package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup1_HiddenDivision {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\program\\selenium\\java\\java\\chromedriver exe file\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		//click on close button
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(3000);
		
		//click on login button
		d.findElement(By.xpath("//a[text()='Login']")).click(); 
		
		
		//enter UN
		d.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9096546919");
		
		//enter pwd
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("unicorn@2407");
		
		//click on login button
		d.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		
	}
	
	
}

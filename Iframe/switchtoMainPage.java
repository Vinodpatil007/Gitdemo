package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class switchtoMainPage {


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\java\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		d.switchTo().frame("iframeResult");
	
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[@type='button']")).click();
	
		d.switchTo().defaultContent();  
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[@id='tryhome']")).click();	
	}

}

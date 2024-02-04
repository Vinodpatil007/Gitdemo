package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "E:\\program\\selenium\\java\\java\\chromedriver exe file\\chromedriver.exe\\");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
	//driver.switchTo().frame("iframeResult");
	
	WebElement f = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
	
	driver.switchTo().frame(f);
	
	driver.findElement(By.xpath("//button[@type='button']")).click();
	
	driver.switchTo().parentFrame();
		
	driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
		
		
		
	}
}

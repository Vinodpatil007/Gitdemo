package HandlingOf_DynamicElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRatingsOfRedmiPhoneFromFlipkartApp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\java\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.flipkart.com/");
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("redmi 9");
	
		d.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		String ratings = d.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]")).getText();
	
		System.out.println(ratings);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}

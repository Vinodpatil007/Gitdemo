package HandlingOf_DynamicElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\java\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 12");
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement rating = driver.findElement(By.xpath("((//a[@class='_1fQZEK'])[2]//span)[6]"));
		
		System.out.println(rating.getText());
		
		
	}
	
	
	
}

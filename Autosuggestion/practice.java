package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\program\\selenium\\java\\java\\chromedriver exe file\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("apple");
		
		Thread.sleep(2000);
		
		
		 List<WebElement> allOption = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		 String expText = "apple watch";
		
		for (WebElement option : allOption) {
			
			String actText = option.getText();
			
			System.out.println(actText);
		
			if (actText.equals(expText)) {
				option.click();
			break;
			
			}
			}
		
		
		
		}
		 
		 
		
	
	
}		

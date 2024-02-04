package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sample {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi");
		
		Thread.sleep(2000);

	List<WebElement> AllOptions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
	
	String expText="redmi note 8";
	
	for( WebElement option: AllOptions) 
	{
		String actText = option.getText();
		System.out.println(actText);
		
		if(actText.equals(expText)) 
		{
			option.click();
			break;
		}
			
	}	
	}
	
}

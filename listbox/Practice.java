package listbox;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\java\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///E:/java/HTML/multi.html");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement b = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s = new Select(b);
	
		s.selectByVisibleText("Ind");
		s.selectByVisibleText("Sri");
		Thread.sleep(3000);
		
		s.deselectAll();
		
//		List<WebElement> a = s.getAllSelectedOptions();
//	
//		for (WebElement webElement : a) {
//			System.out.println(webElement.getText());
//		}
	//System.out.println(s.isMultiple());
	   
		
		
		
		
	}
	
}

package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinksInGoogleWebpage {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\program\\selenium\\java\\java\\chromedriver exe file\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();

		d.get("https://www.google.co.in/");
		
		List<WebElement> links = d.findElements(By.xpath("//a"));

		for (WebElement link : links) {
			
			System.out.println(link.getText());
		}
	
	
		
		
	
}
}

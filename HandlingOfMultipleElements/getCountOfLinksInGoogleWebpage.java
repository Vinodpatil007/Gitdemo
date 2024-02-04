package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCountOfLinksInGoogleWebpage {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();

		d.get("https://www.google.co.in/");
		
		List<WebElement> links = d.findElements(By.xpath("//a"));
	
		System.out.println(links.size());
}
}

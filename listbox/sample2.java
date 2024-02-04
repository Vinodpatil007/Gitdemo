package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\java\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver(); 
		d.get("https://en-gb.facebook.com/");
		
		d.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
	
		WebElement y = d.findElement(By.xpath("//select[@id='year']"));
	
		Select s= new Select(y);
	
		s.selectByValue("1994");
		
		//	s.selectByVisibleText("1948");
		
		
	}

}

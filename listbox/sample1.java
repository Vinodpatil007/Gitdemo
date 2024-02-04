package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\java\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();
        
		d.get("https://en-gb.facebook.com/");
	
	d.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	Thread.sleep(3000);
	
	WebElement m = d.findElement(By.xpath("//select[@id='month']"));
	

	Select s = new Select(m);
	s.selectByIndex(7);
	
	//s.selectByValue("7");
	
	
	//s.selectByVisibleText("Jul");
	
	
	}
	
}

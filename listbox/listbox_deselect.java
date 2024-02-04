package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox_deselect {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\program\\selenium\\java\\java\\chromedriver exe file\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();
        
		d.get("file:///E:/java/HTML/multi.html");
	
	WebElement m = d.findElement(By.xpath("//select[@multiple='true']"));
	

	Select s = new Select(m);
	s.selectByIndex(1);
 
	s.selectByIndex(3);
	
	Thread.sleep(3000);
	
	s.deselectAll();
	
}
}

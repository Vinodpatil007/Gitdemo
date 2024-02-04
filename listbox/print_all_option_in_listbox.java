package listbox;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class print_all_option_in_listbox {
	public static void main(String[] args) throws InterruptedException {
		ArrayList<String>  ar =new ArrayList<String>();
		ar.add("abc");
		ar.add("abc");
		ar.add("abc");
		ar.add("abc");
		ar.add("abc");
		
		
		System.setProperty("webdriver.chrome.driver"," path of exe file ");
		WebDriver driver=new ChromeDriver ();
		driver.get ("http://www.facebook.com");
		driver .findElement(By.xpath("//a[text()='create new account']")).click();
		Thread.sleep(3000);
	WebElement month = driver.findElement (By.xpath("//Select [@id=month']"));
		Select s = new Select (month);
		
		
		s.selectByValue ("4");
		s.selectByIndex(0); 
		
	}

}

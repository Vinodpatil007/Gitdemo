package listbox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_all_options_in_listbox_by_alphabitical_order {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\program\\selenium\\chrome exe file\\");
		WebDriver driver = new ChromeDriver();	
		 driver.get ("http:www.facebook.com");
		 driver.findElement(By.xpath("a[text()='create new account']")).click();
		 Thread.sleep(3000);
		 TreeSet<String> tr = new TreeSet();
		 WebElement month = driver.findElement(By.xpath("//Select[@id='month']"));
		 Select s = new Select(month);
		 List<WebElement> multioptions = s.getOptions();
		 for (WebElement singleoption : multioptions)
		 {
		String	text = singleoption.getText();
		tr.add(text);
		 }
		 for (String s1: tr){
			 System.out.println(s1);
		 }
	}
		 
	}



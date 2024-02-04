package listbox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printAllOptionsInListBox_alphabeticalOrder {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\java\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();
        
		d.get("https://en-gb.facebook.com/");
	
	d.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	Thread.sleep(5000);
	
	WebElement m = d.findElement(By.xpath("//select[@id='month']"));
	
	Select s = new Select(m);
	
	List<WebElement> a = s.getOptions();

	TreeSet<String> tr= new TreeSet<String>();
 
	for(WebElement b:a) {
		
		String t = b.getText();
	    tr.add(t);	
		
	}
	for(Object t1:tr) {
		System.out.println(t1);
	}

}
}

package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex4_printAllOptions {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\program\\selenium\\java\\java\\chromedriver exe file\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();
        
		d.get("https://en-gb.facebook.com/");
	
	d.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	Thread.sleep(4000);
	
	WebElement y = d.findElement(By.xpath("//select[@id='year']"));
	
	Select s= new Select(y);
	List<WebElement> o = s.getOptions();
	
	for(WebElement b:o) {
		System.out.println(b.getText());
	}
	
	// WebElement m = d.findElement(By.xpath("//select[@id='month']"));

	// Select s = new Select(m);
	
    //List<WebElement> a = s.getOptions();
 
    // for( WebElement o :a) {
		 
	// System.out.println(o.getText());}
		 
	// for(int i=0; i<=a.size()-1; i++) {
	// System.out.println(a.get(i).getText());
	// }

	 }
	 }


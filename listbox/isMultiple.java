package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultiple {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\java\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();
        
		d.get("https://en-gb.facebook.com/");
	
	d.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	Thread.sleep(3000);
	
	WebElement m = d.findElement(By.xpath("//select[@id='year']"));

   Select s = new Select(m);
   
   boolean k = s.isMultiple();
   
   System.out.println(k);


   if (k==true) {
	System.out.println("list box is multiple selected");
}

   else {
	   System.out.println("list box is single selected");
   }
}
}

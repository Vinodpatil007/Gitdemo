package listbox;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class ex3_getSizeOffListbox {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\program\\selenium\\java\\\\java\\chromedriver exe file\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();
        
		d.get("https://en-gb.facebook.com/");
	
	d.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	Thread.sleep(3000);
   
	WebElement m = d.findElement(By.xpath("//select[@id='month']"));
	
	Select s= new Select(m);
	// Approach-1
	// List<WebElement> o = s.getOptions();
	// int s1 = o.size();
    // System.out.println(s1);
 
	// Approach-2
    // System.out.println(o.size());

	// Approach-3
	int s1 = s.getOptions().size();
 
	System.out.println(s1);
	
}
	
}

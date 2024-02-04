package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action3_MouseLeftClick {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\program\\selenium\\java\\java\\chromedriver exe file\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();
	    
		d.get("https://www.flipkart.com/");

		Thread.sleep(10000);

		d.findElement(By.xpath("//button[text()='✕']")).click();
		
		Thread.sleep(2000);
	
		//WebElement logbutton = d.findElement(By.xpath("//a[text()='Login']"));
		//Actions act=new Actions(d);
		//act.moveToElement(logbutton).perform();
		//Thread.sleep(2000);
		//act.click().perform();
	
	
		//WebElement logbutton = d.findElement(By.xpath("//a[text()='Login']"));
		//Actions act=new Actions(d);
	    //act.moveToElement(logbutton).click().build().perform();
	
	
	    WebElement logbutton = d.findElement(By.xpath("//a[text()='Login']"));
		Actions act=new Actions(d);
	    act.click(logbutton).perform();
	
	}
}

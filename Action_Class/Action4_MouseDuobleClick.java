package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action4_MouseDuobleClick {

public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\java\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();
	    
		d.get(" http://demo.guru99.com/test/simple_context_menu.html");

	//	WebElement ele = d.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
	//	Actions act = new Actions(d);
	//	act.moveToElement(ele).perform();
	//	act.doubleClick().perform();
				
	//	WebElement ele = d.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
	//	Actions act = new Actions(d);
    //  act.moveToElement(ele).doubleClick().build().perform();
	    
		WebElement ele = d.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		Actions act = new Actions(d);
	    act.doubleClick(ele).perform();
		










}	
}

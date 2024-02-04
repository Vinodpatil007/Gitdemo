package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action5_DragAndDrop {

public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\program\\selenium\\java\\java\\chromedriver exe file\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();
	    
		d.get("http://demo.guru99.com/test/drag_drop.html");

		Thread.sleep(2000);

		WebElement source = d.findElement(By.xpath("(//a[@clas`s='button button-orange'])[4]"));
		WebElement dest = d.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
		
		Actions act = new Actions(d);
		//act.dragAndDrop(source, dest).perform();
		
		act.moveToElement(source).clickAndHold().moveToElement(dest).release().build().perform();
		
}	
}

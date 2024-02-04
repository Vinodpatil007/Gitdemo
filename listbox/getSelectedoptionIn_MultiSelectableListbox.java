package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getSelectedoptionIn_MultiSelectableListbox {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","E:\\java\\chromedriver.exe\\");
		
		WebDriver d = new ChromeDriver();
        
		d.get("file:///E:/java/HTML/multi.html");
		
		
		WebElement month = d.findElement(By.xpath("//select[@multiple='true']"));
	
		Select s=new Select(month);
	
		s.selectByIndex(0);
        s.selectByIndex(2); 	
		
        Thread.sleep(3000);
		
        List<WebElement> al = s.getAllSelectedOptions();
        
       for (WebElement w : al) {
		System.out.println(w.getText());
	}
	}
}
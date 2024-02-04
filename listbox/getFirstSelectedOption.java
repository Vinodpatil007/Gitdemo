package listbox;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class getFirstSelectedOption {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\java\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");

		// click on Create New Account button
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

		Thread.sleep(3000);

		// step1:
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));

		Select s = new Select(month);

//		WebElement selectedOption = s.getFirstSelectedOption();
//		String text = selectedOption.getText();
//		System.out.println(text);
		
		
		System.out.println(s.getFirstSelectedOption().getText());

	}}

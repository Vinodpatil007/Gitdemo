package POMwithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page {

	//Step-1 Declaration
	@FindBy(xpath = "//input[@id='userid']") private WebElement UN;
	// private WebElement UN = driver.findElement(By.xpath("xpath xpression"))
	
	@FindBy(xpath = "//input[@id='password']") private WebElement PWD;
	// private WebElement pwd = driver.findElement(By.xpath("xpath xpression"))
	
	@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement login;
	// private WebElement login = driver.findElement(By.xpath("xpath xpression"))
	
	
	//Step-2 Initialization
	
	public KiteLogin1Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	//Step-3 Usage
	
	public void inpKiteLogin1PageUsername(String username) {
		
		UN.sendKeys(username);
	}
	
	public void inpKiteLogin1PagePassword(String enterpwd) {
		
		PWD.sendKeys(enterpwd);
	}
	
	
	public void clickKiteLogin1PageLoginBtn() {
		
		login.click();
	}
	
	
	
	
	
}

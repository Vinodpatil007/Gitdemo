package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;




    //@Author name: Tushar
	// this method is use to get inputs from excel sheet
	// need to pass 2 parameters ie. 1.rowIndex 2. colIndex
public class UtilityClass {

	public static String getTestData(int rowIndex,int colIndex) throws  IOException {
		
		FileInputStream file = new FileInputStream("E:\\java\\Apr21A.xlsx\\");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");

		String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		
		return value;
	}
	    // @Author name: Sanjay
		// this method is use to capture Screenshot
		// need to pass 2 parameters ie. 1.driver value 2. Test case ID
	public static void captureScreenshot(WebDriver driver,int ID) throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\Admin\\Eclipse2\\April21A_Selenium\\Screenshot\\TestCaseID"+ID+".jpg");	
	    FileHandler.copy(src, dest);
	
	}
	
	
}


package Parameteriztion;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;





public class ex1_getStringData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("E:\\program\\selenium\\java\\java\\chromedriver exe file\\chromedriver.exe\\");
		
	String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		
		System.out.println(value);
		
		
	}
	
}

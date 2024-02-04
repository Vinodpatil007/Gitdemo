package Parameteriztion;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex8_printAllRowInACol {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("E:\\java\\Apr21A.xlsx\\");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
		
		int hd = sh.getLastRowNum();
		
	for (int i = 0; i <=hd; i++) {
		
		String str = sh.getRow(i).getCell(0).getStringCellValue();
		
		System.out.println(str);
	}
	
	}
	
}

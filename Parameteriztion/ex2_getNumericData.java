package Parameteriztion;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex2_getNumericData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file =new FileInputStream("E:\\java\\Apr21A.xlsx\\");
		
				double value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(2).getNumericCellValue();
				
				System.out.println(value);
				
	}
	
}

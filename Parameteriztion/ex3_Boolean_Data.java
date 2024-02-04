package Parameteriztion;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex3_Boolean_Data {

	public static void main(String[] args) throws IOException {
		
			
	FileInputStream file = new FileInputStream("E:\\java\\Apr21A.xlsx\\");
	
	boolean w = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(3).getBooleanCellValue();
	
	System.out.println(w);
	
	}
	
}

package Parameteriztion;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex6_readNumericDataAsString {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("E:\\java\\Apr21A.xlsx\\");
		
		String str = WorkbookFactory.create(file).getSheet("Sheet2").getRow(11).getCell(2).getStringCellValue();
		
		System.out.println(str);
	}
	
}

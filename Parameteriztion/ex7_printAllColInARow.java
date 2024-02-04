package Parameteriztion;

import java.io.FileInputStream;
 
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex7_printAllColInARow {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("E:\\java\\Apr21A.xlsx\\");
	
	Sheet col = WorkbookFactory.create(file).getSheet("Sheet1");
	int lastcellIndex = col.getRow(0).getLastCellNum()-1;
	
	for (int i = 0; i<=lastcellIndex; i++) {
	
		String v = col.getRow(0).getCell(i).getStringCellValue();
	
		System.out.print(v+" ");
	}
	
	}
	

}

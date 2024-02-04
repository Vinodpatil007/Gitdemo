package Parameteriztion;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex9_printAllDataInShee {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("E:\\java\\Apr21A.xlsx\\");
	
		Sheet sh3 = WorkbookFactory.create(file).getSheet("Sheet3");

		int lastIndexOfRow = sh3.getLastRowNum();
		
		for (int i = 0; i <=lastIndexOfRow; i++) {
			
			int lastIndexOfCell = sh3.getRow(i).getLastCellNum()-1;
			
			for (int j = 0; j <=lastIndexOfCell; j++) {
			
				String data = sh3.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data+" ");
			}
			
			System.out.println();
		}
	        
	
	
	
	
	}
	
}
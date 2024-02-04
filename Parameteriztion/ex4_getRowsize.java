package Parameteriztion;



import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex4_getRowsize {

	public static void main(String[] args) throws IOException {
				
		FileInputStream file = new FileInputStream("E:\\java\\Apr21A.xlsx\\");
		
		int row = WorkbookFactory.create(file).getSheet("Sheet2").getLastRowNum();
		
		System.out.println(row);
		
		System.out.println(row+1);
	}
	
	
	
}

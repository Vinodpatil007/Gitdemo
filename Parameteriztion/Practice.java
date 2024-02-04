package Parameteriztion;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("E:\\java\\Apr21A.xlsx\\");
    
		 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		 
		int rl = sh.getLastRowNum();
	
			for (int i = 0; i <=rl; i++) {
				
				int cl = sh.getRow(i).getLastCellNum()-1;
			for (int j = 0; j <=cl; j++) {
			
				Cell type  = sh.getRow(i).getCell(j);
				CellType t = type.getCellType();
				
				 if (t==CellType.STRING) {
						System.out.print(type.getStringCellValue()+" ");
					}
					  else if (t==CellType.NUMERIC) {
						System.out.print(type.getNumericCellValue()+" ");
					}
					  else if (t==CellType.BOOLEAN) {
						System.out.print(type.getBooleanCellValue()+" ");
					}
		
			}
			System.out.println();
		}	
	}
	
}

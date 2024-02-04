package Parameteriztion;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex10_verifyTypeOfCell {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("E:\\java\\Apr21A.xlsx\\");
		
		 Cell cellinfo = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(0);
		
		CellType ActTypeOfCell = cellinfo.getCellType();
		
		if (ActTypeOfCell==CellType.STRING) {
			
			System.out.println(cellinfo.getStringCellValue());
		}
	
		else if (ActTypeOfCell==CellType.NUMERIC){
			
			System.out.println(cellinfo.getNumericCellValue());
		}
		else if (ActTypeOfCell==CellType.BOOLEAN) {
			
			System.out.println(cellinfo.getBooleanCellValue());
		}
	
	
	}
	
	
}
 
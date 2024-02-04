package Parameteriztion;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex11_printAllTypeDataInSheet {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("E:\\java\\Apr21A.xlsx\\");
		
		Sheet sh2 = WorkbookFactory.create(file).getSheet("Sheet2");
		
		int lastRowIndex = sh2.getLastRowNum();
		
		for (int i = 0; i <=lastRowIndex; i++) {
		
			int lastCellIndex = sh2.getRow(i).getLastCellNum()-1;
		
			for (int j = 0; j <=lastCellIndex; j++) {
				
				Cell cellInfo = sh2.getRow(i).getCell(j);
				
				CellType ActTypeOfCell = cellInfo.getCellType();
				
				if (ActTypeOfCell==CellType.STRING) {
					System.out.print(cellInfo.getStringCellValue()+"  ");
				}
				else if (ActTypeOfCell==CellType.NUMERIC) {
					System.out.print(cellInfo.getNumericCellValue()+"  ");
					
				}
				else if (ActTypeOfCell==CellType.BOOLEAN) {
					System.out.print(cellInfo.getBooleanCellValue()+"  ");
				}
			}
		System.out.println();
		}
	}	
}

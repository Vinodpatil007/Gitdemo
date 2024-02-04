package Parameteriztion;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex5_getCellsizeIn_aRow {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream file = new FileInputStream("E:\\java\\Apr21A.xlsx\\");
		
		short colsize = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getLastCellNum();
		
		System.out.println(colsize);
	}
}

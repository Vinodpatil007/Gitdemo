package Parameteriztion;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getNumberOfSheets {

public static void main(String[] args) throws IOException {
	
	FileInputStream file = new FileInputStream("E:\\java\\Apr21A.xlsx\\");
    int value = WorkbookFactory.create(file).getNumberOfSheets();
	
	System.out.println(value);
}
	
	
}

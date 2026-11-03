package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadBasic {
	
	
	public static void main(String[]args) throws IOException {
		
		//path
		String path="C:\\Users\\abush\\eclipse-workspace\\October_2026\\ExcelFiles\\ExcelRead-WB.xlsx";
		
		// get file
		File f=new File(path);
		
		//file to object
		FileInputStream f1= new FileInputStream(f);
		
		//workbook
		Workbook wb=new XSSFWorkbook(f1);
		
		//sheet
		Sheet sheet = wb.getSheet("sheet1");
		
		//row
		Row row = sheet.getRow(2);
		
		//cell
		Cell cell = row.getCell(0);
		
		//data
	//String data = cell.getStringCellValue();
		DataFormatter format=new DataFormatter();
		String data=format.formatCellValue(cell);
		
		//wb close
		wb.close();
		
		System.out.println(data);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

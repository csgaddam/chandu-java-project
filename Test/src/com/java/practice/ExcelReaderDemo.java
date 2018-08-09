package com.java.practice;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReaderDemo {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InvalidFormatException {
		File f = new File("C:\\Users\\cgadd\\OneDrive\\Desktop","Book1.xlsx");
		DataFormatter dataformatter = new DataFormatter();
		XSSFWorkbook workbook =  new XSSFWorkbook(f);
		XSSFSheet sheet = workbook.getSheetAt(0);
		for(Row row: sheet) {
			for(Cell cell: row) {
				String cellValue = dataformatter.formatCellValue(cell);
				System.out.print(cellValue+"  ");
			}
			System.out.println(" ");
			System.out.println("*********************************");
			//System.out.println(sheet.get);
		}
	}
}

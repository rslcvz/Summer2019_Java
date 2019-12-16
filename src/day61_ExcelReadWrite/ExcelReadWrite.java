package day61_ExcelReadWrite;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadWrite {


		
		/*
		 Create custom class that can read and write an excel file
		 Instance variables: String filepath;
		                     String sheetName;
		                     FileInputStream file;
		                     WorkBook excelfile;
		                     Sheet sheet;
		 Actions : ReadData(int row, int cell)  ==> String
		 WriteData(int row, int cell, setValue)   ==>  void
		 */
		String filepath;
        String sheetName;
        FileInputStream file;
        Workbook excelfile;
        Sheet sheet;
        
        Cell  cell;
        
        public ExcelReadWrite(String filepath, String sheetName) {
        	this.filepath = filepath;
        	this.sheetName = sheetName;
        	try {
        		file = new FileInputStream(filepath);
        		excelfile = WorkbookFactory.create(file);
        		sheet = (Sheet) excelfile.getSheet(sheetName);
        	}catch(Exception e) {
        		
        	}
        }
        public String readData(int rowNum, int cellNum) {
        	
        }
	}



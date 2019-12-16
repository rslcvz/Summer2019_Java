package day61_ExcelReadWrite;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ExcelRead {
	public static void main(String[] args) throws Exception {
		// you must use regular slash /  instead of backslash \
		String filePath="/Users/Guy/Desktop/Book1.xlsx";
		String sheetName="Sheet1"; //Name of the sheet
		FileInputStream file=new FileInputStream(filePath); //reads a file
		Workbook excelFile=WorkbookFactory.create(file);	//specially designed for Excel Files
//		XSSFWorkbook excelFile2=new WorkbookFactory(file);	does the same thing. XSSF is a class. Workbook is an interface
		
		Sheet sheet = excelFile.getSheet(sheetName); //gets the specific spread sheet from excel file
		Cell cell=sheet.getRow(0).getCell(0); //retrieves specific cell from the spreadSheet
		String cellData= cell.getStringCellValue(); //concerts the cell value to String data
		System.out.println(cellData);
		String cell1=sheet.getRow(1).getCell(0).getStringCellValue(); 
		System.out.println(cell1);
	}

		
		
		
		
		
	}


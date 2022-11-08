package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static String[][] getData(String excelfilename) throws IOException {
		// Open the file
		XSSFWorkbook book = new XSSFWorkbook("./testData/"+excelfilename+".xlsx");
		// Go to the sheet
		XSSFSheet sheet = book.getSheetAt(0);
		//	XSSFSheet sheet = book.getSheet("Sheet1");
		// Find the no of Rows
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row Count: " + rowCount);
		// Find the no of Cols
		XSSFRow headerRow = sheet.getRow(0);
		short colCount = headerRow.getLastCellNum();
		System.out.println("Column Count: "+colCount);
		// Create an empty 2D array to store the data
		String[][] data = new String[rowCount][colCount];
		// Go to each cell and read the data
		for(int i = 1 ; i <= rowCount ; i++) {
			XSSFRow eachRow = sheet.getRow(i);
			for(int j = 0; j < colCount ; j++) {
				XSSFCell eachCell = eachRow.getCell(j);
				String value = eachCell.getStringCellValue();
				data[i-1][j] = value;
				System.out.println(value);
			}
		}
		
		// Close the book
		book.close();
		return data;
		
		
		
		
		
		
	}
}

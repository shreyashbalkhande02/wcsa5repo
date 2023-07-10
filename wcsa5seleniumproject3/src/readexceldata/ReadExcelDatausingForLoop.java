package readexceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelDatausingForLoop {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
	
	
	
	for(int i=1;i<=10;i++) {
	FileInputStream file = new FileInputStream("./data/TestData.xlsx");
	Workbook wb = WorkbookFactory.create(file);
	Sheet sheet = wb.getSheet("IPL");
	Row row = null;
	 
	row = sheet.getRow(i);
	Cell cell = row.getCell(1);
	String data = cell.getStringCellValue();
	Thread.sleep(2000);
	System.out.println(data);
	}
}

}


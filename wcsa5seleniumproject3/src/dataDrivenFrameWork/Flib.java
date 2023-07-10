package dataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String readExcelData(String ExcelData, String sheetName, int r, int col)
			throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(ExcelData);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(r);
		Cell cell = row.getCell(col);
		return cell.getStringCellValue();

	}

	public int getLastRowCount(String Excelpath, String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(Excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int last = sheet.getLastRowNum();
		return last;

	}

	public void writeExcelData(String ExcelData, String sheetName, int r, int c, String cellvalue)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(ExcelData);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(r);
		Cell cell = row.createCell(c);
		cell.setCellValue(cellvalue);

		FileOutputStream fos = new FileOutputStream(ExcelData);
		wb.write(fos);
		
	}

}

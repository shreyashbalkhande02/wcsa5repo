package readexceldata;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeMultipleData {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		

		FileInputStream fis = new FileInputStream("./data/Actitime.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("INVALIDCRED");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		
		Row row1 = sheet.getRow(1);
		Cell cell1 = row1.getCell(1);
		String data1 = cell1.getStringCellValue();
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=6jalrhn8cpurg");
		 WebElement un = driver.findElement(By.xpath("//input[@name='username']"));
		 un.sendKeys(data);
		WebElement pwd = driver.findElement(By.xpath("//input[@name='pwd']"));
		pwd.sendKeys(data1);
		WebElement lb = driver.findElement(By.xpath("//a[@id='loginButton']"));
		lb.click();
		
		
	    
	}

}

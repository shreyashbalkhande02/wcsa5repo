package dataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InValidCredActiTime {
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=1c2ps3203o1iu");
		
		Flib data = new Flib();
		int rc = data.getLastRowCount("./data/Actitime.xlsx", "INVALIDCRED");
		for(int i=1;i<=rc;i++)
		{
		driver.findElement(By.name("username")).sendKeys(data.readExcelData("./data/Actitime.xlsx", "INVALIDCRED", i, 0));
		driver.findElement(By.name("pwd")).sendKeys(data.readExcelData("./data/Actitime.xlsx", "INVALIDCRED", i, 1));
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		System.out.println("Test Case Passed");
		}
		
	}

}

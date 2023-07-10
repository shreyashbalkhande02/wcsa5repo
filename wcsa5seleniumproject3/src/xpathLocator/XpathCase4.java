package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'user')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[contains(@name,'word')]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(@class,'oxd')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(@class,'oxd-userdropdown-name')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
	}

}

//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
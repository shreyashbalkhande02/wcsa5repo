package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signup {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://spiceclub.spicejet.com/signup");
		driver.findElement(By.xpath("//select[@class='form-control form-select ']")).click();
		driver.findElement(By.xpath("//option[@value='MR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Shreyash");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Balkhande");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@class='form-control form-select']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='IN']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='dobDate']")).sendKeys("02/09/1998");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='+91 01234 56789']")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email_id']")).sendKeys("shreyash@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='new-password']")).sendKeys("Shreyuu@912");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='c-password']")).sendKeys("Shreyuu@912");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='defaultCheck1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-red']")).click();
		
		
	}

}

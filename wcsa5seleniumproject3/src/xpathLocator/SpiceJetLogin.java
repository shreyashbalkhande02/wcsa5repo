package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetLogin {
	 
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-testId='user-mobileno-input-box']")).sendKeys("9874563321");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-testId='password-input-box-cta']")).sendKeys("shreyash123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='LOGIN']")).click();
		
		
	}
}

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixSignUpByXpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chromedriver","./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/Login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='userLoginId']")).sendKeys("shreyash@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("9874563210");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}

}

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramSignin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='_aa4b _add6 _ac4d']")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='fullName']")).sendKeys("Shreyash Balkhande");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("mr.shreyuu");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("shreyash");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[class='_acan _acap _acas _aj1-']")).click();
	}
}

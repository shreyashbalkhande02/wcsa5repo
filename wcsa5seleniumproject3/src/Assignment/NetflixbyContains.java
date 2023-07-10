package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixbyContains {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chromedriver", "./drivers.chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/Login");
		driver.findElement(By.xpath("//input[contains(@id,'id_userLoginId')]")).sendKeys("shreyash@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'id_password')]")).sendKeys("9874563210");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@class,'btn lo')]")).click();
		

	}

}

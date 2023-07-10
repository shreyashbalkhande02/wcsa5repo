package task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bluestone {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.xpath("//span[@id='confirmBtn']")).click();
	
		WebElement frameE = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		Thread.sleep(2000);
		driver.switchTo().frame(frameE);
		driver.findElement(By.xpath("//div[@id='chat-icon']")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='chat-fc-name']")).sendKeys("Panduu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='chat-fc-email']")).sendKeys("pandu@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='chat-fc-phone']")).sendKeys("9874563210");
		driver.findElement(By.xpath("//a[@class='fc-button']")).click();
		
	}

}

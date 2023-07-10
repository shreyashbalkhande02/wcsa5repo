
package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlinkitLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blinkit.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/header/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div")).sendKeys("pune");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/header/div[3]/div[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class*='login-phone_']")).sendKeys("9874563210");
	}

}

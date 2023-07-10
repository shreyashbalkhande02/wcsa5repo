
package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleMapTask1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		Thread.sleep(2000);
		WebElement frameE = driver.findElement(By.xpath("//iframe[@name='callout']"));
		
		driver.switchTo().frame(frameE);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//span[@data-text='Maps']")).click();
		
	}

}

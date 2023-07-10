package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/");
	   
	     driver.findElement(By.xpath("//input[@name='username']")).sendKeys("shreyash");
	     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1236545");
	     boolean Store = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).isEnabled();
	     
	     System.out.println(Store);
	}
}

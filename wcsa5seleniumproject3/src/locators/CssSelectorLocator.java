package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		driver.findElement(By.cssSelector("input[id='id_userLoginId']")).sendKeys("roshanbhosale20@gmail.com");
		driver.findElement(By.cssSelector("input[id$='rd']")).sendKeys("Vivo@02a");
		driver.findElement(By.cssSelector("button[Class='btn login-button btn-submit btn-small']")).click();
		
		
		
	}

}

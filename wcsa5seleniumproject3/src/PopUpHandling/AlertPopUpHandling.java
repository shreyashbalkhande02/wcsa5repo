package PopUpHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandling {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/shrey/Desktop/wcsa5/AlertPopUpHandling.html");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}

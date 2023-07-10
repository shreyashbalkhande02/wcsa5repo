package ActionClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElement {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@id='confirmBtn']")).click();
		
		Robot robot = new Robot();
		
		
		for(int i=0;i<=1;i++)
		{
			Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Coins ']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
		
		driver.findElement(By.xpath("(//span[text()='2 gram'])[1]")).click();
		WebElement target = driver.findElement(By.xpath("//a[@id='5921']"));
		if(target.isDisplayed())
		{
			Thread.sleep(2000);
			driver.close();
			System.out.println("TestCase is Pass");
		}
		
		
		
		
	}

}

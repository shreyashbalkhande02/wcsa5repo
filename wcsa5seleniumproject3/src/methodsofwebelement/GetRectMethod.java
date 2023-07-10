package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		  Rectangle Store = driver.findElement(By.xpath("//h2[@class='selenium']")).getRect();
		  
		 int xaxis = Store.getX();
		 int yaxis = Store.getY();
		 
		int height = Store.getHeight();
		int width = Store.getWidth();
		 
		 System.out.println(xaxis+" "+yaxis+" "+height+" "+width);
	}
}

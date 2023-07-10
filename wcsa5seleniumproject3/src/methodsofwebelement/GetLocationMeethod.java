package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMeethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		
		Point Store = driver.findElement(By.xpath("//h2[@class='selenium']")).getLocation();
		
		int Store1 = Store.getX();
		int Store2 = Store.getY();
		System.out.println("X-axis :"+Store1+" "+"Y-axis :"+Store2);
		

	}

}

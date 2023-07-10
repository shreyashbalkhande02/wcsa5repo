package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do;jsessionid=52vf0fnj502ti");
		
		boolean Checkbox = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		
		System.out.println(Checkbox);
		 WebElement Object = driver.findElement(By.id("keepLoggedInCheckBox"));
		 Object.click();
	       boolean Verify = Object.isSelected();
	       System.out.println(Verify);
		
	}

}

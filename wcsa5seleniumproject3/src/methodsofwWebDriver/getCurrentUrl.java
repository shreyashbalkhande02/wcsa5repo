package methodsofwWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrl {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		String Url = driver.getCurrentUrl();
		
		driver.close();
		System.out.println(Url);

	}

}

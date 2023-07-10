package methodsofwWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettitlemethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		driver.close();

	}

}

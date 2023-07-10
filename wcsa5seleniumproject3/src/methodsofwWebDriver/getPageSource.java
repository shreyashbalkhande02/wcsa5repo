package methodsofwWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPageSource {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		String PageSource = driver.getPageSource();
		System.out.println(PageSource);
		driver.close();
	}

}

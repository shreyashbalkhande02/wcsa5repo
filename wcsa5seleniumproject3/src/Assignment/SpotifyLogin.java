package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpotifyLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.spotify.com/en/login?continue=https");
		driver.findElement(By.id("login-username")).sendKeys("shreyash");
		driver.findElement(By.id("login-password")).sendKeys("123654");

	}

}

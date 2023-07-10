package keywordDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib {
	static WebDriver driver;

	//it is use to open and close the browser
	
	public void openBrowser() throws IOException
	{
	Flib flib = new Flib();
	String browserValue = flib.readPropertyData(",/data/config.properties", "Browser");
	String url = flib.readPropertyData(",/data/config.properties", "Url");
	
	if(browserValue.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		
	}
	else if(browserValue.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
	}
	else if(browserValue.equalsIgnoreCase("edge"))
	{
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
	
	}
	}
	public void closeBrowser()
	{
		driver.quit();
	}

}

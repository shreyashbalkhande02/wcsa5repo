package methodsofwWebDriver;

import org.asynchttpclient.webdav.WebDavCompletionHandlerBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.close();
		}

}

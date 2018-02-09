package selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseSeleniumTest {

	static {
		System.setProperty("webdriver.gecko.driver", "C:\\Temp\\driver\\geckodriver.exe");
		
		if ("chrome".equals("chome")) {
			driver = new ChromeDriver();
		} else if ("firefox".equals("chome")) {
		   driver	= new FirefoxDriver();
		}
	}
	
	static WebDriver driver;
	
	
	
	
}

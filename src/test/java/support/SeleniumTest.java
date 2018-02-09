package support;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class SeleniumTest {
	WebDriver driver = null;

	//Page Object model. 
	
	
	@FindBy(how = How.ID, using = "txtUsername")
	WebElement emailAddress;
	WebElement password; 
	
	public WebElement columnLeftTextarea;
	
	
	static {
		System.setProperty("webdriver.gecko.driver", "/Users/Developer/Software/SeleniumDrivers/geckodriver");
	}

	@Test
	public void testA1() {
		driver = new FirefoxDriver();
		driver.navigate().to("http://opensource.demo.orangehrmlive.com/");
		 WebElement emailAddress2 = driver.findElement(By.id("txtUsername"));
		driver.findElement(By.id("txtPassword")).sendKeys("admin");

		
		String bgColor = driver.findElement(By.id("txtPassword")).getCssValue("background-color");
		
		Assert.assertEquals("#fdf0e9", bgColor);
		
		 List<WebElement> aaa3 = driver.findElements(By.id("txtPassword"));
		
		driver.findElement(By.cssSelector(".primary-btn"));

		driver.findElement(By.id("btnLogin")).click();
		String welcomeText = driver.findElement(By.id("welcome")).getText();

		Assert.assertEquals("Welcome Admin", welcomeText);
		
		System.out.println("Test 11");
	}
	
	public void dummyone() {
		System.out.println("Dummy one");
	}
}

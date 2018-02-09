package support;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginScenarioOutline {
WebDriver driver = null;
	
	static {
	  System.setProperty("webdriver.gecko.driver", "/Users/Developer/Software/SeleniumDrivers/geckodriver");	
	}
	
	@Given("^user navigates to SOFTWARETESTINGHELP\\.COM$")
	public void user_navigates_to_SOFTWARETETINGHELP_COM() throws Throwable {
	    driver = new FirefoxDriver();
	    driver.navigate().to("http://opensource.demo.orangehrmlive.com/");
	}


	@When("^user logs in using Username as Tom and Password password(\\d+)$")
	public void user_logs_in_using_Username_as_Tom_and_Password_password(int arg1) throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		
		driver.findElement(By.cssSelector(".primary-btn"));
		
		driver.findElement(By.id("btnLogin")).click();
	}

	@When("^user logs in using Username as Harry and Password password(\\d+)$")
	public void user_logs_in_using_Username_as_Harry_and_Password_password(int arg1) throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		 driver.findElement(By.id("btnLogin")).click();
	}

	@When("^user logs in using Username as Jerry and Password password(\\d+)$")
	public void user_logs_in_using_Username_as_Jerry_and_Password_password(int arg1) throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		 driver.findElement(By.id("btnLogin")).click();
	}


	@Then("^login should be successful$")
	public void login_should_be_successful() throws Throwable {
	    String welcomeText = driver.findElement(By.id("welcome")).getText();
	    
	    Assert.assertEquals("Welcome Admin", welcomeText);

	}
}

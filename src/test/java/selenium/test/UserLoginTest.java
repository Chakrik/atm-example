package selenium.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class UserLoginTest {
	
	static {
		System.setProperty("webdriver.gecko.driver", "C:\\Temp\\driver\\geckodriver.exe");
	}
	
	WebDriver driver = new FirefoxDriver();
	
	@Given("^I navigate to \"(.*?)\"$")
	public void i_navigate_to(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		driver.get(arg1);
	}

	@Given("^I enter \"(.*?)\" into input field having id \"(.*?)\"$")
	public void i_enter_into_input_field_having_id(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id(arg2)).sendKeys(arg1);
	
	}

	@When("^I click on element having class \"(.*?)\"$")
	public void i_click_on_element_having_class(String arg1) throws Throwable {
		driver.findElement(By.cssSelector("button.radius")).click();
		
		//driver.findElement(By.xpath("//button[@class='radius']")).click();
	}

	@Then("^I should get logged-in$")
	public void i_should_get_logged_in() throws Throwable {
		String h2Text = driver.findElement(By.tagName("h2")).getText();
		
		Assert.assertEquals("Secure Area", h2Text);
	}

	@Then("^I should not get logged-in$")
	public void i_should_not_get_logged_in() throws Throwable {
		String h2Text = driver.findElement(By.tagName("h2")).getText();
		
		Assert.assertEquals("Login Page", h2Text);
	}
	
	@Then("^I close browser$")
	public void i_close_browser() throws Throwable {
		
		driver.close();
	}
	
}

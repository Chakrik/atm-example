package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleTest extends BaseSeleniumTest {

	
	@Given("^I am on \"(.*?)\" website$")
	public void i_am_on_website(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@When("^I enter \"(.*?)\" into the search box$")
	public void i_enter_into_the_search_box(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("lst-ib")).sendKeys(arg1);
	}
	

	@When("^I click the \"(.*?)\" button$")
	public void i_click_the_button(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("btnK")).click();
	}

	@When("^I click the link \"(.*?)\"$")
	public void i_click_the_link(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText(arg1)).click();
	}

	@Then("^I should get Carolina Wikipedia Page$")
	public void i_should_get_Carolina_Wikipedia_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement h1text = driver.findElement(By.tagName("h1"));
		String text = h1text.getText();
		Assert.assertEquals("Carolina", "text");
	}
}

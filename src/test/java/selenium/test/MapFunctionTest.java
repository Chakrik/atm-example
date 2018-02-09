package selenium.test;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MapFunctionTest {

	
	private Map<String, Integer> map;

	@Given("^the price list for a coffee shop$")
	public void the_price_list_for_a_coffee_shop(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		map = (Map<String, Integer>) arg1;
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		for ( Entry<String, Integer> entry :entrySet) {
			entry.getKey();
			entry.getValue();
		}
		
	    throw new PendingException();
	}

	@When("^I order (\\d+) coffee and (\\d+) donut$")
	public void i_order_coffee_and_donut(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^should I pay (\\d+)$")
	public void should_I_pay(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}

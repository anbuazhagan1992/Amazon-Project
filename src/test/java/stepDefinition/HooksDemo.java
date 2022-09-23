package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemo {
	
	@Given("User is on the first page")
	public void user_is_on_the_first_page() {
	    
		System.out.println("This is first page");
		
	}

	@When("User is on the second page")
	public void user_is_on_the_second_page() {
	    
		System.out.println("This is second page");

		
	}

	@Then("User is on the third page")
	public void user_is_on_the_third_page() {
	   
	System.out.println("This is third page");

	}


}

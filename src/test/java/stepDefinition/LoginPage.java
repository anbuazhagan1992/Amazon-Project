package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
	
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		
		System.out.println("Login Page");
	    
	}

	@When("User enters the valid name and password")
	public void user_enters_the_valid_name_and_password() {
		
		System.out.println("Entered the valid credentials");
	    
	}
	
	@When("User enters the invalid name and invalid password")
	public void user_enters_the_invalid_name_and_invaild_password() {
		
		System.out.println("Entered the valid credentials");
	    
	}
	
	@When("User enters the invalid name and valid password")
	public void user_enters_the_invalid_name_and_valid_password() {
		
		System.out.println("Entered the valid credentials");
	    
	}
	
	@When("User enters the valid name and invalid password")
	public void user_enters_the_valid_name_and_invalid_password() {
		
		System.out.println("Entered the valid credentials");
	    
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		
		System.out.println("Clicked the login button");	   
	}

	@Then("User is on the homes page")
	public void user_is_on_the_home_page() {
		
		System.out.println("Homes Page");	    
	}

}

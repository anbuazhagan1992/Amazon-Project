package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class DemoHooks {

	@Before
	public void beforeScenario() {
		
		System.out.println("I am launching before scenario");
	}
	
	@After
	public void afterScenario() {
		
		System.out.println("I am closing after scenario");
	}
}

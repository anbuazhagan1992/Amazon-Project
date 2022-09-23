package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPage {
	
	
	WebDriver driver;
	
	@Given("User is on Amazon home page")
	public void user_is_on_amazon_home_page() {
	    
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
	}

	@When("User enters the {string} in search bar")
	public void user_enters_the_in_search_bar(String string) {

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(string + Keys.ENTER);
	}

	@Then("User is on product details page")
	public void user_is_on_product_details_page() {
	    
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}

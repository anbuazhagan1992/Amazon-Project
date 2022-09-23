package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataTab {

	WebDriver driver;
	
	@Given("User is on the login page1")
	public void user_is_on_the_login_page1() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
	    
	}

	@When("User enters the username and password")
	public void user_enters_the_username_and_password(DataTable table) {
		
		/*Map<Object, Object> asMap = table.asMap(getClass(), getClass());
		
		Object username = asMap.get("username");
		
		System.out.println(username); */ //for single key and value go for asMap 
		
		List<Map<String, String>> asMaps = table.asMaps(); // for multiple keys and values go for asMaps
		
		System.out.println(asMaps);
		
		Map<String, String> map = asMaps.get(1);
		
		System.out.println(map);
		
		String username = map.get("username");
		String password = map.get("password");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
		
	}

	@When("User clicks the login button1")
	public void user_clicks_the_login_button1() {
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	    
	}

	@Then("User is on the home page1")
	public void user_is_on_the_home_page1() {
	    
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}

package runnerPack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/vki/eclipse-workspace/CucumberSession/src/test/resources/Feature/AmazonLogin.feature", glue = {"stepDefinition"},

plugin = {"usage", "html:target/report.html"}

                		
		)

public class AmazonRunner {
	
	
	

}

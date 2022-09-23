package runnerPack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/vki/eclipse-workspace/CucumberSession/src/test/resources/Feature/Login.feature", glue = {"stepDefinition"},
              monochrome = true,  plugin = {"usage", "html:target/report.html"}, tags = "~@smoketesting or @sanitytesting or ~@regressiontesting"
		
		)

public class TestRunner {

	
}

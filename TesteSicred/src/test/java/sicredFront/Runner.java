package sicredFront;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(


		
		features = "src/test/resources/features/",
		glue = "sicredFront",
		monochrome = true,
		tags ="@sicred",
		plugin = {"pretty","html:target/report.html"},
		dryRun = false)
public class Runner {

}

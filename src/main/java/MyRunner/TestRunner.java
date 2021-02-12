package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
 	@CucumberOptions(features = "C:\\Program Files\\BDD_TakeHomeChallengeProject\\src\\main\\java\\Features\\patientCreation.feature", //the path of the feature files
	glue={"stepDefinitions"})

	public class TestRunner {
	 
	}


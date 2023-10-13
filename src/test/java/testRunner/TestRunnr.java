package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {".//Features//Login.feature"},
		//features = {".//Features//LoginDDT.feature"},
		//features = "@target/rerun.txt",  // runs only failures  
		glue="stepDefinitions",
		plugin= {"pretty","html:reports/myreport.html",
				"json:reports/myreport.json"
				},
		dryRun=false,
		monochrome=true
		
		
		)

public class TestRunnr {

}

package TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//
//@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"C:\\Users\\biswa\\eclipse-workspace\\CucumberPracticesNaveenAuto\\src\\main\\java\\AppFeatures" }, glue = {
				"Stepdefinations" }, plugin = { "pretty" }

)

public class Run extends AbstractTestNGCucumberTests {

}

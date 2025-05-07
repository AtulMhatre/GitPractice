package uiAppFeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = {"@target/failedScenarios.txt"}, // path of Feature file package

		glue = {"uiAppFeature"}, // path of runner package

		plugin = {"pretty",
				//"rerun:target/failedScenarios.txt" // for failed test cases
		}

)

public class FaliedTestRunner extends AbstractTestNGCucumberTests{

}

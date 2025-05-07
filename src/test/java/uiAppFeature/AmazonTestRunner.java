package uiAppFeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		tags="@sanity or @regression",features = {"src\\test\\resources\\uiappfeature"}, // path of Feature file package

		glue = {"uiAppFeature"}, // path of runner package

		plugin = {"pretty", "rerun:target/failedScenarios.txt", "html:taget/report/report.html" // for failed test cases
		}

)

public class AmazonTestRunner extends AbstractTestNGCucumberTests {

}
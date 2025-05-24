package uiAppFeature;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import qa.DriverFactory;
import utility.PropReader;

public class Hooks {
	WebDriver driver;

	@Before
	public void launchBrowser() throws IOException {

		DriverFactory df = new DriverFactory();
		String browserName = PropReader.readPropData("browser");

		driver = df.initBrowser(browserName);
		driver.manage().window().maximize();

	}

	@After(order=1)
	public void tearDown() {

		driver.quit();
	}

	
	@After(order=2)
	public void failedTestCases(Scenario scenario) {
		if (scenario.isFailed()) {

			byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "failedScreenShot");
			
		}
		
		
	}
//	@AfterMethod
//	public void afterMethod(ITestResult result) throws IOException {
//
//		if (ITestResult.FAILURE == result.getStatus()) {
//
//			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(src, new File(
//					"C:\\Users\\Atulp\\eclipse-workspace\\APITesting\\BDD\\FullBDDProject\\FailedScreenshots\\loginfailed.png"));
//
//		}
//
//	}
}
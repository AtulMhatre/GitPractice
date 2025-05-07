package uiAppFeature;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
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

	@After
	public void tearDown() {

		driver.quit();
	}

}
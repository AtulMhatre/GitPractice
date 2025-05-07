package uiAppFeature;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import qa.DriverFactory;

public class HomePageSteps {
	HomePage homepage = new HomePage(DriverFactory.getDriver());

	@Given("User is on landing page")
	public void user_is_on_landing_page() {

		// direclty call method by using classname.method name , because method is
		// static

		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://www.amazon.in/");

	}

	@Then("Tiltle contains {string}")
	public void tiltle_contains(String string) {

		String titleOfPage = homepage.getTitle();
		boolean isPresent = titleOfPage.contains(string);
		Assert.assertTrue(isPresent);

	}

	@Then("Cart Icon should displayed")
	public void cart_icon_should_displayed() {
		boolean isVisible = homepage.isCartIconDsplayed();
		
		Assert.assertEquals(isVisible, true);

	}

}

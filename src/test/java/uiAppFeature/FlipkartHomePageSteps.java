package uiAppFeature;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FlipkartHomePage;
import qa.DriverFactory;

public class FlipkartHomePageSteps {

	FlipkartHomePage fH = new FlipkartHomePage(DriverFactory.getDriver());

	@Given("User is at landing page")
	public void user_is_on_landing_page() {

		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://www.flipkart.com/");

	}

	@Then("Title contains {string}")
	public void title_contains(String string) {
		String titleofFlipkartPage = fH.titleofPage();
		boolean isPresent=titleofFlipkartPage.contains(string);
		Assert.assertTrue(isPresent);

	}

	@When("user searches for {string} in text box")
	public void user_searches_for_in_text_box(String string) {
		
		fH.searchingProduct();

	}

	@Then("mobile search results should displayed")
	public void mobile_search_results_should_displayed() {
		boolean isGettingDisplayed=fH.verifysearchResult();
		Assert.assertTrue(isGettingDisplayed);

	}

}

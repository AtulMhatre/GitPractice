package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private WebDriver driver;
	private WebDriverWait wait;

	@FindBy(xpath = "//a[@id='nav-cart']")
	WebElement cartICon;

	public HomePage(WebDriver driver) {  // Constructor 

		this.driver =driver;
		PageFactory.initElements(driver, this);
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));

	}

	public String getTitle() {
		String titleOfPage = driver.getTitle();
		return titleOfPage;
	}

	public boolean isCartIconDsplayed() {

		wait.until(ExpectedConditions.visibilityOf(cartICon));

		boolean isDisplayed = cartICon.isDisplayed();

		return isDisplayed;

	}

}

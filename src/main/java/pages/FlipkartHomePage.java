package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartHomePage {
	private WebDriver driver;

	private @FindBy(xpath = "//input[@placeholder='Search for Products, Brands and More']")

	WebElement SearchTable;

	private @FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement SearchButton;
	
	private @FindBy (xpath="//div[@class='_6i1qKy'][normalize-space()='SAMSUNG']")
	WebElement SamsungProduct;

	public FlipkartHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public String titleofPage() {
		String titleofPage = driver.getTitle();
		return titleofPage;

	}

	public void searchingProduct() {

		SearchTable.sendKeys("mobile");
		SearchButton.click();
	
		
	}
	
	public boolean verifysearchResult() {
		boolean product = SamsungProduct.isDisplayed();
		return product;
		
	}

}

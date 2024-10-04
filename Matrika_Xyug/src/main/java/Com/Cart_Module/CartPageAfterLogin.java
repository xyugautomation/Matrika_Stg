package Com.Cart_Module;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPageAfterLogin {

	@FindBy(xpath = "//div[@routerlink='/cart-in']//img[@class='user-img']")
	public WebElement cartButton;

	@FindBy(xpath = "//h6[normalize-space()='Total Items :']")
	public WebElement TotalTitemtext;

	@FindBy(xpath = "//p[@class='Matrika-para']")
	public WebElement MatrikaPromisesText;

	@FindBy(xpath = "(//button[@class='btn btn-info'])[1]")
	public WebElement RemoveButton;

	@FindBy(xpath = "//button[normalize-space()='Yes, Delete it']")
	public WebElement RemoveButtonyesYesOrNot;

	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	public WebElement RemoveButtoncancel;

	@FindBy(xpath = "//button[normalize-space()='Checkout']")
	public WebElement CheckOutButton;

	@FindBy(xpath = "//p[@class='Total-Amount-Rupees']")
	public WebElement amountElement;

	@FindBy(xpath = "//div[@aria-label='No products in cart']")
	public WebElement NoProductsInCart;

	public CartPageAfterLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void MatrikaPromisesTextOrNot(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.visibilityOf(MatrikaPromisesText));
		boolean totalIteam = MatrikaPromisesText.isDisplayed();
		if (totalIteam == true) {
			System.out.println("MatrikaPromises Text is display");

		} else {

			System.out.println("MatrikaPromises Text is Not display");
		}

	}

	public void TotalIteamTextDisplayOrNot(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.visibilityOf(TotalTitemtext));
		boolean totalIteam = TotalTitemtext.isDisplayed();
		if (totalIteam == true) {
			System.out.println("totalIteam Text is display");

		} else {

			System.out.println("totalIteam Text is Not display");
		}

	}

	public void NavigateTocheckOutPage(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.elementToBeClickable(CheckOutButton)).click();

		wait.until(ExpectedConditions.urlToBe("http://stg-ecom.goldbox.gold/check-out"));

		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.equals("http://stg-ecom.goldbox.gold/check-out")) {
			System.out.println("Redirected to the check-out page.");
		} else {
			System.out.println(" button did not redirect to the check-out page. Current URL: " + currentUrl);
		}

	}

	public void NavigateToCartPage(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		cartButton.click();

	}

	public void RemoveButtonDisplayOrNot(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(RemoveButton));

		boolean removeButton = RemoveButton.isDisplayed();

		if (removeButton == true) {

			System.out.println("RemoveButton is display");

		} else {

			System.out.println("RemoveButton is not display..!!");
		}

	}

	public void RemoveButtonClickable(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.elementToBeClickable(RemoveButton)).click();

		if (RemoveButton.isEnabled()) {
			System.out.println("RemoveButton is clickable");
		} else {
			System.out.println("RemoveButton is not clickable");

		}

	}

	public void YesDeleteItButtonClickable(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(RemoveButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(RemoveButtonyesYesOrNot));
		if (RemoveButtonyesYesOrNot.isEnabled()) {
			System.out.println("Yes Button is clickable");
		} else {
			System.out.println("Yes Button is not clickable");

		}

	}

	public void CancelButtonClickable(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(RemoveButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(RemoveButtoncancel));
		if (RemoveButtoncancel.isEnabled()) {
			System.out.println("RemoveButtoncancel is clickable");
		} else {
			System.out.println("RemoveButtoncancel is not clickable");

		}

	}

	public void CancelButtonDisplayOrNot(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(RemoveButton)).click();
		wait.until(ExpectedConditions.visibilityOf(RemoveButtoncancel));
		boolean totalIteam = RemoveButtoncancel.isDisplayed();
		if (totalIteam == true) {
			System.out.println("RemoveButtoncancel Text is display");

		} else {

			System.out.println("RemoveButtoncancel Text is Not display");
		}

	}

	public void YesButtonDisplayOrNot(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(RemoveButton)).click();
		wait.until(ExpectedConditions.visibilityOf(RemoveButtonyesYesOrNot));
		boolean totalIteam = RemoveButtonyesYesOrNot.isEnabled();
		if (totalIteam == true) {
			System.out.println("RemoveButtonyesYesOrNot Text is display");

		} else {

			System.out.println("RemoveButtonyesYesOrNot Text is Not display");
		}

	}

	public void CheckoutButtonDisplayOrNot(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.visibilityOf(CheckOutButton));
		boolean totalIteam = CheckOutButton.isDisplayed();
		if (totalIteam == true) {
			System.out.println("CheckOutButton Text is display");

		} else {

			System.out.println("CheckOutButton Text is Not display");
		}

	}

	public void checkCartAndAddToCart() throws InterruptedException {

		cartButton.click();
		Thread.sleep(3000);
		if (NoProductsInCart.isDisplayed()) {
			System.out.println("No products in the cart. Continue shopping.");

			System.out.println("Product added to the cart successfully.");
		} else {
			System.out.println("There are products in the cart.");
		}
	}

	// get text amount
	public void getamount() throws InterruptedException {
		Thread.sleep(3000);
		// Get the text from the element
		String payableAmount = amountElement.getText();

		// Print the extracted amount
		System.out.println("The payable amount is: " + payableAmount);

	}

}

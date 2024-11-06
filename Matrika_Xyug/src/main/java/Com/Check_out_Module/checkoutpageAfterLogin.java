package Com.Check_out_Module;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkoutpageAfterLogin {

	@FindBy(xpath = "//div[@routerlink='/cart-in']")
	public WebElement cartButton;

	@FindBy(xpath = "//button[normalize-space()='Checkout']")
	public WebElement CheckOutButton;

	@FindBy(xpath = "//div[@aria-label='No products in cart']")
	public WebElement NoProductsInCart;

	@FindBy(xpath = "//div[@routerlink='/cart-in']")
	public WebElement Checkoutclicking;

	@FindBy(xpath = "//div[@routerlink='/cart-in']")
	public WebElement CheckoutProductstext;

	@FindBy(xpath = "//div[@routerlink='/cart-in']")
	public WebElement TotalText;

	@FindBy(xpath = "//div[@routerlink='/cart-in']")
	public WebElement BookingAccountText;

	@FindBy(xpath = "//div[@routerlink='/cart-in']")
	public WebElement BookingAccountBalanceText;

	@FindBy(xpath = "//div[@routerlink='/cart-in']")
	public WebElement AddMoneyText;

	@FindBy(xpath = "//div[@routerlink='/cart-in']")
	public WebElement GiftcardText;

	@FindBy(xpath = "//div[@routerlink='/cart-in']")
	public WebElement CouponsText;

	@FindBy(xpath = "//div[@routerlink='/cart-in']")
	public WebElement PayableAmounttext;

	@FindBy(xpath = "//div[@routerlink='/cart-in']")
	public WebElement PayWithText;

	@FindBy(xpath = "//div[@routerlink='/cart-in']")
	public WebElement MatrikaPromisesText;

	public checkoutpageAfterLogin(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void CheckOutButtonclick(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(CheckOutButton)).click();

	}

	// Method to click Checkout button if it's clickable
	public void clickCheckoutButton(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(Checkoutclicking));
		if (Checkoutclicking.isEnabled()) {
			Checkoutclicking.click();
			System.out.println("Checkout button clicked.");
		} else {
			System.out.println("Checkout button is not clickable.");
		}
	}

	// Method to handle Checkout Products text
	public void checkCheckoutProductsText(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(CheckoutProductstext));

		if (CheckoutProductstext.isDisplayed()) {
			System.out.println("Checkout Products text is displayed.");
		} else {
			System.out.println("Checkout Products text is not displayed.");
		}
	}

	// Method to check Total Text
	public void checkTotalText(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(TotalText));

		if (TotalText.isDisplayed()) {
			System.out.println("Total text is displayed.");
		} else {
			System.out.println("Total text is not displayed.");

		}
	}

	// Similarly, you can create separate methods for each of the remaining elements
	public void checkBookingAccountText(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(BookingAccountText));

		if (BookingAccountText.isDisplayed()) {
			System.out.println("Booking Account text is displayed.");
		} else {
			System.out.println("Booking Account text is not displayed.");
		}
	}

	public void checkBookingAccountBalanceText(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(BookingAccountBalanceText));

		if (BookingAccountBalanceText.isDisplayed()) {
			System.out.println("Booking Account Balance text is displayed.");
		} else {
			System.out.println("Booking Account Balance text is not displayed.");
		}
	}

	public void checkAddMoneyText(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(AddMoneyText));

		if (AddMoneyText.isDisplayed()) {
			System.out.println("Add Money text is displayed.");
		} else {
			System.out.println("Add Money text is not displayed.");
		}
	}

	public void checkGiftcardText(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(GiftcardText));

		if (GiftcardText.isDisplayed()) {
			System.out.println("Giftcard text is displayed.");
		} else {
			System.out.println("Giftcard text is not displayed.");
		}
	}

	public void checkCouponsText(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(CouponsText));

		if (CouponsText.isDisplayed()) {
			System.out.println("Coupons text is displayed.");
		} else {
			System.out.println("Coupons text is not displayed.");
		}
	}

	public void checkPayableAmountText(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(PayableAmounttext));

		if (PayableAmounttext.isDisplayed()) {
			System.out.println("Payable Amount text is displayed.");
		} else {
			System.out.println("Payable Amount text is not displayed.");
		}
	}

	public void checkPayWithText(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(PayWithText));

		if (PayWithText.isDisplayed()) {
			System.out.println("Pay With text is displayed.");
		} else {
			System.out.println("Pay With text is not displayed.");
		}
	}

	public void checkMatrikaPromisesText(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(MatrikaPromisesText));

		if (MatrikaPromisesText.isDisplayed()) {
			System.out.println("Matrika Promises text is displayed.");
		} else {
			System.out.println("Matrika Promises text is not displayed.");
		}
	}

	public void NavigateToCartPage(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		cartButton.click();

	}

	

	public void NavigateToCheckOutPage(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(CheckOutButton)).click();

	}

}

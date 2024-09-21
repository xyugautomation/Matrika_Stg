package Com.HomeModule;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage_AccountAfterLogin {

	@FindBy(xpath = "//p[text()='Matrika Promises']")
	public WebElement Matrika_Promises;

	@FindBy(xpath = "//button[normalize-space()='Move to Cart']")
	public WebElement MoveToCart;

	@FindBy(xpath = "//p[contains(text(), 'Wishlist Items')]")
	public WebElement TotalItems;

	@FindBy(xpath = "//p[normalize-space()='Account']")
	public WebElement AccountButton;

	// ProfileModule
	@FindBy(xpath = "//h6[normalize-space()='Profile Details']")
	public WebElement ProfileDetails;

	@FindBy(xpath = "//button[normalize-space()='Edit']")
	public WebElement EditButton;

	@FindBy(xpath = "//button[normalize-space()='Add Money']")
	public WebElement AddMoneyButton;

	@FindBy(xpath = "//button[normalize-space()='My Orders']")
	public WebElement MyOrdersButton;

	@FindBy(xpath = "//h6[contains(text(), 'My Orders Items')]")
	public WebElement MyOrdersItemsText;

	@FindBy(xpath = "//button[normalize-space()='Gift Cards']")
	public WebElement GiftCardsButton;

	@FindBy(xpath = "(//h1[normalize-space()='My Giftcards'])")
	public WebElement GiftCardsText;

	@FindBy(xpath = "//button[normalize-space()='Checkout']")
	public WebElement CheckOutButton;

	@FindBy(xpath = "//h6[normalize-space()='Checkout Products :']")
	public WebElement CheckoutProduct;

	@FindBy(xpath = "//button[normalize-space()='Log Out']")
	public WebElement LogoutButton;

	@FindBy(xpath = "//button[normalize-space()='Yes, Logout it']")
	public WebElement Logoutyes;

	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	public WebElement LogoutCancel;

	public HomePage_AccountAfterLogin(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void MatrikaTextDisplay(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOf(Matrika_Promises));

		boolean matrikaText = Matrika_Promises.isDisplayed();

		if (matrikaText == true) {

			System.out.println("Matrika Promises Text is display..!!");

		} else {
			System.out.println("Matrika promises Text is not display");

		}

	}

	public void MoveToCartDisplay(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOf(MoveToCart));

		boolean MoveToCartText = MoveToCart.isDisplayed();

		if (MoveToCartText == true) {

			System.out.println("MoveToCart  is display..!!");

		} else {
			System.out.println("MoveToCart  is not display..!!");

		}

	}

	public void WishlistItemsDisplay(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOf(MoveToCart));

		boolean MoveToCartText = MoveToCart.isDisplayed();

		if (MoveToCartText == true) {

			System.out.println("MoveToCart  is display..!!");

		} else {
			System.out.println("MoveToCart  is not display..!!");

		}

	}

	public void TotalItemsDisplay(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(TotalItems));
		boolean MoveToCartText = TotalItems.isDisplayed();

		if (MoveToCartText == true) {

			System.out.println("WishList iteam  is display..!!");

		} else {
			System.out.println("WishList iteam  is not display..!!");

		}

	}

	public void ProfileDetailsDisplay(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.visibilityOf(AccountButton)).click();
		wait.until(ExpectedConditions.visibilityOf(ProfileDetails));

		boolean MoveToCartText = ProfileDetails.isDisplayed();

		if (MoveToCartText == true) {

			System.out.println("ProfileDetails text is display..!!");

		} else {
			System.out.println("ProfileDetails text is not display..!!");

		}

	}

	public void EditButtonDisplay(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOf(AccountButton)).click();
		wait.until(ExpectedConditions.visibilityOf(EditButton));

		boolean EditButtonText = EditButton.isDisplayed();

		if (EditButtonText == true) {

			System.out.println("EditButton text is display..!!");

		} else {
			System.out.println("EditButton text is not display..!!");

		}

	}

	public void AddMoneyButtonDisplay(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(AccountButton)).click();
		wait.until(ExpectedConditions.visibilityOf(AddMoneyButton));

		boolean MoveToCartText = AddMoneyButton.isDisplayed();

		if (MoveToCartText == true) {

			System.out.println("AddMoneyButton  is display..!!");

		} else {
			System.out.println("AddMoneyButton  is not display..!!");

		}

	}

	public void MyOrdersButtonDisplay(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(AccountButton)).click();
		wait.until(ExpectedConditions.visibilityOf(MyOrdersButton));

		boolean MoveToCartText = MyOrdersButton.isDisplayed();

		if (MoveToCartText == true) {

			System.out.println("MyOrdersButton  is display..!!");

		} else {
			System.out.println("MyOrdersButton  is not display..!!");

		}

	}

	public void MyOrdersItemsTextButtonDisplay(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(AccountButton)).click();
		wait.until(ExpectedConditions.visibilityOf(MyOrdersButton)).click();
		;
		wait.until(ExpectedConditions.visibilityOf(MyOrdersItemsText));

		boolean MoveToCartText = MyOrdersItemsText.isDisplayed();

		if (MoveToCartText == true) {

			System.out.println("MyOrdersItems Text  is display..!!");

		} else {
			System.out.println("MyOrdersItems Text  is not display..!!");

		}

	}

	public void GiftCardsButtonButtonDisplay(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOf(GiftCardsButton));

		boolean MoveToCartText = GiftCardsButton.isDisplayed();

		if (MoveToCartText == true) {

			System.out.println("GiftCardsButton   is display..!!");

		} else {
			System.out.println("GiftCardsButton   is not display..!!");

		}

	}

	public void GiftCardsTextButtonDisplay(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(AccountButton)).click();
		wait.until(ExpectedConditions.visibilityOf(GiftCardsButton)).click();
		wait.until(ExpectedConditions.visibilityOf(GiftCardsButton));

		boolean MoveToCartText = GiftCardsButton.isDisplayed();

		if (MoveToCartText == true) {

			System.out.println("GiftCardsButton   is display..!!");

		} else {
			System.out.println("GiftCardsButton   is not display..!!");

		}

	}

	public void LogoutTextButtonDisplay(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(AccountButton)).click();
		wait.until(ExpectedConditions.visibilityOf(LogoutButton));

		boolean MoveToCartText = LogoutButton.isDisplayed();

		if (MoveToCartText == true) {

			System.out.println("LogoutButton is display..!!");

		} else {
			System.out.println("LogoutButton is not display..!!");

		}

	}

	public void LogoutYesButtonDisplay(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(AccountButton)).click();
		wait.until(ExpectedConditions.visibilityOf(LogoutButton)).click();
		wait.until(ExpectedConditions.visibilityOf(Logoutyes));
		boolean MoveToCartText = Logoutyes.isDisplayed();

		if (MoveToCartText == true) {

			System.out.println("Logoutyes  is display..!!");

		} else {
			System.out.println("Logoutyes is not display..!!");

		}

	}

	public void LogoutCancelTextButtonDisplay(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(AccountButton)).click();
		wait.until(ExpectedConditions.visibilityOf(LogoutButton)).click();
		wait.until(ExpectedConditions.visibilityOf(LogoutCancel));

		boolean MoveToCartText = LogoutCancel.isDisplayed();

		if (MoveToCartText == true) {

			System.out.println("LogoutCancel text is display..!!");

		} else {
			System.out.println("LogoutCancel text is not display..!!");

		}

	}

}
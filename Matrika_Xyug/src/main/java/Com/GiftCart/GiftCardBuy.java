package Com.GiftCart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GiftCardBuy {

	// Locator for the specific gift card amount (example given for ₹1,000.00)
	@FindBy(xpath = "//p[contains(text(),'₹1,000.00')]")
	public WebElement buyNowGiftCardAmount;

	// Locator for all "Buy Now" buttons
	@FindBy(xpath = "(//button[@data-bs-toggle='modal'][normalize-space()='Buy Now'])")
	public List<WebElement> buyNowButtons;

	@FindBy(xpath = "//h2[normalize-space()='Giftcards']")
	public WebElement GiftCards;

	@FindBy(xpath = "(//p[@class='price-para'])[1] | //section[@class='cartpageSection ng-star-inserted']//div[@class='row']//div[1]//div[1]//div[1]//div[1]")
	public WebElement BuyNowGiftCardAmount;

	@FindBy(xpath = "(//button[@data-bs-toggle='modal'][normalize-space()='Buy Now'])")
	public WebElement BuyNowButtons;

	@FindBy(xpath = "//app-buy-giftcard[@class='ng-star-inserted']//div[@class='row']//div[1]//div[1]//div[1]//div[1]//button[1]")
	public WebElement GiftCardBuyButton;

	@FindBy(xpath = "//div[@class='total-amount-main-div']//p[@class='Total-Amount']")
	public WebElement GetAmount;

	@FindBy(xpath = "//input[@placeholder='Enter Amount']")
	public WebElement EnterAmount;

	@FindBy(xpath = "//button[normalize-space()='Pay']")
	public WebElement PayButton;

	@FindBy(xpath = "//div[@id='exampleModal']//button[@aria-label='Close']")
	public WebElement closeButton;

	@FindBy(xpath = "//input[@placeholder='Enter Amount']")
	private WebElement EnterAmountEdt;

	@FindBy(xpath = "//button[.=' Pay ']")
	private WebElement PayBtn;

	@FindBy(xpath = "//p[normalize-space()='Account']")
	public WebElement AccountButton;

	@FindBy(xpath = "//tbody/tr[1]/td[1]")
	public WebElement tabledataRow;

	@FindBy(xpath = "//div[@class='modal-dialog modal-dialog-scrollable']//button[@aria-label='Close']")
	public WebElement Closepopup;

	@FindBy(xpath = "//button[normalize-space()='Gift Cards']")
	public WebElement AccountGiftCardsButton;

	@FindBy(xpath = "//i[@class='fa-regular fa-circle-check']")
	public WebElement RazorPayCheck;

	@FindBy(xpath = "//h3[.='Contact details']/..//div//input[@placeholder='Mobile number']")
	private WebElement PhoneNumberEdt;
	@FindBy(xpath = "//button[.='Continue']")
	private WebElement ContinueBtn;

	@FindBy(xpath = "//span[.='UPI']")
	private WebElement UpiLnk;
	@FindBy(xpath = "//h3[.='UPI ID / Number']/..//input[@placeholder='example@okhdfcbank']")
	private WebElement UpiNameEdt;
	@FindBy(xpath = "//button[.='Verify and Pay']")
	private WebElement VerifyAndPayBtn;

	@FindBy(xpath = "//iframe[@class='razorpay-checkout-frame']")
	public WebElement iframe;

	private WebDriverWait wait;

	public GiftCardBuy(WebDriver driver) {
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		PageFactory.initElements(driver, this);

	}

	public void subCatGiftCard() throws InterruptedException {
		Thread.sleep(3000);
		GiftCards.click();

	}

	public void Giftcarlist(WebDriver driver) throws InterruptedException {

		Thread.sleep(4000);

		scrollToAndClickElement(BuyNowGiftCardAmount, driver);

		GiftCardBuyButton.click();

	}

	public void giftcardpopup(WebDriver driver) throws InterruptedException {

		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		Thread.sleep(2000);
		closeButton.click();

	}

	public void scrollToAndClickElement(WebElement element, WebDriver driver) throws InterruptedException {

		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);

	}

//	public void abc(WebDriver driver) throws InterruptedException {
//		Thread.sleep(4000);
//		scrollToElement(BuyNowGiftCardAmount, driver);
//		wait.until(ExpectedConditions.visibilityOf(BuyNowGiftCardAmount));
//		if (BuyNowGiftCardAmount.isDisplayed()) {
//			System.out.println("Buy Now Gift Card element is displayed.");
//
//			wait.until(ExpectedConditions.visibilityOf(BuyNowButtons));
//			if (BuyNowButtons.isDisplayed()) {
//				System.out.println("Buy Now button is displayed. Clicking the button.");
//
//				wait.until(ExpectedConditions.elementToBeClickable(BuyNowButtons));
//				BuyNowButtons.click();
//			} else {
//				System.out.println("Buy Now button is not displayed.");
//			}
//		} else {
//			System.out.println("Buy Now Gift Card element is not displayed.");
//		}
//	}

	private void scrollToElement(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", element);

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void GiftCardBuywithwallet() {

	}

	// Method to click the buy button corresponding to the specified gift card
	// amount
	public void clickBuyButtonForGiftCardAmount(WebDriver driver) throws InterruptedException {

		Thread.sleep(5000);
		List<WebElement> giftCardAmounts = driver.findElements(By.xpath("//p[contains(text(),'₹1,000.00')]"));

		for (int i = 0; i < giftCardAmounts.size(); i++) {
			WebElement amountElement = giftCardAmounts.get(i);

			// If the current amount element matches the expected amount
			if (amountElement.getText().contains("₹1,000.00")) {
				// Assuming the "Buy Now" button follows the amount element in the DOM
				WebElement buyButton = buyNowButtons.get(i);

				// Scroll to the amount element (optional)
				scrollToElements(amountElement, driver);

				// Click the corresponding buy button
				buyButton.click();
				break;
			}
		}
	}

	// Method to scroll to an element using JavaScript (optional)
	private void scrollToElements(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
	}

//-----------------------------------------------
	public void abc(WebDriver driver, String targetAmount) throws InterruptedException {
//        // Initialize WebDriverWait
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//
//        // Pause for a moment (not recommended for production code)
//        Thread.sleep(3000);
//
//        // Construct dynamic XPath for the parent container
//        String dynamicContainerXPath = "//div[contains(.,'" + targetAmount + "')]";
//        String dynamicButtonXPath = dynamicContainerXPath + "//button[@data-bs-toggle='modal'][normalize-space()='Buy Now']";
//
//        // Locate the container element
//        WebElement container = driver.findElement(By.xpath(dynamicContainerXPath));
//        
//        // Locate the "Buy Now" button within the container
//        WebElement buyNowButton = driver.findElement(By.xpath(dynamicButtonXPath));
//
//        // Scroll to the container element
//        scrollToElement(container, driver);
//
//        // Wait until the container element is visible
//        wait.until(ExpectedConditions.visibilityOf(container));
//
//        if (container.isDisplayed()) {
//            System.out.println("Container element is displayed with amount: " + targetAmount);
//
//            // Wait until the "Buy Now" button is visible and clickable
//            wait.until(ExpectedConditions.visibilityOf(buyNowButton));
//            wait.until(ExpectedConditions.elementToBeClickable(buyNowButton));
//
//            if (buyNowButton.isDisplayed()) {
//                System.out.println("Buy Now button is displayed. Clicking the button.");
//                buyNowButton.click();
//            } else {
//                System.out.println("Buy Now button is not displayed.");
//            }
//        } else {
//            System.out.println("Container element is not displayed.");
//        }
//   
//    
//    
//    

		// Initialize WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// Pause for a moment (not recommended for production code)
		Thread.sleep(3000);

		// Construct dynamic XPath for the parent container
		String dynamicContainerXPath = "//div[contains(.,'" + targetAmount + "')]";

		// Locate the container element that contains the target amount
		WebElement container;
		try {
			container = driver.findElement(By.xpath(dynamicContainerXPath));
		} catch (NoSuchElementException e) {
			System.out.println("No container found with the amount: " + targetAmount);
			return; // Exit the method if the container is not found
		}

		// Construct dynamic XPath for the "Buy Now" button within the located container
		String dynamicButtonXPath = ".//button[@data-bs-toggle='modal'][normalize-space()='Buy Now']";

		// Locate the "Buy Now" button within the container
		WebElement buyNowButton;
		try {
			buyNowButton = container.findElement(By.xpath(dynamicButtonXPath));
		} catch (NoSuchElementException e) {
			System.out.println("No 'Buy Now' button found for the amount: " + targetAmount);
			return; // Exit the method if the button is not found
		}

		// Scroll to the container element
		scrollToElement(container, driver);

		// Wait until the container element is visible
		wait.until(ExpectedConditions.visibilityOf(container));

		// Wait until the "Buy Now" button is visible and clickable
		wait.until(ExpectedConditions.visibilityOf(buyNowButton));
		wait.until(ExpectedConditions.elementToBeClickable(buyNowButton));

		if (buyNowButton.isDisplayed()) {
			System.out.println("Buy Now button is displayed for amount: " + targetAmount);
			buyNowButton.click();
		} else {
			System.out.println("Buy Now button is not displayed for amount: " + targetAmount);
		}

	}

	public boolean isGiftCardPrice1000() {
		// Get the text from the gift card amount element

		String priceText = BuyNowGiftCardAmount.getText();

		return priceText.contains("₹1,000.00");
	}

	public void clickBuyNowButton() {
		BuyNowButtons.click();
	}

	public void purchaseGiftCardIfPrice1000(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		scrollToElement(BuyNowGiftCardAmount, driver);

		if (isGiftCardPrice1000()) {
			clickBuyNowButton();
		} else {
			System.out.println("The gift card price is not ₹1,000.00. No purchase will be made.");
		}
	}

	//

//    // Scroll to the element using JavaScript
//    private void scrollToElement(WebElement element, WebDriver driver) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", element);
//
//        try {
//            Thread.sleep(500); // Adjust sleep duration if needed
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

	// Scroll to the element using JavaScript
	private void scrollToElementsss(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", element);

		try {
			Thread.sleep(500); // Adjust sleep duration if needed
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void ValueGet(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);

		// Get the text value from the element
		String totalAmount = GetAmount.getText();
		Thread.sleep(3000);

		// Remove the last two characters from the totalAmount string
		if (totalAmount.length() > 2) {
			totalAmount = totalAmount.substring(0, totalAmount.length() - 2);
		}

		// Enter the modified amount into the input field
		EnterAmount.sendKeys(totalAmount);

		Thread.sleep(2000);
		PayBtn.click();
		Thread.sleep(2000);

		Alert al = driver.switchTo().alert();
		Thread.sleep(4000);
		// Accept the alert
		al.accept();
		System.out.println("Buy Gift Card with wallet successfully done..");

	}

	public void valuegetForRazorPay(WebDriver driver) throws InterruptedException {

		Thread.sleep(3000);

		// Get the text value from the element
		String totalAmount = GetAmount.getText();
		Thread.sleep(3000);

		// Remove the last two characters from the totalAmount string
		if (totalAmount.length() > 2) {
			totalAmount = totalAmount.substring(0, totalAmount.length() - 2);
		}

		// Enter the modified amount into the input field
		EnterAmount.sendKeys(totalAmount);

		Thread.sleep(2000);

	}

	public void tableGiftCardgetDataBefore(WebDriver driver) throws InterruptedException {

//        // Perform the action to buy the gift card
//        // Assume that 'BuyNowGiftCardAmount' and 'GiftCardBuyButton' elements are defined in your Page Object
//        WebElement buyNowButton = driver.findElement(By.id("GiftCardBuyButton"));
//        buyNowButton.click();

	}

	public void BuyGiftCardWithWallet(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		AccountButton.click();
		Thread.sleep(3000);
		AccountGiftCardsButton.click();
		driver.navigate().refresh();
		Thread.sleep(3000);
		AccountButton.click();
		AccountGiftCardsButton.click();
		Thread.sleep(6000);
		WebElement tableCellBefore = driver.findElement(By.xpath("//tbody/tr[1]/td[1]"));
		String amountBefore = tableCellBefore.getText();
		System.out.println("Amount" + amountBefore);
		Thread.sleep(2000);
		Closepopup.click();
		subCatGiftCard();
		purchaseGiftCardIfPrice1000(driver);
		ValueGet(driver);
		Thread.sleep(3000);
		AccountButton.click();
		Thread.sleep(3000);
		AccountGiftCardsButton.click();
		Thread.sleep(5000);
		WebElement tableCellAfter = driver.findElement(By.xpath("//tbody/tr[1]/td[1]"));
		String amountAfter = tableCellAfter.getText();
		Assert.assertNotEquals(amountAfter, amountBefore, "Gift card amount did not update.");

	}

	public void BuyGiftcardWithRazorPay(WebDriver driver) throws InterruptedException {

//		Thread.sleep(3000);
//		AccountButton.click();
//		Thread.sleep(3000);
//		AccountGiftCardsButton.click();
		subCatGiftCard();
		purchaseGiftCardIfPrice1000(driver);
		valuegetForRazorPay(driver);

		Thread.sleep(3000);
		RazorPayCheck.click();
		Thread.sleep(3000);
		PayBtn.click();

		Thread.sleep(3000);
		driver.switchTo().frame(iframe); // Switch to iframe
		Thread.sleep(2000);

		Thread.sleep(2000);
		PhoneNumberEdt.sendKeys("6309631698");
		Thread.sleep(2000);
		ContinueBtn.click();
		Thread.sleep(3000);
		UpiLnk.click();
		Thread.sleep(2000);
		UpiNameEdt.sendKeys("6309631698@ybl");
		Thread.sleep(2000);
		VerifyAndPayBtn.click();
		Thread.sleep(2000);
		driver.navigate().refresh();

	}

}
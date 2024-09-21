package Com.ProductSelect;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;



import org.openqa.selenium.support.ui.WebDriverWait;

public class NoisePin {

	@FindBy(xpath = "//h2[normalize-space()='Nose Pins']")
	public WebElement CatNosePin;

	@FindBy(xpath = "//p[contains(text(),'Price: ₹3')]")
	public WebElement ProductName;

	@FindBy(xpath="//h2[normalize-space()='anklets']")
	public WebElement anklets;
	
	@FindBy(xpath = "//a[normalize-space()='eree']")
	public WebElement subcatanklets;
	
	@FindBy(xpath = "//a[normalize-space()='sub test']")
	public WebElement subcatNosePin;
	
	@FindBy(xpath = "//a[normalize-space()='Buy Now']")
	public WebElement BuyNowButton;

	@FindBy(xpath = "//i[@class='fa-regular fa-circle-check']")
	public WebElement razorpay;

	@FindBy(xpath = "//button[normalize-space()='Place Order']")
	public WebElement placeorder;

	@FindBy(xpath = "//button[normalize-space()='Success']")
	public WebElement SucessButton;

	@FindBy(xpath = "//iframe[@class='razorpay-checkout-frame']")
	public WebElement iframe;

	@FindBy(xpath = "//input[@name='contact' and @placeholder='Mobile number']")
	public WebElement MobileNumber;

	@FindBy(xpath = "//button[@name='button' and normalize-space()='Continue']")
	public WebElement continueButton;

	@FindBy(xpath = "//span[@class='truncate font-medium mr-1' and normalize-space()='ICICI Bank Netbanking']")
	public WebElement ICICIBank;

	@FindBy(xpath = "//button[@class='submit-but']")
	public WebElement SubmitButton;

	@FindBy(xpath = "//input[@placeholder='Enter Amount']")
	public WebElement EnterAmount;
	@FindBy(xpath = "//p[contains(text(),'Price: ₹3')] | //p[contains(text(),'₹8,6')])[1]")
	public WebElement productPrice;

//	@FindBy(xpath = "(//p[contains(text(),'₹8,7')])[1] | (//p[contains(text(),'₹8,6')])[1] ")
//	public WebElement productPrice;

	@FindBy(xpath = "//button[normalize-space()='Giftcards']")
	public WebElement GifCardButton;

	@FindBy(xpath = "//button[normalize-space()='Coupons']")
	public WebElement CouponsButton;

	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/app-order-summary[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[5]/app-coupons-buy-page[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[7]/button[1]")
	public WebElement couponsApply;

	@FindBy(xpath = "(//button[contains(text(),'View Order Products')])[1]")
	public WebElement ViewOrderProduct;

	
	@FindBy(xpath="//i[@class='fa-regular fa-circle-check']")
	public WebElement RazorPayCheck;
	
	@FindBy(xpath="//button[normalize-space()='Place Order']")
	public WebElement PlaceOrder;
	
	@FindBy(xpath="//button[normalize-space()='Giftcards']")
	public WebElement GiftcardButton;
	
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/button[1]")
	public WebElement GiftCardApplyButton;
	
	
	@FindBy(xpath="(//div[@class='total-amount-main-div'])[2]")
	public WebElement AfterApplyGiftCardAmount;
	
	
	
	
	
	
	public NoisePin(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void mouseOverAndSelect(WebDriver driver) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		Actions actions = new Actions(driver);

		// Wait for the category element to be visible
		wait.until(ExpectedConditions.visibilityOf(anklets));

		// Move the mouse over the category
		actions.moveToElement(anklets).perform();

		// Scroll the subcategory into view to ensure it's visible and clickable
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", subcatanklets);

		// Wait until the subcategory is clickable
		wait.until(ExpectedConditions.elementToBeClickable(subcatanklets));

		try {
			// Attempt to click on the subcategory
			subcatanklets.click();
		} catch (ElementClickInterceptedException e) {
			// Fallback to JavaScript click in case of interception
			js.executeScript("arguments[0].click();", subcatanklets);
		}

		// Wait for potential dynamic content changes
		Thread.sleep(3000);

		// Optional: Wait for the product to be displayed
		wait.until(ExpectedConditions.visibilityOf(ProductName));
		System.out.println("Product Name: " + ProductName.getText());

		// Scroll to and click the product name
		js.executeScript("arguments[0].scrollIntoView(true);", ProductName);
		wait.until(ExpectedConditions.elementToBeClickable(ProductName));

		try {
			ProductName.click();
		} catch (ElementClickInterceptedException e) {
			// Fallback to JavaScript click if needed
			js.executeScript("arguments[0].click();", ProductName);
		}
	}

	public void BuyNowButton(WebDriver driver) throws InterruptedException {

		// Scroll the subcategory into view to ensure it's visible and clickable
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", BuyNowButton);
		Thread.sleep(2000);
		BuyNowButton.click();
	}

	public void Razorpay() throws InterruptedException {
		Thread.sleep(2000);
		razorpay.click();
		Thread.sleep(2000);
		placeorder.click();
	}

	public void IFrame(WebDriver driver) throws InterruptedException {

		// Switch to iframe and perform actions inside it
		Thread.sleep(4000);
		driver.switchTo().frame(iframe); // Switch to iframe
		Thread.sleep(2000);

		MobileNumber.sendKeys("8698502234"); // Enter mobile number
		Thread.sleep(2000);

		continueButton.click();
		Thread.sleep(2000);

		ICICIBank.click(); 
		Thread.sleep(8000); 
		String originalWindow = driver.getWindowHandle();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2)); 

		Set<String> allWindows = driver.getWindowHandles();


		for (String windowHandle : allWindows) {
			if (!windowHandle.equals(originalWindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		// Now you are in the new window, perform actions here
		System.out.println("Switched to new window: " + driver.getTitle());
		// Optional: Perform actions in the new window
		WebDriverWait newWindowWait = new WebDriverWait(driver, Duration.ofSeconds(30));
		newWindowWait.until(ExpectedConditions.elementToBeClickable(SucessButton)); //Wait until the SuccessButton is click able..!!
		SucessButton.click();
		Thread.sleep(4000);
		driver.switchTo().window(originalWindow);

		try {
			WebDriverWait alertWait = new WebDriverWait(driver, Duration.ofSeconds(30));
			alertWait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept(); // Accept the alert
		} catch (NoAlertPresentException e) {
			System.out.println("No alert was present.");
		} catch (NoSuchWindowException e) {
			System.out.println("The target window is no longer available.");
		}

		WebDriverWait SubmitBtn = new WebDriverWait(driver, Duration.ofSeconds(40));
		SubmitBtn.until(ExpectedConditions.elementToBeClickable(SubmitButton));
		SubmitButton.click();

	}

	public void OderProduct(WebDriver driver) {
		WebDriverWait SubmitBtn = new WebDriverWait(driver, Duration.ofSeconds(40));
		SubmitBtn.until(ExpectedConditions.elementToBeClickable(ViewOrderProduct));
		ViewOrderProduct.click();
		System.out.println("Product order successfully completed..");
	}

	public void oderwithWalletAccount(WebDriver driver) throws InterruptedException {
		mouseOverAndSelect(driver);
		BuyNowButton(driver);
		Thread.sleep(2000);
		
		String priceText = productPrice.getText();
		Thread.sleep(2000);
		String cleanPrice = priceText.replaceAll("[^0-9]", "");
		Thread.sleep(2000);
		String finalPrice = cleanPrice.substring(0, cleanPrice.length() - 2);
		
		EnterAmount.sendKeys(finalPrice);
		Thread.sleep(2000);
		placeorder.click();
		Thread.sleep(5000);
		SubmitButton.click();
		System.out.println("Product buy successfully completed..!");
		
		
	}

	
	public void oderwithRazorPay(WebDriver driver) throws InterruptedException {
		
		mouseOverAndSelect(driver);
		BuyNowButton(driver);
		Thread.sleep(2000);
//		String priceText = productPrice.getText();
//		Thread.sleep(2000);
//		String cleanPrice = priceText.replaceAll("[^0-9]", "");
//		Thread.sleep(2000);
//		String finalPrice = cleanPrice.substring(0, cleanPrice.length() - 2);
//		EnterAmount.sendKeys(finalPrice);
//		Thread.sleep(3000);
		
		RazorPayCheck.click();
		Thread.sleep(3000);
		PlaceOrder.click();
		Thread.sleep(3000);
		IFrame(driver);
		
		
		
	}
	
	
	public void oderWithWalletWithGiftCard(WebDriver driver) throws InterruptedException {
		mouseOverAndSelect(driver);
		BuyNowButton(driver);
		Thread.sleep(2000);
		GiftcardButton.click();
		Thread.sleep(3000);
		GiftCardApplyButton.click();

		String priceText = AfterApplyGiftCardAmount.getText();
		Thread.sleep(2000);
		String cleanPrice = priceText.replaceAll("[^0-9]", "");
		Thread.sleep(2000);
		String finalPrice = cleanPrice.substring(0, cleanPrice.length() - 2);
		EnterAmount.sendKeys(finalPrice);
		Thread.sleep(3000);

		Thread.sleep(3000);
		PlaceOrder.click();

	}
	
	
	public void oderWithWalletWithGiftCardAndCoupons(WebDriver driver) throws InterruptedException {
		mouseOverAndSelect(driver);
		BuyNowButton(driver);
		Thread.sleep(2000);
		GiftcardButton.click();
		Thread.sleep(3000);
		GiftCardApplyButton.click();
		Thread.sleep(3000);
		CouponsButton.click();
		Thread.sleep(3000);
		couponsApply.click();
		Thread.sleep(2000);
		String priceText = AfterApplyGiftCardAmount.getText();
		Thread.sleep(2000);
		String cleanPrice = priceText.replaceAll("[^0-9]", "");
		Thread.sleep(2000);
		String finalPrice = cleanPrice.substring(0, cleanPrice.length() - 2);
		EnterAmount.sendKeys(finalPrice);
		Thread.sleep(3000);
		Thread.sleep(3000);
		PlaceOrder.click();
	}

	
}

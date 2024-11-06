package Com.GiftCartModule;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GiflCartProfile {

	@FindBy(xpath = "//div[@id='dropdownMenuButton1']")
	public WebElement AccountButton;

	@FindBy(xpath = "//button[normalize-space()='Gift Cards']")
	public WebElement GiftCartButton;

	@FindBy(xpath = "//div[@class='modal-dialog modal-dialog-scrollable']//h1[@id='staticBackdropLabel']")
	public WebElement MyGiftcardsText;

	@FindBy(xpath = "//img[@alt='No Product']")
	public WebElement NoProductGiftInCartText;

	// Table Text all
	@FindBy(xpath = "//th[normalize-space()='Giftcard Code']")
	public WebElement GiftcardCode;

	@FindBy(xpath = "//th[normalize-space()='Giftcard Amount']")
	public WebElement GiftcardAmount;

	@FindBy(xpath = "//th[normalize-space()='Created At']")
	public WebElement CreatedAt;

	@FindBy(xpath = "	//th[normalize-space()='Expires On']")
	public WebElement ExpiresOn;

	@FindBy(xpath = "//th[normalize-space()='Status']")
	public WebElement Status;

	@FindBy(xpath = "//div[@class='modal-dialog modal-dialog-scrollable']//button[@aria-label='Close']")
	public WebElement CloseButton;

	public GiflCartProfile(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	// Action method for AccountButton
	public void clickAccountButton() throws InterruptedException {
		Thread.sleep(3000);
		AccountButton.click();
		System.out.println("Account Button clicked");
	}

	// Action method for GiftCartButton
	public void clickGiftCartButton() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		GiftCartButton.click();
		System.out.println("Gift Card Button clicked");
	}

	public void NavigateToGiftCarPage() throws InterruptedException {
		Thread.sleep(3000);
		AccountButton.click();
		Thread.sleep(3000);
		GiftCartButton.click();
		Thread.sleep(3000);

		if (MyGiftcardsText.isDisplayed()) {
			System.out.println("Navigated to Gift Cards page successfully.");
		} else {
			System.out.println("Failed to navigate to Gift Cards page.");
		}

	}

	public void ClickOnTheGiftCartCloseButton() throws InterruptedException {

		Thread.sleep(3000);
		AccountButton.click();
		Thread.sleep(3000);
		GiftCartButton.click();
		Thread.sleep(3000);

		CloseButton.click();
		Thread.sleep(3000);

		boolean isPopupClosed = isPopupClosed();

		if (isPopupClosed) {
			System.out.println("Pop-up is successfully closed.");
		} else {
			System.out.println("Pop-up is still open.");
		}

	}

	//Helper Method
	private boolean isPopupClosed() {
		try {

			return !CloseButton.isDisplayed();
		} catch (NoSuchElementException e) {

			return true;
		}

	}

	 public String checkElementDisplay(WebElement element, String elementName) throws InterruptedException {
		 Thread.sleep(3000);
	        try {
	            if (element.isDisplayed()) {
	                return elementName + " is displayed.";
	            } else {
	                return elementName + " is not displayed.";
	            }
	        } catch (Exception e) {
	            return elementName + " is not present on the page.";
	        }
	    }
	
	
	 public void verifyTableHeadersDisplayed() throws InterruptedException {
		 Thread.sleep(3000);
			AccountButton.click();
			Thread.sleep(3000);
			GiftCartButton.click();
			Thread.sleep(3000);
			System.out.println(checkElementDisplay(GiftcardCode, "Giftcard Code"));
	        System.out.println(checkElementDisplay(GiftcardAmount, "Giftcard Amount"));
	        System.out.println(checkElementDisplay(CreatedAt, "Created At"));
	        System.out.println(checkElementDisplay(ExpiresOn, "Expires On"));
	        System.out.println(checkElementDisplay(Status, "Status"));
	        System.out.println(checkElementDisplay(CloseButton, "Close Button"));
	    }
	
	 
	 public void VerifyNoProductAvaiable(WebDriver driver) throws InterruptedException {
		 Thread.sleep(3000);
			AccountButton.click();
			Thread.sleep(3000);
			GiftCartButton.click();
			
			  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			
			if (wait.until(ExpectedConditions.visibilityOf(NoProductGiftInCartText)).isDisplayed()) {
		        System.out.println("Gift Card is not available.");
		    } else {
		        System.out.println("Gift Card is available.");
		    }
	 }
	 
	 

}

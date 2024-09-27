package Com.WishModule;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WishlistBeforeLogin {

	@FindBy(xpath = "//div[@aria-label='No products in favourites']")
	public WebElement NoProductInFavourites;

	@FindBy(xpath = "//div[@class='container-fluid my-connn']//div[2]//div[1]//div[1]")
	public WebElement WishButton;

	@FindBy(xpath = "//p[@class='login-para']")
	public WebElement Logintext;

	@FindBy(xpath = "//label[@class='email-label']")
	public WebElement MobileNumbertext;

	@FindBy(xpath = "//button[normalize-space()='Continue']")
	public WebElement ContinueButton;

	@FindBy(xpath = "//span[@class='span-sign-up-para']")
	public WebElement Signuptext;

	public WishlistBeforeLogin(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void checkButtonDisplay(WebDriver driver, WebElement element, String buttonName) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(element));
			if (element.isDisplayed()) {
				System.out.println(buttonName + " button is displayed.");
			} else {
				System.out.println(buttonName + " button is not displayed.");
			}
		} catch (Exception e) {
			System.out.println(buttonName + " button is not displayed (Exception: " + e.getMessage() + ").");
		}
	}

	public void SignupTextDisplayOrNot(WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(WishButton)).click();
			System.out.println("Click on the WishButton..!!");
			checkButtonDisplay(driver, Signuptext, "Signuptext");
		} catch (Exception e) {
			System.out.println("Error in displaying 'Your Account' text: " + e.getMessage());
		}

	}

	public void MobileNumbertextDisplayOrNot(WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(WishButton)).click();
			System.out.println("Click on the WishButton..!!");
			checkButtonDisplay(driver, MobileNumbertext, "MobileNumbertext");
		} catch (Exception e) {
			System.out.println("Error in displaying 'Your Account' text: " + e.getMessage());
		}

	}

	public void ContinuetextDisplayOrNot(WebDriver driver) {
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(WishButton)).click();
			System.out.println("Click on the WishButton..!!");
			checkButtonDisplay(driver, ContinueButton, "Continue");
		} catch (Exception e) {
			System.out.println("Error in displaying 'Your Account' text: " + e.getMessage());
		}

	}

	public void LogintextDisplayOrNot(WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(WishButton)).click();
			System.out.println("Click on the WishButton..!!");
			System.out.println("Click on the WishButton..!!");
			checkButtonDisplay(driver, Logintext, "Logintext");
		} catch (Exception e) {
			System.out.println("Error in displaying 'Your Account' text: " + e.getMessage());
		}
	}

}

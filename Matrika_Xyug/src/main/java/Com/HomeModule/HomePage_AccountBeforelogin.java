package Com.HomeModule;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage_AccountBeforelogin {

	@FindBy(xpath = "//p[normalize-space()='Account']")
	public WebElement AccountButton;

	// YourAccountText
	@FindBy(xpath = "//h3[normalize-space()='Your Account']")
	public WebElement YourAccountText;

	// loginbutton
	@FindBy(xpath = "//button[normalize-space()='Log In']")
	public WebElement loginButton;
	// signup button
	@FindBy(xpath = "//button[normalize-space()='Sign Up']")
	public WebElement SignupButton;

	// wishbutton
	@FindBy(xpath = "//div[@class='container-fluid my-connn']//div[2]//div[1]//div[1]")
	public WebElement WishButton;

	// cart button
	@FindBy(xpath = "//div[@class='col-md-3 first-con-col-fourr']//div[3]//div[1]//div[1]")
	public WebElement CartButton;

	// mobile Number text
	@FindBy(xpath = "//label[@class='email-label']")
	public WebElement MobileNumbertext;

	@FindBy(xpath = "//p[@class='login-para']")
	public WebElement Logintext;

	@FindBy(xpath = "//button[normalize-space()='Continue']")
	public WebElement Continuetext;

	@FindBy(xpath = "//span[@class='span-sign-up-para']")
	public WebElement Signuptext;

	@FindBy(xpath = "//input[@class='email-input mt-2 ng-untouched ng-pristine ng-invalid']")
	public WebElement MobileNumberFiled;

	@FindBy(xpath = "//button[normalize-space()='Continue']")
	public WebElement ContinueButton;

	@FindBy(xpath = "//p[@class='verification-head']")
	public WebElement EnterYourOTPText;

	@FindBy(xpath = "//button[normalize-space()='Resend otp']")
	public WebElement ResendOtp;

	@FindBy(xpath = "//p[@class='time-remains text-danger text-end']")
	public WebElement OtpPageTime;

	public WebDriver driver;
	public WebDriverWait wait;

	public HomePage_AccountBeforelogin(WebDriver driver) {

		// PageFactory.initElements(driver, this);

		PageFactory.initElements(driver, this);

	}

	public void checkButtonDisplay(WebDriver driver, WebElement element, String buttonName) {
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

			// Wait for the element to be visible
			wait.until(ExpectedConditions.visibilityOf(element));

			// Check if the element is displayed
			if (element.isDisplayed()) {
				System.out.println(buttonName + " button is displayed.");
			} else {
				System.out.println(buttonName + " button is not displayed.");
			}
		} catch (Exception e) {
			System.out.println(buttonName + " button is not displayed (Exception: " + e.getMessage() + ").");
		}
	}

	public void YourAccountTextdisplayornot(WebDriver driver) {

		try {
			// Wait for the 'AccountButton' to be visible and clickable, then click it

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

			wait.until(ExpectedConditions.elementToBeClickable(AccountButton)).click();

			// Check if 'YourAccountText' is displayed
			checkButtonDisplay(driver, YourAccountText, "YourAccountText");
		} catch (Exception e) {
			System.out.println("Error in displaying 'Your Account' text: " + e.getMessage());
		}
	}

	public void loginButtonDisplayOrNot(WebDriver driver) {
		try {

			checkButtonDisplay(driver, loginButton, "Login");
		} catch (Exception e) {
			System.out.println("Error in displaying 'Your Account' text: " + e.getMessage());
		}
	}

	public void SignupButtonDisplayOrNot(WebDriver driver) {

		try {
			// Wait for the 'AccountButton' to be visible and clickable, then click it

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

			wait.until(ExpectedConditions.elementToBeClickable(AccountButton)).click();

			// Check if 'YourAccountText' is displayed
			checkButtonDisplay(driver, SignupButton, "Signup");
		} catch (Exception e) {
			System.out.println("Error in displaying 'Your Account' text: " + e.getMessage());
		}

	}

	public void WishButtonDisplayOrNot(WebDriver driver) {

		try {

			checkButtonDisplay(driver, WishButton, "Wish");
		} catch (Exception e) {
			System.out.println("Error in displaying 'Your Account' text: " + e.getMessage());
		}

	}

	public void AccountButtonDisplayOrNot(WebDriver driver) {

		try {

			checkButtonDisplay(driver, AccountButton, "Account");
		} catch (Exception e) {
			System.out.println("Error in displaying 'Your Account' text: " + e.getMessage());
		}

	}

	public void CartButtonDisplayOrNot(WebDriver driver) {

		try {

			checkButtonDisplay(driver, CartButton, "Cart");
		} catch (Exception e) {
			System.out.println("Error in displaying 'Your Account' text: " + e.getMessage());
		}

	}

	public void clickButton(WebDriver driver, WebElement element, String buttonName) {
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

			// Wait for the element to be clickable
			wait.until(ExpectedConditions.elementToBeClickable(element));
			// Click the element
			element.click();
			System.out.println(buttonName + " button was clicked.");
		} catch (Exception e) {
			System.out.println(buttonName + " button could not be clicked (Exception: " + e.getMessage() + ").");
		}
		driver.navigate().back();

	}

	public void clickLoginButton(WebDriver driver) {
		clickButton(driver, loginButton, "Login");

	}

	public void clickSignupButton(WebDriver driver) {
		clickButton(driver, SignupButton, "Signup");
	}

	public void clickWishButton(WebDriver driver) {
		clickButton(driver, WishButton, "Wish");
	}

	public void clickCartButton(WebDriver driver) {
		clickButton(driver, CartButton, "Cart");

	}

	// Method to check if redirection to the login page happens
	public void checkRedirectionAfterClickLoginPage(WebDriver driver, WebElement button, String buttonName) {
		// Click the button

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		button.click();

		// Wait for the URL to change and check if it matches the login URL
		wait.until(ExpectedConditions.urlToBe("http://stg-ecom.goldbox.gold/login"));

		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.equals("http://stg-ecom.goldbox.gold/login")) {
			System.out.println(buttonName + " button redirected to the login page.");
		} else {
			System.out.println(buttonName + " button did not redirect to the login page. Current URL: " + currentUrl);
		}
		driver.navigate().back();

	}

	// Method to check if redirection to the login page happens
	public void checkRedirectionAfterClickSignupPage(WebDriver driver, WebElement button, String buttonName) {
		// Click the button
		clickButton(driver, button, buttonName);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		// Wait for the URL to change and check if it matches the login URL
		wait.until(ExpectedConditions.urlToBe("http://stg-ecom.goldbox.gold/sign-up"));

		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.equals("http://stg-ecom.goldbox.gold/sign-up")) {
			System.out.println(buttonName + " button redirected to the signup page.");
		} else {
			System.out.println(buttonName + " button did not redirect to the signup page. Current URL: " + currentUrl);
		}
		driver.navigate().back();

	}

	// Method to check all buttons' redirection
	public void checkLoginButtonClick_LoginRedirection(WebDriver driver) {
		checkRedirectionAfterClickLoginPage(driver, loginButton, "Login");

	}

	// Method to check all buttons' redirection
	public void checkWishButtonClick_LoginRedirection(WebDriver driver) {

		checkRedirectionAfterClickLoginPage(driver, WishButton, "Wish");

	}

	// Method to check all buttons' redirection
	public void checkCartButtonClick_LoginRedirection(WebDriver driver) {

		checkRedirectionAfterClickLoginPage(driver, CartButton, "Cart");
	}

	// Method to check all buttons' redirection
	public void checkSignupButton_SignupRedirection(WebDriver driver) {

		checkRedirectionAfterClickSignupPage(driver, SignupButton, "Signup");

	}

	public void MobileNumberTextDisplayOrNot(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.elementToBeClickable(AccountButton)).click();

		wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();

		try {

			checkButtonDisplay(driver, MobileNumbertext, "MobileNumbertext");
		} catch (Exception e) {
			System.out.println("Error in displaying 'Your Account' text: " + e.getMessage());
		}

	}

	public void LoginTextDisplayOrNot(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.elementToBeClickable(AccountButton)).click();

		wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();

		try {

			checkButtonDisplay(driver, Logintext, "Logintext");
		} catch (Exception e) {
			System.out.println("Error in displaying 'Your Account' text: " + e.getMessage());
		}

	}

	public void ContinuetextDisplayOrNot(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.elementToBeClickable(AccountButton)).click();

		wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();

		try {

			checkButtonDisplay(driver, Continuetext, "Continuetext");
		} catch (Exception e) {
			System.out.println("Error in displaying 'Your Account' text: " + e.getMessage());
		}

	}

	public void SignuptextDisplayOrNot(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.elementToBeClickable(AccountButton)).click();

		wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();

		try {

			checkButtonDisplay(driver, Signuptext, "Signuptext");
		} catch (Exception e) {
			System.out.println("Error in displaying 'Your Account' text: " + e.getMessage());
		}

	}

	public void PageshouldnavigatetoOtppage(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.elementToBeClickable(AccountButton)).click();

		wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();

		wait.until(ExpectedConditions.elementToBeClickable(MobileNumberFiled)).sendKeys("6305349069");

		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton)).click();

		wait.until(ExpectedConditions.visibilityOf(EnterYourOTPText));

		boolean EnterotpText = EnterYourOTPText.isDisplayed();

		if (EnterotpText == true) {

			System.out.println("Redirect To OTP Page");

		} else {

			System.out.println("Not Redirect To OTP Page");
		}

	}

	public void OTPTimmeDisplayOrNot(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));

		wait.until(ExpectedConditions.elementToBeClickable(AccountButton)).click();

		wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();

		wait.until(ExpectedConditions.elementToBeClickable(MobileNumberFiled)).sendKeys("6305349069");

		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton)).click();

		try {

			checkButtonDisplay(driver, OtpPageTime, "OTPPageTimer");
		} catch (Exception e) {
			System.out.println("Error in displaying 'Your Account' text: " + e.getMessage());
		}

	}

	public void ResetButtonDisplayOrNot(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));

		wait.until(ExpectedConditions.elementToBeClickable(AccountButton)).click();

		wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();

		wait.until(ExpectedConditions.elementToBeClickable(MobileNumberFiled)).sendKeys("6305349069");

		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton)).click();

		try {

			wait.until(ExpectedConditions.visibilityOf(ResendOtp));
			checkButtonDisplay(driver, ResendOtp, "ResetOTPButton");
		} catch (Exception e) {
			System.out.println("Error in displaying 'Your Account' text: " + e.getMessage());
		}

	}

	
	
	
	
	
	
	
	
	
	
	
	
}

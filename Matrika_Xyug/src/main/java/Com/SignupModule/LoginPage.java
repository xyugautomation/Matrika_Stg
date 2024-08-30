package Com.SignupModule;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {

	@FindBy(xpath = "//input[@formcontrolname='phonenumber']")
	public WebElement PhoneNumber;

	@FindBy(xpath = "//button[normalize-space()='Continue']")
	public WebElement ContinueButton;

	@FindBy(xpath = "//div[@aria-label='User not found. Please register to continue.']")
	public WebElement UserNotFound;

	@FindBy(xpath = "//div[@aria-label='Your account is terminated.']")
	public WebElement UserAlreadyRegisterbutDeleted;

	@FindBy(xpath = "//p[@class='login-para']")
	public WebElement LogInText;

	@FindBy(xpath = "//label[@class='email-label']")
	public WebElement MobileNumberText;

	@FindBy(xpath = "//p[@class='to-enjoy-para']")
	public WebElement ToEnjoyASeamlessShoppingExperience;

	@FindBy(xpath = "//div[contains(@class, 'validationError') and contains(text(), 'Mobile number is required.')]")
	public WebElement ErrorMsgMobileNumberFiledEmpty;

	@FindBy(xpath = "(//div[@class='validationError ng-star-inserted'])[1]")
	public WebElement ErrorMsgValidation;

	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/app-login[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ng-otp-input[1]/div[1]/input[1]")
	public WebElement OTP1;

	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/app-login[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ng-otp-input[1]/div[1]/input[2]")
	public WebElement OTP2;

	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/app-login[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ng-otp-input[1]/div[1]/input[3]")
	public WebElement OTP3;

	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/app-login[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ng-otp-input[1]/div[1]/input[4]")
	public WebElement OTP4;

	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/app-login[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ng-otp-input[1]/div[1]/input[5]")
	public WebElement OTP5;

	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/app-login[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ng-otp-input[1]/div[1]/input[6]")
	public WebElement OTP6;

	@FindBy(xpath = "//p[normalize-space()='Account']")
	public WebElement AccountButton;

	@FindBy(xpath = "//button[normalize-space()='Log Out']")
	public WebElement LogoutButton;

	@FindBy(xpath = "//button[normalize-space()='Yes, Logout it']")
	public WebElement YesButton;

	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	public WebElement CancelButton;

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void ValidationMsg() throws InterruptedException {
		Thread.sleep(2000);
		PhoneNumber.sendKeys("sdfsdkhf");
		ContinueButton.click();
		ErrorMsgValidation.isDisplayed();
		System.out.println("Validation msg: " + ErrorMsgValidation.getText());
		PhoneNumber.clear();
	}

	public void WithoutEnterMobileNumber() throws InterruptedException {
		Thread.sleep(2000);
		PhoneNumber.click();
		ContinueButton.click();
		Thread.sleep(2000);
		ErrorMsgMobileNumberFiledEmpty.isDisplayed();
		System.out.println("Without Enter: " + ErrorMsgMobileNumberFiledEmpty.getText());
	}

	public void enterMobileNumber(String MobileNumber) {
		PhoneNumber.sendKeys(MobileNumber);
	}

	public boolean isContinueButtonEnabled() {
		return ContinueButton.isEnabled();
	}

	public void isLoginTextDisplay() throws InterruptedException {
		Thread.sleep(1000);
		boolean logintext = LogInText.isDisplayed();

		if (logintext == true) {

			System.out.println("Login Text is Display");

		} else {

			System.out.println("Login Text is not Display");

		}

	}

	public void isTextDisplayToEnjoyASeamlessShoppingExperience() throws InterruptedException {
		Thread.sleep(1000);
		boolean ToEnjoyText = ToEnjoyASeamlessShoppingExperience.isDisplayed();

		if (ToEnjoyText == true) {

			System.out.println("To Enjoy A Seamless Shopping Experience text is display..!!");

		} else {
			System.out.println("To Enjoy A Seamless Shopping Experience text is not display..!!");

		}

	}

	public void isDisplayMobileNumber() {

		boolean mobilenumber = PhoneNumber.isDisplayed();

		if (mobilenumber == true) {
			System.out.println("PhoneNumber button is display..");

		} else {

			System.out.println("PhoneNumber button is not display..");

		}

	}

	public void isDisplayContinuButton() {

		boolean mobilenumber = ContinueButton.isDisplayed();

		if (mobilenumber == true) {
			System.out.println("ContinueButton  is display..");

		} else {

			System.out.println("ContinueButton is not display..");

		}
	}

	public boolean isAccountButtonClickable() throws InterruptedException {
		Thread.sleep(2000);
		return AccountButton.isEnabled() && AccountButton.isDisplayed();
	}

	public boolean isLogutButtonClickable() throws InterruptedException {
		Thread.sleep(2000);
		return LogoutButton.isEnabled() && LogoutButton.isDisplayed();
	}

	public boolean isYesButtonClickable() throws InterruptedException {
		Thread.sleep(2000);
		return YesButton.isEnabled() && YesButton.isDisplayed();
	}

	public boolean isCancleButtonClickable() throws InterruptedException {
		Thread.sleep(2000);
		return CancelButton.isEnabled() && CancelButton.isDisplayed();
	}
	
	public void EnterValidDataLogin(WebDriver driver) throws InterruptedException {

		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		    // Clear and enter the phone number
		    Thread.sleep(2000);
		    PhoneNumber.clear();
		    PhoneNumber.sendKeys("6309631698");

		    // Click the continue button
		    Thread.sleep(1000);
		    ContinueButton.click();

		    // Wait until OTP1 to OTP6 fields are visible
		    wait.until(ExpectedConditions.visibilityOf(OTP1));
		    wait.until(ExpectedConditions.visibilityOf(OTP2));
		    wait.until(ExpectedConditions.visibilityOf(OTP3));
		    wait.until(ExpectedConditions.visibilityOf(OTP4));
		    wait.until(ExpectedConditions.visibilityOf(OTP5));
		    wait.until(ExpectedConditions.visibilityOf(OTP6));

		    // Enter OTP values
		    OTP1.sendKeys("1");
		    OTP2.sendKeys("2");
		    OTP3.sendKeys("3");
		    OTP4.sendKeys("4");
		    OTP5.sendKeys("5");
		    OTP6.sendKeys("6");

	}
	

	public void EnterValidData() throws InterruptedException {
		Thread.sleep(2000);
		PhoneNumber.clear();
		PhoneNumber.sendKeys("6309631698");
		Thread.sleep(2000);
		ContinueButton.click();
		// Simulate entering the OTP
		Thread.sleep(2000);
		OTP1.sendKeys("1");
		OTP2.sendKeys("2");
		OTP3.sendKeys("3");
		OTP4.sendKeys("4");
		OTP5.sendKeys("5");
		OTP6.sendKeys("6");
		Thread.sleep(2000);
		System.out.println("Successfully logged into the application.");
		// Check if Account button is clickable and print confirmation
		Assert.assertTrue(isAccountButtonClickable(), "Account button should be clickable");
		System.out.println("Account button is clickable.");
		AccountButton.click();
		Thread.sleep(2000);
		LogoutButton.click();
		Thread.sleep(2000);
		// Check if Cancel button is clickable and print confirmation
		Assert.assertTrue(isCancleButtonClickable(), "Cancel button should be clickable");
		System.out.println("Cancel button is clickable.");
		CancelButton.click();
		System.out.println("The application shouldn't be logged out when you click the cancel button.");

		Thread.sleep(2000);
		AccountButton.click();
		Thread.sleep(2000);
		// Check if Logout button is clickable and print confirmation
		Assert.assertTrue(isLogutButtonClickable(), "Logout button should be clickable");
		System.out.println("Logout button is clickable.");
		LogoutButton.click();

		Thread.sleep(2000);
		// Check if Yes button is clickable and print confirmation
		Assert.assertTrue(isYesButtonClickable(), "Yes button should be clickable");
		System.out.println("Yes button is clickable.");
		YesButton.click();
		System.out.println("Successfully logged out of the application.");
	}

	public void EnterInvalidData() throws InterruptedException {
		Thread.sleep(2000);
		PhoneNumber.sendKeys("8698502256");
		Thread.sleep(2000);
		ContinueButton.click();
		Thread.sleep(2000);

		if (UserNotFound.isDisplayed()) {
			System.out.println(UserNotFound.getText());
	}

	}

	public void AlreadyRegisterButDelete() throws InterruptedException {
		Thread.sleep(2000);
		PhoneNumber.clear();
		PhoneNumber.sendKeys("8698502234");
		Thread.sleep(2000);
		ContinueButton.click();
		Thread.sleep(2000);
		if (UserAlreadyRegisterbutDeleted.isDisplayed()) {
			System.out.println(UserAlreadyRegisterbutDeleted.getText());

		}
	}
}

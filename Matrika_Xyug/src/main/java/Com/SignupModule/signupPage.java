package Com.SignupModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class signupPage {

	@FindBy(xpath = "//div[@id='dropdownMenuButton1']")
	public static WebElement AccountButton;

	@FindBy(xpath = "//p[@class='login-para']")
	public static WebElement signupText;

	@FindBy(xpath = "//button[normalize-space()='Sign Up']")
	public static WebElement signupButton;

	@FindBy(xpath = "//div[@class='login-maindiv']//div[@class='row']//div[@class='col-md-6']//div//input[@placeholder='Enter Full Name']")
	public static WebElement EnterName;

	@FindBy(xpath = "//div[@class='login-maindiv']//div[@class='row']//div[@class='col-md-6']//div//input[@placeholder='Enter Mail Id']")
	public static WebElement EnterMailID;

	@FindBy(xpath = "//div[@class='login-maindiv']//div[@class='row']//div[@class='col-md-6']//div//input[@placeholder='Enter Mobile Number']")
	public static WebElement EnterMobileNumber;

	@FindBy(xpath = "//input[@placeholder='Enter Referral Code']")
	public static WebElement EnterReferralCode;

	@FindBy(xpath = "//input[@type='checkbox']")
	public static WebElement ClickCheckBox;

	@FindBy(xpath = "//button[normalize-space()='Create Account']")
	public static WebElement CreateAccountButton;

	@FindBy(xpath = "//span[@class='span-sign-up-para']")
	public static WebElement LoginButton;

	@FindBy(xpath = "//div[contains(@aria-label,'Mobile Number already exists , please register with new number.')]")
	public static WebElement AlreadyRegisterNumber;

	@FindBy(xpath = "//input[@formcontrolname='phonenumber']")
	public static WebElement EnterMobileNumberlogin;

	@FindBy(xpath = "//button[normalize-space()='Continue']")
	public static WebElement continueButton;

	@FindBy(xpath = "//div[@aria-label='Invalid OTP']")
	public static WebElement InvalidOTP;

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

	// Error msg with empty field.

	@FindBy(xpath = "//div[normalize-space()='Name is required.']")
	public WebElement NameisRequired;

	@FindBy(xpath = "//div[normalize-space()='email is required.']")
	public WebElement EmailisRequired;

	@FindBy(xpath = "//div[normalize-space()='Mobile number is required.']")
	public WebElement MobileNumberisRequired;

	@FindBy(xpath = "//span[normalize-space()='You must agree to the Terms and Conditions.']")
	public WebElement checkBox;

	@FindBy(xpath = "")
	public WebElement thej;

	// with invalidate data

	@FindBy(xpath = "//div[normalize-space()='Please enter a valid name.']")
	public WebElement ValidName;

	@FindBy(xpath = "//div[normalize-space()='Please enter a valid mobile number.']")
	public WebElement ValidMobileNumber;

	@FindBy(xpath = "//div[normalize-space()='Please enter a valid email.']")
	public WebElement vaidEmailID;

	public signupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void isDisplayAccountButton() throws InterruptedException {
		Thread.sleep(2000);
		boolean accountbutton = AccountButton.isDisplayed();

		if (accountbutton == true) {

			System.out.println("AccountButton is display..!!");

		} else {

			System.out.println("AccountButton is not display..!!");

		}
		Thread.sleep(2000);

		AccountButton.click();

	}

	public void isclickableAccountButton() throws InterruptedException {
		Thread.sleep(2000);
		boolean accountbutton = AccountButton.isDisplayed();

		if (accountbutton == true) {

			System.out.println("AccountButton is display..!!");

		} else {

			System.out.println("AccountButton is not display..!!");

		}
		Thread.sleep(2000);

		AccountButton.click();

	}

	public void isDisplaysignupButton() throws InterruptedException {
		Thread.sleep(2000);

		boolean signupbutton = signupButton.isDisplayed();

		if (signupbutton == true) {

			System.out.println("signup button is display..!!");

		} else {

			System.out.println("signup button is not display..!!");

		}
		Thread.sleep(2000);
		signupButton.click();

	}

	public void isDisplaysignupText() throws InterruptedException {
		Thread.sleep(2000);

		boolean signuptext = signupText.isDisplayed();

		if (signuptext == true) {

			System.out.println("signupText is display..!!");

		} else {

			System.out.println("signupText is not display..!!");

		}

	}

	public void isDisplayEnterName() throws InterruptedException {
		Thread.sleep(2000);

		boolean enterName = EnterName.isDisplayed();

		if (enterName == true) {

			System.out.println("EnterName is display..!!");

		} else {

			System.out.println("EnterName is not display..!!");

		}

	}

	public void isDisplayEnterMailID() throws InterruptedException {
		Thread.sleep(2000);

		boolean entermailID = EnterMailID.isDisplayed();

		if (entermailID == true) {

			System.out.println("EnterMailID is display..!!");

		} else {

			System.out.println("EnterMailID is not display..!!");

		}

	}

	public void isDisplayEnterReferralCode() throws InterruptedException {
		Thread.sleep(2000);

		boolean enterreferralCode = EnterReferralCode.isDisplayed();

		if (enterreferralCode == true) {

			System.out.println("EnterReferralCode is display..!!");

		} else {

			System.out.println("EnterReferralCode is not display..!!");

		}

	}

	public void isDisplayEnterMobileNumber() throws InterruptedException {
		Thread.sleep(2000);

		boolean entermobileNumber = EnterMobileNumber.isDisplayed();

		if (entermobileNumber == true) {

			System.out.println("EnterMobileNumber is display..!!");

		} else {

			System.out.println("EnterMobileNumber is not display..!!");

		}

	}

	public void isDisplayClickCheckBox() throws InterruptedException {
		Thread.sleep(2000);

		boolean clickcheckBox = ClickCheckBox.isDisplayed();

		if (clickcheckBox == true) {

			System.out.println("ClickCheckBox is display..!!");

		} else {

			System.out.println("ClickCheckBox is not display..!!");

		}

	}

	public void isDisplayCreateAccountButton() throws InterruptedException {
		Thread.sleep(2000);

		boolean createaccountbutton = CreateAccountButton.isDisplayed();

		if (createaccountbutton == true) {

			System.out.println("CreateAccountButton is display..!!");

		} else {

			System.out.println("CreateAccountButton is not display..!!");

		}

	}

	public void isDisplayLoginButton() throws InterruptedException {
		Thread.sleep(2000);

		boolean loginbutton = LoginButton.isDisplayed();

		if (loginbutton == true) {

			System.out.println("LoginButton is display..!!");

		} else {

			System.out.println("LoginButton is not display..!!");

		}

	}

	public void EnterValidateData() throws InterruptedException {
		Thread.sleep(2000);
		AccountButton.click();
		Thread.sleep(2000);
		signupButton.click();
		Thread.sleep(2000);
		// Check and clear invalid data in Name field
		if (!EnterName.getAttribute("value").matches("[A-Za-z]+")) {
			EnterName.clear();
			System.out.println("Invalid data in Name field cleared.");
		}
		EnterName.sendKeys("Shiv");

		// Check and clear invalid data in Email field
		Thread.sleep(2000);
		if (!EnterMailID.getAttribute("value").matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
			EnterMailID.clear();
			System.out.println("Invalid data in Email field cleared.");
		}
		EnterMailID.sendKeys("Shiv.xyug@gmail.com");

		// Check and clear invalid data in Mobile Number field
		Thread.sleep(2000);
		if (!EnterMobileNumber.getAttribute("value").matches("\\d{10}")) {
			EnterMobileNumber.clear();
			System.out.println("Invalid data in Mobile Number field cleared.");
		}
		EnterMobileNumber.sendKeys("6309631698");
		Thread.sleep(2000);
		// ClickCheckBox.click();
		CreateAccountButton.click();
		Thread.sleep(2000);
		// Check if already registered number is displayed
		if (AlreadyRegisterNumber.isDisplayed()) {
			LoginButton.click();
			Thread.sleep(2000);
			EnterMobileNumberlogin.clear(); // Clear the login mobile number field before entering new data
			EnterMobileNumberlogin.sendKeys("6309631698");
			continueButton.click();
			// Simulate OTP input
			Thread.sleep(2000);
			OTP1.sendKeys("1");
			OTP2.sendKeys("2");
			OTP3.sendKeys("3");
			OTP4.sendKeys("4");
			OTP5.sendKeys("5");
			OTP6.sendKeys("6");
		} else {
			System.out.println("Please signup with a new mobile number.");

		}

//		
//		Thread.sleep(2000);
//		AccountButton.click();
//		Thread.sleep(2000);
//		signupButton.click();
//		Thread.sleep(2000);
//		
//		EnterName.sendKeys("Shiv");
//		Thread.sleep(2000);
//		EnterMailID.sendKeys("Shiv.xyug@gmail.com");
//		Thread.sleep(2000);
//		EnterMobileNumber.sendKeys("6309631698");
//		Thread.sleep(2000);
//		ClickCheckBox.click();
//		CreateAccountButton.click();
//		Thread.sleep(2000);
//		if (AlreadyRegisterNumber.isDisplayed()) {
//			LoginButton.click();
//			Thread.sleep(2000);
//			EnterMobileNumberlogin.sendKeys("6309631698");
//			continueButton.click();
//			Thread.sleep(2000);
//			OTP1.sendKeys("1");
//			OTP2.sendKeys("2");
//			OTP3.sendKeys("3");
//			OTP4.sendKeys("4");
//			OTP5.sendKeys("5");
//			OTP6.sendKeys("6");
//		} else {
//			System.out.println("Please signup with new mobile number..");
//
//		}

	}

	public void InvalidData() throws InterruptedException {
		Thread.sleep(2000);
		AccountButton.click();
		Thread.sleep(2000);
		signupButton.click();
		Thread.sleep(2000);
		EnterName.sendKeys("123456");
		EnterName.click();
		Thread.sleep(2000);
		EnterMailID.click();
		Assert.assertTrue(ValidName.isDisplayed(), "Error message for invalid name should be displayed");
		Thread.sleep(2000);
		EnterMailID.sendKeys("123456");
		EnterReferralCode.click();
		Assert.assertTrue(vaidEmailID.isDisplayed(), "Error message for invalid email should be displayed");
		Thread.sleep(2000);
		EnterMobileNumber.sendKeys("sdfsdfsdf");
		EnterMobileNumber.click();
		EnterReferralCode.click();
		Thread.sleep(2000);
		Assert.assertTrue(ValidMobileNumber.isDisplayed(),
				"Error message for invalid mobile number should be displayed");
		ClickCheckBox.click();
		CreateAccountButton.click();

	}

	public void InValidOTP() {

		boolean invalidotp = InvalidOTP.isDisplayed();

		if (InvalidOTP.isDisplayed()) {

		}

	}

	public void NameSpecialChar() {

	}

}

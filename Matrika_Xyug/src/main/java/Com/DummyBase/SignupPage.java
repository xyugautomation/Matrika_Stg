package Com.DummyBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	WebDriver driver;

	@FindBy(id = "mobileNumber")
	WebElement mobileNumberField;

	@FindBy(id = "sendOtpButton")
	WebElement sendOtpButton;

	@FindBy(id = "otpField")
	WebElement otpField;

	@FindBy(id = "signupButton")
	WebElement signupButton;

	public SignupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterMobileNumber(String mobileNumber) {
		mobileNumberField.sendKeys(mobileNumber);
	}

	public void clickSendOtp() {
		sendOtpButton.click();
	}

	public void enterOtp(String otp) {
		otpField.sendKeys(otp);
	}

	public void clickSignup() {
		signupButton.click();
	}

}

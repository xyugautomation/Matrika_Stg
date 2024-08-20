package Com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPanelPage {
	  WebDriver driver;

	    @FindBy(id = "username")
	    WebElement usernameField;

	    @FindBy(id = "password")
	    WebElement passwordField;

	    @FindBy(id = "loginButton")
	    WebElement loginButton;

	    @FindBy(xpath = "//a[text()='Settings']")
	    WebElement settingsMenu;

	    @FindBy(xpath = "//a[text()='OTP List']")
	    WebElement otpListOption;

	    @FindBy(xpath = "//table[@id='otpTable']//tr[1]/td[2]")
	    WebElement firstOtp;

	    public AdminPanelPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void login(String username, String password) {
	        usernameField.sendKeys(username);
	        passwordField.sendKeys(password);
	        loginButton.click();
	    }

	    public void navigateToOtpList() {
	        settingsMenu.click();
	        otpListOption.click();
	    }

	    public String getFirstOtp() {
	        return firstOtp.getText();
	    }
	}


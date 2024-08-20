package com.SignupModuleTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Base.AdminPanelPage;
import Com.Base.SignupPage;

public class MatrikaSignupTest extends  BaseTest {
	
	  @Test
	    public void testMatrikaSignupWithOtp() {
	        // Navigate to signup page
	        SignupPage signupPage = new SignupPage(driver);
	        signupPage.enterMobileNumber("1234567890"); // replace with valid mobile number
	        signupPage.clickSendOtp();

	        // Navigate to admin panel
	        driver.navigate().to("http://stg-fms.goldbox.gold/signin"); // replace with actual admin URL
	        AdminPanelPage adminPanelPage = new AdminPanelPage(driver);
	        adminPanelPage.login("soumya@gmail.com", "Backend@2024"); // replace with valid credentials
	        adminPanelPage.navigateToOtpList();

	        // Retrieve OTP and complete signup
	        String otp = adminPanelPage.getFirstOtp();
	        driver.navigate().back(); // Navigate back to signup page
	        signupPage.enterOtp(otp);
	        signupPage.clickSignup();

	        // Assert signup success
	        Assert.assertTrue(driver.getCurrentUrl().contains("success")); // modify as needed
	    }
}

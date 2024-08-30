package com.SignupModuleTest;

import org.testng.annotations.Test;

import Com.Base.LaunchBrowser;
import Com.SignupModule.signupPage;

public class SignupPageTest extends LaunchBrowser {

	public signupPage signupPage;

	@Test(priority = 1)
	public void testAccountButtonIsDisplayed() throws InterruptedException {
		signupPage signupPage = new signupPage(driver);
		signupPage.isDisplayAccountButton();
	}

	@Test(priority = 2)
	public void testSignupButtonIsDisplayed() throws InterruptedException {
		signupPage signupPage = new signupPage(driver);
		signupPage.isDisplaysignupButton();
	}

	@Test(priority = 3)
	public void testSignupTextIsDisplayed() throws InterruptedException {
		signupPage signupPage = new signupPage(driver);
		signupPage.isDisplaysignupText();
	}

	@Test(priority = 4)
	public void testEnterNameIsDisplayed() throws InterruptedException {
		signupPage signupPage = new signupPage(driver);
		signupPage.isDisplayEnterName();
	}

	@Test(priority = 5)
	public void testEnterMailIDIsDisplayed() throws InterruptedException {
		signupPage signupPage = new signupPage(driver);
		signupPage.isDisplayEnterMailID();
	}

	@Test(priority = 6)
	public void testEnterMobileNumberIsDisplayed() throws InterruptedException {
		signupPage signupPage = new signupPage(driver);
		signupPage.isDisplayEnterMobileNumber();
	}

	@Test(priority = 7)
	public void testEnterReferralCodeIsDisplayed() throws InterruptedException {
		signupPage signupPage = new signupPage(driver);
		signupPage.isDisplayEnterReferralCode();
	}

	@Test(priority = 8)
	public void testClickCheckBoxIsDisplayed() throws InterruptedException {
		signupPage signupPage = new signupPage(driver);
		signupPage.isDisplayClickCheckBox();
	}

	@Test(priority = 9)
	public void testCreateAccountButtonIsDisplayed() throws InterruptedException {
		signupPage signupPage = new signupPage(driver);
		signupPage.isDisplayCreateAccountButton();
	}

	@Test(priority = 10)
	public void testLoginButtonIsDisplayed() throws InterruptedException {
		signupPage signupPage = new signupPage(driver);
		signupPage.isDisplayLoginButton();
	}

	@Test(priority = 11)
	public void test_Enter_Invalid_signup_Data() throws InterruptedException {
		signupPage signupPage = new signupPage(driver);
		signupPage.InvalidData();

	}

	@Test(priority = 12)
	public void test_Enter_valid_signup_Data() throws InterruptedException {
		signupPage signupPage = new signupPage(driver);
		signupPage.EnterValidateData();

	}

}

package com.SignupModuleTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Base.LaunchBrowser;
import Com.SignupModule.LoginPage;

public class LoginPageTest extends LaunchBrowser {
//
//	@Test(priority = 1)
//	public void test_isTextDisplayToEnjoyASeamlessShoppingExperience() throws InterruptedException {
//		LoginPage LP = new LoginPage(driver);
//		LP.isTextDisplayToEnjoyASeamlessShoppingExperience();
//
//	}
//
//	public void test_Mobile_Number_Text() {
//		LoginPage LP = new LoginPage(driver);
//
//	}
//
//	@Test(priority = 1)
//	public void test_LoginText_Display() throws InterruptedException {
//
//		LoginPage LP = new LoginPage(driver);
//		LP.isLoginTextDisplay();
//
//	}
//
//	@Test(priority = 2)
//	public void test_PhoneNumberIsDisplay() {
//		LoginPage LP = new LoginPage(driver);
//		LP.isDisplayMobileNumber();
//
//	}
//
//	@Test(priority = 3)
//
//	public void test_ContinuButtonDisplay() {
//
//		LoginPage LP = new LoginPage(driver);
//		LP.isDisplayContinuButton();
//
//	}
//
//	@Test(priority = 4)
//	public void test_WhenEnterMobileNumberContinuButtonEnabled() {
//
//	}
//
//	@Test(priority = 5)
//	public void Test_EnterWithoutRegisterMobileNumber() throws InterruptedException {
//		LoginPage LP = new LoginPage(driver);
//		LP.EnterInvalidData();
//
//	}
//
//	@Test(priority = 6)
//	public void Test_AlreadyRegisterUserButAccountDeleted() throws InterruptedException {
//		LoginPage LP = new LoginPage(driver);
//		LP.AlreadyRegisterButDelete();
//
//	}

	
	@Test(priority = 1)
	public void test_Enter_MobileNumber() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidData();

	}

//	@Test(priority = 2)
//	public void test_AccountButtonIsClickable() throws InterruptedException {
//		LoginPage LP = new LoginPage(driver);
//		Assert.assertTrue(LP.isAccountButtonClickable(), "Account button should be clickable");
//	}
//
//	@Test(priority = 3)
//	public void test_LogutButtonIsClickable() throws InterruptedException {
//		LoginPage LP = new LoginPage(driver);
//		Assert.assertTrue(LP.isLogutButtonClickable(), "Logout button should be clickable");
//	}
//
//	@Test(priority = 4)
//	public void test_CancleButtonIsClickable() throws InterruptedException {
//		LoginPage LP = new LoginPage(driver);
//		Assert.assertTrue(LP.isCancleButtonClickable(), "Cancle button should be clickable");
//	}
//
//	@Test(priority = 5)
//	public void test_YesButtonIsClickable() throws InterruptedException {
//		LoginPage LP = new LoginPage(driver);
//		Assert.assertTrue(LP.isYesButtonClickable(), "Yes button should be clickable");
//	}







}

package com.LoginModuleTest;

import org.testng.annotations.Test;
import com.Base.LaunchBrowser;
import Com.LoginModule.LoginPage;

public class LoginPageTest extends LaunchBrowser {

	@Test(priority = 1)
	public void test_Without_Enter_Mob() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.WithoutEnterMobileNumber();
	}

	@Test(priority = 2)
	public void test_EnterInvalidData() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.ValidationMsg();
	}

	@Test(priority = 3)
	public void test_isTextDisplayToEnjoyASeamlessShoppingExperience() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.isTextDisplayToEnjoyASeamlessShoppingExperience();
	}

	@Test(priority = 4)
	public void test_LoginText_Display() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.isLoginTextDisplay();
	}

	@Test(priority = 5)
	public void test_PhoneNumberIsDisplay() {
		LoginPage LP = new LoginPage(driver);
		LP.isDisplayMobileNumber();
	}

	@Test(priority = 6)
	public void test_ContinuButtonDisplay() {

		LoginPage LP = new LoginPage(driver);
		LP.isDisplayContinuButton();
	}

	@Test(priority = 7)
	public void Test_EnterWithoutRegisterMobileNumber() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterInvalidData();
	}

	@Test(priority = 8)
	public void Test_AlreadyRegisterUserButAccountDeleted() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.AlreadyRegisterButDelete();
	}

	@Test(priority = 9)
	public void test_Enter_MobileNumber() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidData();
	}
}

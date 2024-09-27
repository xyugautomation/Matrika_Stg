package com.Checkout_ModuleTest;

import org.testng.annotations.Test;

import com.Base.LaunchBrowser;

import Com.Check_out_Module.checkoutpageAfterLogin;
import Com.LoginModule.LoginPage;

public class CheckOutPageTest extends LaunchBrowser {

	@Test
	public void test_ClickCheckoutButton() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		checkoutpageAfterLogin checkoutPage = new checkoutpageAfterLogin(driver);
		checkoutPage.NavigateToCartPage(driver);

	}

	@Test
	public void testCheckoutProductsText() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);

		checkoutpageAfterLogin checkoutPage = new checkoutpageAfterLogin(driver);
		checkoutPage.NavigateToCartPage(driver);
		checkoutPage.NavigateToCheckOutPage(driver);
		checkoutPage.checkCheckoutProductsText(driver);
	}

	@Test
	public void testTotalText() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		checkoutpageAfterLogin checkoutPage = new checkoutpageAfterLogin(driver);
		checkoutPage.NavigateToCartPage(driver);
		checkoutPage.NavigateToCheckOutPage(driver);
		checkoutPage.checkTotalText(driver);
	}

	@Test
	public void testBookingAccountText() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		checkoutpageAfterLogin checkoutPage = new checkoutpageAfterLogin(driver);

		checkoutPage.NavigateToCartPage(driver);
		checkoutPage.NavigateToCheckOutPage(driver);
		checkoutPage.checkBookingAccountText(driver);
	}

	@Test
	public void testBookingAccountBalanceText() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		checkoutpageAfterLogin checkoutPage = new checkoutpageAfterLogin(driver);
		checkoutPage.NavigateToCartPage(driver);
		checkoutPage.NavigateToCheckOutPage(driver);
		checkoutPage.checkBookingAccountBalanceText(driver);
	}

	@Test
	public void testAddMoneyText() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		checkoutpageAfterLogin checkoutPage = new checkoutpageAfterLogin(driver);
		checkoutPage.NavigateToCartPage(driver);
		checkoutPage.NavigateToCheckOutPage(driver);
		checkoutPage.checkAddMoneyText(driver);
	}

	@Test
	public void testGiftcardText() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		checkoutpageAfterLogin checkoutPage = new checkoutpageAfterLogin(driver);
		checkoutPage.NavigateToCartPage(driver);
		checkoutPage.NavigateToCheckOutPage(driver);
		checkoutPage.checkGiftcardText(driver);
	}

	@Test
	public void testCouponsText() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		checkoutpageAfterLogin checkoutPage = new checkoutpageAfterLogin(driver);
		checkoutPage.NavigateToCartPage(driver);
		checkoutPage.NavigateToCheckOutPage(driver);
		checkoutPage.checkCouponsText(driver);
	}

	@Test
	public void testPayableAmountText() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		checkoutpageAfterLogin checkoutPage = new checkoutpageAfterLogin(driver);
		checkoutPage.NavigateToCartPage(driver);
		checkoutPage.NavigateToCheckOutPage(driver);
		checkoutPage.checkPayableAmountText(driver);
	}

	@Test
	public void testPayWithText() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		checkoutpageAfterLogin checkoutPage = new checkoutpageAfterLogin(driver);
		checkoutPage.NavigateToCartPage(driver);
		checkoutPage.NavigateToCheckOutPage(driver);
		checkoutPage.checkPayWithText(driver);
	}

	@Test
	public void testMatrikaPromisesText() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		checkoutpageAfterLogin checkoutPage = new checkoutpageAfterLogin(driver);
		checkoutPage.NavigateToCartPage(driver);
		checkoutPage.NavigateToCheckOutPage(driver);
		checkoutPage.checkMatrikaPromisesText(driver);
	}

}

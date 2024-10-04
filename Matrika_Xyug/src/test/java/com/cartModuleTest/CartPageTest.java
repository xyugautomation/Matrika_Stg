package com.cartModuleTest;
import org.testng.annotations.Test;
import com.Base.LaunchBrowser;
import Com.Cart_Module.CartPageAfterLogin;
import Com.LoginModule.LoginPage;

public class CartPageTest extends LaunchBrowser {

	@Test(description = "Verify To Check Redirect To CheckOutPage..")
	public void test_CheckLinkRedirect() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		CartPageAfterLogin ch = new CartPageAfterLogin(driver);
		ch.NavigateToCartPage(driver);
		ch.NavigateTocheckOutPage(driver);

	}

	@Test(description = "Verify To Check TotalIteam Text Display or Not")
	public void test_totalitemTextDisplayOrNot() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		CartPageAfterLogin ch = new CartPageAfterLogin(driver);
		ch.NavigateToCartPage(driver);
		ch.TotalIteamTextDisplayOrNot(driver);
	}

	@Test(description = "Verify To Check MatrikaPromises Text Display or Not")
	public void test_MatrikapromisesTextDisplayOrNot() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		CartPageAfterLogin ch = new CartPageAfterLogin(driver);
		ch.NavigateToCartPage(driver);
		ch.MatrikaPromisesTextOrNot(driver);
	}

	@Test(description = "Verify To Check RemoveButton Text Display or Not")
	public void test_RemovebuttonTextDisplayOrNot() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		CartPageAfterLogin ch = new CartPageAfterLogin(driver);
		ch.NavigateToCartPage(driver);
		ch.RemoveButtonDisplayOrNot(driver);
	}

	@Test(description = "Verify To Check RemoveButton clickable or Not")
	public void test_RemovebuttonClickableOrNot() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		CartPageAfterLogin ch = new CartPageAfterLogin(driver);
		ch.NavigateToCartPage(driver);
		ch.RemoveButtonClickable(driver);
	}

	@Test(description = "Verify To YesDeleteItButton Display or Not")
	public void test_YesDeleteitDisplayOrNot() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		CartPageAfterLogin ch = new CartPageAfterLogin(driver);
		ch.NavigateToCartPage(driver);
		ch.YesButtonDisplayOrNot(driver);
	}

	@Test(description = "Verify To YesDeleteItButton clickable or Not")
	public void test_YesDeleteitClickableOrNot() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		CartPageAfterLogin ch = new CartPageAfterLogin(driver);
		ch.NavigateToCartPage(driver);
		ch.YesDeleteItButtonClickable(driver);
	}

	@Test(description = "Verify To CancleButton Display or Not")
	public void test_CancelDisplayOrNot() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		CartPageAfterLogin ch = new CartPageAfterLogin(driver);
		ch.NavigateToCartPage(driver);
		ch.CancelButtonDisplayOrNot(driver);
	}

	@Test(description = "Verify To Cancel button clickable or Not")
	public void test_CancelClickableOrNot() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		CartPageAfterLogin ch = new CartPageAfterLogin(driver);
		ch.NavigateToCartPage(driver);
		ch.CancelButtonClickable(driver);
	}

	@Test(description = "Verify To Checkout Button Display or Not")
	public void test_CheckOutButtonDisplayOrNot() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		CartPageAfterLogin ch = new CartPageAfterLogin(driver);
		ch.NavigateToCartPage(driver);
		ch.CheckoutButtonDisplayOrNot(driver);
	
		
	}

}

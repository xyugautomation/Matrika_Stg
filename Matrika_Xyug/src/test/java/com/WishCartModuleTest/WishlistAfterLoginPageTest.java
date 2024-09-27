package com.WishCartModuleTest;
import org.testng.annotations.Test;
import com.Base.LaunchBrowser;
import Com.LoginModule.LoginPage;
import Com.WishModule.WishlistAfterLogin;

public class WishlistAfterLoginPageTest extends LaunchBrowser {

	@Test(description = "Verify  when Clicking on whishlist page Displaying Wishlist Items text or not")
	public void test_WishlistItemsTextDisplayOrNot() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		WishlistAfterLogin wishafterlogin = new WishlistAfterLogin(driver);
		wishafterlogin.WhisListIteamDisplayOrNot(driver);

	}

	@Test(description = "Verify  when Clicking on whishlist page Displaying  Matrika Promises text or not")
	public void test_MatrikaPromisesTextDisplayOrNot() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		WishlistAfterLogin wishafterlogin = new WishlistAfterLogin(driver);
		wishafterlogin.MatrikaPromisesTextDisplayOrNot(driver);
	}

	@Test(description = "Verify whether In wishlist page Displaying move cart button")
	public void test_movecartButtonDisplayOrNot() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		WishlistAfterLogin wishafterlogin = new WishlistAfterLogin(driver);
		wishafterlogin.MoveCartButtonDisplayOrNot(driver);
	}

}

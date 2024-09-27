package com.WishCartModuleTest;

import org.testng.annotations.Test;
import com.Base.LaunchBrowser;
import Com.WishModule.WishlistBeforeLogin;

public class WishlistBeforeLoginPageTest extends LaunchBrowser {

	@Test(description = "Verify Weather  when clicking on the  WishlistButton check Login page is displaying or not ")
	public void test_LoginpageTextDisplayOrNot() {
		WishlistBeforeLogin WB = new WishlistBeforeLogin(driver);
		WB.LogintextDisplayOrNot(driver);
	}

	@Test(description = "Verify Weather  when clicking on the  Wishlist  Button check  In Login page  Log in Text is displaying or not")
	public void test_MobilenumberTextDisplayOrNot() {
		WishlistBeforeLogin WB = new WishlistBeforeLogin(driver);
		WB.MobileNumbertextDisplayOrNot(driver);
	}

	@Test(description = "Verify Weather  when clicking on the  Wishlist  Button , check  In Login page Continue Button is displaying or not ")
	public void test_ContinueButtontDisplayOrNot() {
		WishlistBeforeLogin WB = new WishlistBeforeLogin(driver);
		WB.ContinuetextDisplayOrNot(driver);
	}

	@Test(description = "Verify Weather  when clicking on the  Wishlist  Button check  In Login page Sign up Buttonis displaying or not ")
	public void test_SignupButtonDisplayOrNot() {
		WishlistBeforeLogin WB = new WishlistBeforeLogin(driver);
		WB.SignupTextDisplayOrNot(driver);
	}

}

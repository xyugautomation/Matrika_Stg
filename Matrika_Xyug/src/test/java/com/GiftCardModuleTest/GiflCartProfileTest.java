package com.GiftCardModuleTest;

import org.testng.annotations.Test;

import com.Base.LaunchBrowser;

import Com.GiftCartModule.GiflCartProfile;
import Com.LoginModule.LoginPage;

public class GiflCartProfileTest extends LaunchBrowser {

	public static GiflCartProfile GFP;

//Check Account And GiftCartButton is Clickable
	@Test(enabled = false)
	public void GiftCartDetails() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);

		new GiflCartProfile(driver);

		GFP.clickAccountButton();
		GFP.clickGiftCartButton();

	}

	// Verify To navigateToGitCardPage
	@Test(enabled = false)
	public void test_NavigateToGiftCardPage() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);

		GiflCartProfile GFP = new GiflCartProfile(driver);

		GFP.NavigateToGiftCarPage();

	}

	// Verify GiftCart Pop is closed or not.
	@Test
	public void test_GiftCartPopIsClosedOrNot() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		GiflCartProfile GFP = new GiflCartProfile(driver);
		GFP.ClickOnTheGiftCartCloseButton();

	}

	// Verify GiftCart All Text Is display.
	@Test
	public void test_GiftCartPageAllTextIsDisplay() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		GiflCartProfile GFP = new GiflCartProfile(driver);
		GFP.verifyTableHeadersDisplayed();

	}

	// Verify In The Gift Cart Page Product is not display "NO Product Text display"
	@Test
	public void test_NoProductMsgIsDisplayy() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		GiflCartProfile GFP = new GiflCartProfile(driver);
		GFP.VerifyNoProductAvaiable(driver);

	}

}

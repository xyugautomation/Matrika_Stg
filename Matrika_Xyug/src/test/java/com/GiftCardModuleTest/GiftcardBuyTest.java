package com.GiftCardModuleTest;

import org.testng.annotations.Test;

import com.Base.LaunchBrowser;

import Com.GiftCartModule.GiftCardBuy;
import Com.LoginModule.LoginPage;

public class GiftcardBuyTest extends LaunchBrowser {

//	@Test(priority=1)
//	public void test_GiftCard_BuyWithWallet() throws InterruptedException {
//		LoginPage LP = new LoginPage(driver);
//		LP.EnterValidDataLogin(driver);
//		GiftCardBuy GC = new GiftCardBuy(driver);
//		GC.BuyGiftCardWithWallet(driver);
//
//	}

	@Test(priority = 2)
	public void test_GiftCard_BuyWithRazorPay() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		GiftCardBuy GC = new GiftCardBuy(driver);
		GC.BuyGiftcardWithRazorPay(driver);

	}

}

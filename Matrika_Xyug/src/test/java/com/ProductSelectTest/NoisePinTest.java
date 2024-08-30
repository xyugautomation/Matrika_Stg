package com.ProductSelectTest;

import org.testng.annotations.Test;

import Com.Base.LaunchBrowser;
import Com.ProductSelect.NoisePin;
import Com.SignupModule.LoginPage;

public class NoisePinTest extends LaunchBrowser {
//	@Test
//	public void test_BuyTheProductWithRarzorPay() throws InterruptedException {
//		LoginPage LP = new LoginPage(driver);
//		LP.EnterValidDataLogin(driver);
//		NoisePin np = new NoisePin(driver);
//		np.mouseOverAndSelect(driver);
//		np.BuyNowButton(driver);
//		np.Razorpay();
//		np.IFrame(driver);
//		np.OderProduct(driver);
//	
//	}

	
	
//	@Test(priority = 1)
//	public void test_BuyTheProductWithWalletAccount() throws InterruptedException {
//
//		LoginPage LP = new LoginPage(driver);
//		LP.EnterValidDataLogin(driver);
//		NoisePin np = new NoisePin(driver);
//		np.oderwithWalletAccount(driver);
//
//	}
//	
//	@Test(priority = 1)
//	public void test_BuyTheProductWithRazorpay() throws InterruptedException {
//		LoginPage LP = new LoginPage(driver);
//		LP.EnterValidDataLogin(driver);
//		NoisePin np = new NoisePin(driver);
//		np.oderwithRazorPay(driver);
//
//	}
	
//	@Test(priority = 1)
//	public void test_BuyTheProductWithGiftCard() throws InterruptedException {
//
//		LoginPage LP = new LoginPage(driver);
//		LP.EnterValidDataLogin(driver);
//		NoisePin np = new NoisePin(driver);
//
//		np.oderWithWalletWithGiftCard(driver);
//
//	}
//	
	
	@Test(priority = 1)
	public void test_BuyTheProductWithGiftCardAndCoupons() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		NoisePin np = new NoisePin(driver);
		np.oderWithWalletWithGiftCardAndCoupons(driver);

	}
	
	
	
	
	
}

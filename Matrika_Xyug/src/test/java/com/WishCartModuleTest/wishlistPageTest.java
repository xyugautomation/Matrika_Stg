package com.WishCartModuleTest;
import org.testng.annotations.Test;

import com.SignupModuleTest.BaseTest;

import Com.SignupModule.LoginPage;
import Com.WishModule.WishListPage;

public class wishlistPageTest extends  BaseTest  {

	
//	@Test
//	public void test_ProductIsDisplayOrNot() throws InterruptedException {
//		LoginPage LP = new LoginPage(driver);
//		LP.EnterValidDataLogin(driver);
//		WishListPage ws=new WishListPage(driver);
//		ws.wishbtn();
//		ws.isProductAvailable();
//		
//	}
	
	
//	
//	@Test(priority=2)
//	public void test_WishbuttonIsClickable() throws InterruptedException {
//		LoginPage LP = new LoginPage(driver);
//		LP.EnterValidDataLogin(driver);
//		WishListPage ws=new WishListPage(driver);
//		ws.	WishButtonIsClickable();
//		
//	}
//	
//	

	@Test(priority=3)
	public void test_WishbuttonProductIsdisplayOrNot() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		WishListPage ws=new WishListPage(driver);
		//ws.	checkProductDisplayStatus(driver);
		ws.checkProductDisplayStatusyy();
		
	}
	

	

	
}

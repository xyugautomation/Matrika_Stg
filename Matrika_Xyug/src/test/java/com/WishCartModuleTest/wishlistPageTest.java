package com.WishCartModuleTest;

import org.testng.annotations.Test;

import com.SignupModuleTest.BaseTest;

import Com.SignupModule.LoginPage;
import Com.WishModule.WishListPage;

public class wishlistPageTest extends  BaseTest  {

	
	@Test
	public void test_ProductIsDisplayOrNot() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		WishListPage ws=new WishListPage(driver);
		ws.wishbtn();
		ws.isProductAvailable();
		
	}
	
	
	
	
	
	
	
	
	
	
}

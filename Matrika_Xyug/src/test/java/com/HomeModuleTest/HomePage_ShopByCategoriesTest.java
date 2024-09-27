package com.HomeModuleTest;

import org.testng.annotations.Test;

import com.Base.BeforeLoginBase;

import Com.HomeModule.HomePage_ShopByCategories;

public class HomePage_ShopByCategoriesTest extends BeforeLoginBase {

	@Test(priority = 1)
	public void test_NosePinTextIsDisplayOrNot() throws InterruptedException {
		HomePage_ShopByCategories HP = new HomePage_ShopByCategories(driver);
		HP.NosePinTextIsDisplayOrNot(driver);
	}

	@Test(priority = 2)
	public void test_ATMTextIsDisplayOrNot() throws InterruptedException {
		HomePage_ShopByCategories HP = new HomePage_ShopByCategories(driver);
		HP.ATMTextIsDisplayOrNot(driver);
	}

	@Test(priority = 3)
	public void test_MangalasutaramTextIsDisplayOrNot() throws InterruptedException {
		HomePage_ShopByCategories HP = new HomePage_ShopByCategories(driver);
		HP.MangalasutaramTextIsDisplayOrNot(driver);

	}

	@Test(priority = 4)
	public void test_LocketsTextIsDisplayOrNot() throws InterruptedException {
		HomePage_ShopByCategories HP = new HomePage_ShopByCategories(driver);
		HP.LocketsTextIsDisplayOrNot(driver);
	}

	@Test(priority = 5)
	public void test_EarringsTextIsDisplayOrNot() throws InterruptedException {
		HomePage_ShopByCategories HP = new HomePage_ShopByCategories(driver);
		HP.EarringsTextIsDisplayOrNot(driver);

	}

	@Test(priority = 6)
	public void test_HaramTextIsDisplayOrNot() throws InterruptedException {
		HomePage_ShopByCategories HP = new HomePage_ShopByCategories(driver);
		HP.HaramTextIsDisplayOrNot(driver);

	}

	@Test(priority = 7)
	public void test_JhumkaTextIsDisplayOrNot() throws InterruptedException {
		HomePage_ShopByCategories HP = new HomePage_ShopByCategories(driver);
		HP.JhumkaTextIsDisplayOrNot(driver);
	}

	@Test(priority = 8)
	public void test_ViewMoreTextIsDisplayOrNot() throws InterruptedException {
		HomePage_ShopByCategories HP = new HomePage_ShopByCategories(driver);
		HP.ViewMoreTextIsDisplayOrNot(driver);
	}

}

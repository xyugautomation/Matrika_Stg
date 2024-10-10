package com.FilterModuleTest;

import org.testng.annotations.Test;

import com.Base.LaunchBrowser;

import Com.CategoryModule.ankletsPage;
import Com.LoginModule.LoginPage;

public class FilterAnkletsPageTest extends LaunchBrowser {

	@Test(description="Verify whether the category (e.g., Anklets) button is clickable")
	public void test_CategoryButtonIsClickable() throws InterruptedException {
	   
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		ankletsPage ap=new ankletsPage(driver);
		ap.checkAnkletButtonClickable(driver);
		
	}

	@Test(description="Verify whether the Subcategory button is clickable")
	public void test_SubcategoryButtonIsClickable() throws InterruptedException {
	   
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		ankletsPage ap=new ankletsPage(driver);
		ap.checkSubAnkletButtonClickable(driver);
		
	}

//	@Test(description="Verify the Subcategory (product 'eree') is displaying Filters option")
//	public void test_SubcategoryProductEreeDisplaysFilterOption() throws InterruptedException {
//	   
//		LoginPage LP = new LoginPage(driver);
//		LP.EnterValidDataLogin(driver);
//		ankletsPage ap = new ankletsPage(driver);
//		ap.FilterByText(driver);
//		
//	}

	@Test(description="Verify the Subcategory (product 'eree') is not displaying Filter option if no product")
	public void test_SubcategoryProductEreeNotDisplayingFilterIfNoProduct() throws InterruptedException {
	   
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		ankletsPage ap = new ankletsPage(driver);
		ap.FilterByText(driver);

		
	}

	
	
	
	
	
}

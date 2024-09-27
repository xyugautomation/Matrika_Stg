package com.ProductSelectTest;

import org.testng.annotations.Test;

import com.Base.LaunchBrowser;

import Com.SelectCategoryModule.Select11;

public class SelectCatTest extends LaunchBrowser {

	@Test
	public void Test_SelectCheck() throws InterruptedException {

		Select11 select = new Select11(driver);
		select.SearchDropDownButtonisClickable(driver);

	}

	
	
	
	
}

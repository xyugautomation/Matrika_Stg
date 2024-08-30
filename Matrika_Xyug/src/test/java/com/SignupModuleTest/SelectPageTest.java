package com.SignupModuleTest;

import org.testng.annotations.Test;

import Com.Base.LaunchBrowser;
import Com.SelectCategory.Select11;
import Com.SignupModule.LoginPage;

public class SelectPageTest extends LaunchBrowser {

	@Test
	public void Test_SelectCat() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		Select11 selectcat = new Select11(driver);
		// selectcat.SelectOption();
		selectcat.SearchDropDownButtonisClickable(driver);
		selectcat.handleDropdownSelection(driver);

	}

}

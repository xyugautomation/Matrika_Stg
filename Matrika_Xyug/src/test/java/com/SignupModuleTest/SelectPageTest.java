package com.SignupModuleTest;

import org.testng.annotations.Test;

import com.Base.LaunchBrowser;

import Com.LoginModule.LoginPage;
import Com.SelectCategoryModule.Select11;

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

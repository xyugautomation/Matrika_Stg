package com.HomeModuleTest;

import org.testng.annotations.Test;

import com.Base.BeforeLoginBase;

import Com.HomeModule.HomePage_ContactUs;

public class HomePage_ContactUsTest extends BeforeLoginBase {

	@Test(priority=29)

public void test_CallBtnclikable() throws InterruptedException {
	HomePage_ContactUs HP = new HomePage_ContactUs(driver);
HP.callBtn(driver);
	
	
}

	@Test(priority=29)

public void test_whatsappbtnclikable() throws InterruptedException {
	HomePage_ContactUs HP = new HomePage_ContactUs(driver);
HP.whatsAppBtn(driver);
	
	
}
	
	
	
	
	
	
}

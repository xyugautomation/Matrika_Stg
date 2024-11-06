package com.AccountModuleTest;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Base.LaunchBrowser;

import Com.AccountModule.OrderTrackingPage;
import Com.AccountModule.ViewOrderProductsPage;
import Com.AccountModule.myordersPage;
import Com.LoginModule.LoginPage;

public class MyOrdersPageTest extends LaunchBrowser {
	public OrderTrackingPage orderTrackingPage;
	public	ViewOrderProductsPage viewpage ;

	@Test
	public void verifyOrderTrackingStatuses() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		myordersPage MyOderPage = new myordersPage(driver);
		MyOderPage.clickonAccountButton();
		MyOderPage.clickonMyOrders();
		MyOderPage.clickonAccountOrderStatus();
		orderTrackingPage = new OrderTrackingPage();
		List<WebElement> timelineItems = orderTrackingPage.getTimelineItems(driver);
		for (WebElement item : timelineItems) {
			String title = orderTrackingPage.getStatusTitle(item);
			String status = orderTrackingPage.getStatusText(item);
			boolean isCompleted = orderTrackingPage.isStatusCompleted(item);
			System.out.println("Title: " + title);
			System.out.println("Status Text: " + status);
			System.out.println("Is Completed: " + isCompleted);
			if (isCompleted) {
				Assert.assertEquals(status, "Completed", "Status should be 'Completed' for: " + title);
			} else {
				Assert.assertEquals(status, "Pending", "Status should be 'Pending' for: " + title);
			}
		}
		MyOderPage.clickOnclosePop();
		viewpage = new ViewOrderProductsPage();
		viewpage.printAllProductDetails(driver);
		
	}
	
	

	
	
	
	
	
}

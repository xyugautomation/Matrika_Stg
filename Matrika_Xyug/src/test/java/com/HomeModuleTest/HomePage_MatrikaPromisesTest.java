package com.HomeModuleTest;

import org.testng.annotations.Test;

import com.Base.BeforeLoginBase;
import Com.HomeModule.HomePage_MatrikaPromises;

public class HomePage_MatrikaPromisesTest extends BeforeLoginBase {

	@Test(priority = 1)
	public void test_AssuredLifeTimeMaintenance() throws InterruptedException {
		HomePage_MatrikaPromises HP = new HomePage_MatrikaPromises(driver);
		HP.AssuredLifeTimeMaintenance(driver);

	}

	@Test(priority = 2)
	public void Purity24K() throws InterruptedException {
		HomePage_MatrikaPromises HP = new HomePage_MatrikaPromises(driver);
		HP.Purity24K(driver);

	}

	@Test(priority = 3)
	public void EasyExchange() throws InterruptedException {
		HomePage_MatrikaPromises HP = new HomePage_MatrikaPromises(driver);
		HP.EasyExchange(driver);

	}

	@Test(priority = 4)
	public void yourJewelleryisInSured() throws InterruptedException {
		HomePage_MatrikaPromises HP = new HomePage_MatrikaPromises(driver);
		HP.yourJewelleryisInSured(driver);

	}

	@Test(priority = 5)
	public void Days14Return() throws InterruptedException {
		HomePage_MatrikaPromises HP = new HomePage_MatrikaPromises(driver);
		HP.Days14Return(driver);

	}

	@Test(priority = 6)
	public void GuaranteedBuyback() throws InterruptedException {
		HomePage_MatrikaPromises HP = new HomePage_MatrikaPromises(driver);
		HP.GuaranteedBuyback(driver);

	}

	@Test(priority = 7)
	public void completeTransparency() throws InterruptedException {
		HomePage_MatrikaPromises HP = new HomePage_MatrikaPromises(driver);
		HP.completeTransparency(driver);

	}

	@Test(priority = 8)
	public void Security() throws InterruptedException {
		HomePage_MatrikaPromises HP = new HomePage_MatrikaPromises(driver);
		;
		HP.Security(driver);

	}

}

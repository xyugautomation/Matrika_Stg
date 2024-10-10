package com.FilterModuleTest;

import org.testng.annotations.Test;

import com.Base.LaunchBrowser;

import Com.Filter_Module.FilterPage;
import Com.LoginModule.LoginPage;

public class FilterNosePageTest extends LaunchBrowser {
//
//	@Test(description = "Verify whether the category 'Nose Pins' is clickable")
//	public void test_CategoryNosePinsIsClickable() throws InterruptedException {
//		LoginPage LP = new LoginPage(driver);
//		LP.EnterValidDataLogin(driver);
//		FilterPage Fp = new FilterPage(driver);
//		Fp.NosePinClickable();
//
//	}
//
//	@Test(description = "Verify whether the 'Nose Pin' Subcategory button is clickable")
//	public void test_NosePinSubcategoryButtonIsClickable() throws InterruptedException {
//
//		LoginPage LP = new LoginPage(driver);
//		LP.EnterValidDataLogin(driver);
//		FilterPage Fp = new FilterPage(driver);
//		Fp.SubNosePinClickable(driver);
//		
//		
//	}

	@Test(description = "Verify the subcategory products (e.g., 'manual') is displaying Filters option")
	public void test_SubcategoryManualDisplayingFilters() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		FilterPage Fp = new FilterPage(driver);

	}

	@Test(description = "Verify the filter functionality with only 'type' button is clickable")
	public void test_FilterFunctionalityTypeIsClickable() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		FilterPage Fp = new FilterPage(driver);
		Fp.typeFilterDisplay(driver);

	}

	@Test(description = "Verify whether the Gold drop-down button is clickable")
	public void test_GoldDropdownButtonIsClickable() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		FilterPage Fp = new FilterPage(driver);
		Fp.typeFilterGoldDisplayOrNot(driver);

	}

	
	@Test(description = "Verify whether clicking on Gold Drop-down displays Gold (e.g., 'Nosepins')")
	public void test_GoldDropdownDisplaysNosepins() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		FilterPage Fp = new FilterPage(driver);
		Fp.GoldProductDisplay(driver);

	}


	@Test(description = "Verify whether clicking on Silver Drop-down displays Silver (e.g., 'Nosepins')")
	public void test_SilverDropdownDisplaysNosepins() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		FilterPage Fp = new FilterPage(driver);
		Fp.SilverProductDisplay(driver);

	}

	
	
	// 1) Type filter Gold and All Price select
	@Test
	public void test_TypeGoldAndPriceFilterAll() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		FilterPage Fp = new FilterPage(driver);
		Fp.applyFiltersAndCheckProductsGold(driver);

	}

	// 2) Type filter Silver and All Price select
	@Test
	public void test_TypeSilverAndPriceFilterAll() throws InterruptedException {
		// silver filter

		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		FilterPage Fp = new FilterPage(driver);
		Fp.applyFiltersAndCheckProductsSilver(driver);

	}
	
	
	
	//1) Type Gold and select carat 22k
	@Test
	public void test_SelectTypeGoldAndCarat22k() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		FilterPage Fp = new FilterPage(driver);
		Fp.TypeGoldcartButton22k(driver);

	}

	//2) Type Gold and select carat 24k
	@Test
	public void test_SelectTypeGoldAndCarat24k() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		FilterPage Fp = new FilterPage(driver);
		Fp.TypeGoldcartButton24k(driver);

	}

	
	//3) Type silver and select carat 22k
	@Test
	public void test_SelectTypeSilverAndCarat22k() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		FilterPage Fp = new FilterPage(driver);
		Fp.TypeSilvercartButton22k(driver);

	}

	
	//4) Type silver and select carat 24k 
	@Test 
	public void test_SelectTypeSilverAndCarat24k() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		FilterPage Fp = new FilterPage(driver);
		Fp.TypeSilvercartButton24k(driver);

	}

	
	
	
	
	//1) select type Gold and all weight select
	@Test
	public void test_SelectTypeGoldAndSelectAllWeightType() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		FilterPage Fp = new FilterPage(driver);
		Fp.applyFiltersAndCheckProductsWeightGold(driver);

	}

	// 2) select type silver and all weight select
	@Test 
	public void test_SelectTypeSilverAndSelectAllWeightType() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		FilterPage Fp = new FilterPage(driver);
		Fp.applyFiltersAndCheckProductsWeightSilver(driver);
	}

	
	
	
	
	
	
	//1) type Gold carat 22 and all weight select and check product display or not
	@Test(description = "Verify selecting 22 Carats displays the product")
	public void test_SelectGoldAndCarat22kAndSelectAllWeightType() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		FilterPage Fp = new FilterPage(driver);
		Fp.applyFiltersAndCarat22kCheckProductsWeightGold(driver);
	}

	//2) type Gold carat 24 and all weight select and check product display or not
	@Test
	public void test_SelectGoldAndCarat24kAndSelectAllWeightType() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		FilterPage Fp = new FilterPage(driver);
		Fp.applyFiltersAndCarat24kCheckProductsWeightGold(driver);
	}
	//3) type silver carat 22 and all weight select and check product display or not
	@Test
	public void test_CheckTypeSilverAndCarat22kAndAllWeightSelect() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		FilterPage Fp = new FilterPage(driver);
		Fp.applyFiltersAndCarat22kCheckProductsWeightSilver(driver);
	}
	// 4) type silver carat 24 and all weight select and check product display or not
	@Test
	public void test_CheckTypeSilverAndCarat24kAndAllWeightSelect() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		FilterPage Fp = new FilterPage(driver);
		Fp.applyFiltersAndCarat24kCheckProductsWeightSilver(driver);
	}

	
	
	// 1 )Type and carat combination test cases.
	@Test
	public void test_VerifySelectFilterTypeGoldCaratType22k() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		FilterPage Fp = new FilterPage(driver);
		Fp.ClickOnAllFirstFiledGoldAnd22k(driver);
	}

	// 2 )Type and carat combination test cases.
	@Test
	public void test_VerifySelectFilterTypeGoldCaratType24k() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		FilterPage Fp = new FilterPage(driver);
		Fp.ClickOnAllFirstFiledGoldAnd24k(driver);

	}

	// 3 )Type and carat combination test cases.
	@Test
	public void test_VerifySelectFilterTypeSilverCaratType22k() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		FilterPage Fp = new FilterPage(driver);
		Fp.ClickOnAllFirstFiledSilverAnd22k(driver);

	}
	// 4 )Type and carat combination test cases.
	@Test
	public void test_VerifySelectFilterTypeSilverCaratType24k() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.EnterValidDataLogin(driver);
		FilterPage Fp = new FilterPage(driver);
		Fp.ClickOnAllFirstFiledSilverAnd24k(driver);

	}
	
	
	
	@Test(description = "Verify selecting weight '10gm' displays the product")
	public void test_SelectWeight10gmDisplaysProduct() {

	}

	@Test(description = "Verify selecting weight '10gm' does not display the product if not found")
	public void test_SelectWeight10gmDoesNotDisplayProductIfNotFound() {

	}

	@Test(description = "Verify selecting weight '15gm' displays the product")
	public void test_SelectWeight15gmDisplaysProduct() {

	}

	@Test(description = "Verify selecting weight '15gm' does not display the product if not found")
	public void test_SelectWeight15gmDoesNotDisplayProductIfNotFound() {

	}

	@Test(description = "Verify selecting weight '20gm' displays the product")
	public void test_SelectWeight20gmDisplaysProduct() {

	}

	@Test(description = "Verify selecting weight '20gm' does not display the product if not found")
	public void test_SelectWeight20gmDoesNotDisplayProductIfNotFound() {

	}

	@Test(description = "Verify selecting weight '50gm' displays the product")
	public void test_SelectWeight50gmDisplaysProduct() {

	}

	@Test(description = "Verify selecting weight '50gm' does not display the product if not found")
	public void test_SelectWeight50gmDoesNotDisplayProductIfNotFound() {

	}

	@Test(description = "Verify selecting weight '50gm and above' displays the product")
	public void test_SelectWeight50gmAboveDisplaysProduct() {

	}

	@Test(description = "Verify selecting weight '50gm and above' does not display the product if not found")
	public void test_SelectWeight50gmAboveDoesNotDisplayProductIfNotFound() {

	}

	@Test(description = "Verify the filter functionality with combination of any type and any price")
	public void test_FilterFunctionalityCombinationTypeAndPrice() {

	}

	@Test(description = "Verify the filter functionality with combination of any type and any price does not display the product if not found")
	public void test_FilterFunctionalityCombinationTypeAndPriceNotDisplayingProduct() {

	}

	@Test(description = "Verify the filter functionality with combination of any type and any carat")
	public void test_FilterFunctionalityCombinationTypeAndCarat() {

	}

	@Test(description = "Verify the filter functionality with combination of any type and any carat does not display the product if not found")
	public void test_FilterFunctionalityCombinationTypeAndCaratNotDisplayingProduct() {

	}

	@Test(description = "Verify the filter functionality with combination of any type and any weight")
	public void test_FilterFunctionalityCombinationTypeAndWeight() {

	}

	@Test(description = "Verify the filter functionality with combination of any type and any weight does not display the product if not found")
	public void test_FilterFunctionalityCombinationTypeAndWeightNotDisplayingProduct() {

	}

	@Test(description = "Verify the filter functionality with combination of any price and any weight")
	public void test_FilterFunctionalityCombinationPriceAndWeight() {

	}

	@Test(description = "Verify the filter functionality with combination of any price and any weight does not display the product if not found")
	public void test_FilterFunctionalityCombinationPriceAndWeightNotDisplayingProduct() {

	}

	@Test(description = "Verify the filter functionality with combination of any price and any carat")
	public void test_FilterFunctionalityCombinationPriceAndCarat() {

	}

	@Test(description = "Verify the filter functionality with combination of any price and any carat does not display the product if not found")
	public void test_FilterFunctionalityCombinationPriceAndCaratNotDisplayingProduct() {

	}

	@Test(description = "Verify the filter functionality with combination of any weight and any carat")
	public void test_FilterFunctionalityCombinationWeightAndCarat() {

	}

	@Test(description = "Verify the filter functionality with combination of any weight and any carat does not display the product if not found")
	public void test_FilterFunctionalityCombinationWeightAndCaratNotDisplayingProduct() {

	}

}

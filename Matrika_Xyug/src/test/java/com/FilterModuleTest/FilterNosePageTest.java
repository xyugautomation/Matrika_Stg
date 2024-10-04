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
		Fp.ProductDisplay(driver);
		
	}

	@Test(description = "Verify whether clicking on Gold Drop-down does not display Gold (e.g., 'Nosepins') if product not present")
	public void test_GoldDropdownDoesNotDisplayNosepinsIfProductNotPresent() {

		
		
		
		
		
		
		
		
	}

	@Test(description = "Verify whether clicking on Silver Drop-down displays Silver (e.g., 'Nosepins')")
	public void test_SilverDropdownDisplaysNosepins() throws InterruptedException {

		
		FilterPage Fp = new FilterPage(driver);
		Fp.typefilterSilverDisplayOrNot(driver);
		
		
	}

	@Test(description = "Verify whether clicking on Silver Drop-down does not display Silver (e.g., 'Nosepins') if product not present")
	public void test_SilverDropdownDoesNotDisplayNosepinsIfProductNotPresent() {

		
		
		
	}

	@Test(description = "Verify the filter functionality with only 'price' button is clickable")
	public void test_FilterFunctionalityPriceIsClickable() {

		
		
		
	}

	@Test(description = "Verify clicking on the price button displays all Pricing Drop-down options")
	public void test_PriceButtonDisplaysAllDropdownOptions() {

	}

	@Test(description = "Verify selecting price '₹30,000' displays the product")
	public void test_SelectPrice30000DisplaysProduct() {

	}

	@Test(description = "Verify selecting price '₹30,000' does not display the product if not found")
	public void test_SelectPrice30000DoesNotDisplayProductIfNotFound() {

	}

	// Continue similar for other price values: ₹60,000, ₹100,000, ₹150,000, etc.
	@Test(description = "Verify the filter functionality with only 'carat' is clickable")
	public void test_FilterFunctionalityCaratIsClickable() {

	}

	@Test(description = "Verify clicking on the carat button displays drop-down options")
	public void test_CaratButtonDisplaysDropdownOptions() {

	}

	@Test(description = "Verify selecting 22 Carats displays the product")
	public void test_Select22CaratsDisplaysProduct() {

	}

	@Test(description = "Verify selecting 22 Carats does not display the product if not found")
	public void test_Select22CaratsDoesNotDisplayProductIfNotFound() {

	}

	// Continue similar for 24 Carats
	@Test(description = "Verify the filter functionality with only 'weight' is clickable")
	public void test_FilterFunctionalityWeightIsClickable() {

	}

	@Test(description = "Verify clicking on the weight button displays drop-down options")
	public void test_WeightButtonDisplaysDropdownOptions() {

	}

	@Test(description = "Verify selecting 24 Carats displays the product")
	public void test_Select24CaratsDisplaysProduct() {

	}

	@Test(description = "Verify selecting 24 Carats does not display the product if not found")
	public void test_Select24CaratsDoesNotDisplayProductIfNotFound() {

	}

	@Test(description = "Verify selecting weight '5gm' displays the product")
	public void test_SelectWeight5gmDisplaysProduct() {

	}

	@Test(description = "Verify selecting weight '5gm' does not display the product if not found")
	public void test_SelectWeight5gmDoesNotDisplayProductIfNotFound() {

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

package com.HomeModuleTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Base.BeforeLoginBase;

import Com.HomeModule.HomePage;

public class HomePageTest extends BeforeLoginBase {

	@Test(priority = 1)

	public void test_Matrkia_LogoIsDisplay() throws InterruptedException, IOException {

		HomePage HP = new HomePage(driver);

		HP.MatrikaLogo();

	}

	@Test(priority = 2)

	public void test_GoldSikka_LogoIsDisplay() throws InterruptedException, IOException {
		HomePage HP = new HomePage(driver);
		HP.GoldSikkaLogo();

	}

	@Test(priority = 3)

	public void test_AccountButtonIsDisplay() throws InterruptedException {
		HomePage HP = new HomePage(driver);
		HP.AccountButton();

	}

	@Test(priority = 4)

	public void test_WishListButtonIsDisplay() throws InterruptedException {
		HomePage HP = new HomePage(driver);
		HP.WishListButton();

	}

	@Test(priority = 5)

	public void test_carttButtonIsDisplay() throws InterruptedException {
		HomePage HP = new HomePage(driver);
		HP.carttButton();

	}

//	@Test(priority = 15)
//	public void test_NavigationToContactUs() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.contactUsButton(driver);
//	}

//	@Test(priority = 16)
//	public void test_clickNosePins() throws InterruptedException {
//
//		HomePage HP = new HomePage(driver);
//		HP.clickNosePins(driver);
//
//	}
//	
//	
//	
//	@Test(priority = 16)
//	public void test_clickATM() throws InterruptedException {
//
//		HomePage HP = new HomePage(driver);
//		HP.clickATM(driver);
//
//	}
//	
//	
//	
//	@Test(priority = 16)
//	public void test_clickManagalasutram() throws InterruptedException {
//
//		HomePage HP = new HomePage(driver);
//		HP.clickManagalasutram(driver);
//
//	}
//	
//	
//	
//	
//	@Test(priority = 16)
//	public void test_clickLockets() throws InterruptedException {
//
//		HomePage HP = new HomePage(driver);
//		HP.clickLockets(driver);
//
//	}
//	
//	
//	
//	
//	@Test(priority = 16)
//	public void test_clickEarrings() throws InterruptedException {
//
//		HomePage HP = new HomePage(driver);
//		HP.clickEarrings(driver);
//
//	}
//	
//	
//	
//	
//	
//	@Test(priority = 16)
//	public void test_clickHaram() throws InterruptedException {
//
//		HomePage HP = new HomePage(driver);
//		HP.clickHaram(driver);
//
//	}
//	

//	
//	@Test(priority=15)
//	public void test_Gold22KTextIsDisplay() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.Gold22kPricetextDisplayOrNot();
//		
//		
//	}
//	
//	@Test(priority=16)
//public void test_Gold24KTextIsDisplay() throws InterruptedException {
//	HomePage HP = new HomePage(driver);	
//	HP.Gold24kPricetextDisplayOrNot();
//		
//	}
//	@Test(priority=17)
//public void test_SilverTextIsDisplay() throws InterruptedException {
//	HomePage HP = new HomePage(driver);
//	HP.silvertextDisplayOrNot();
//	
//}
//
//	@Test(priority=18)
//	public void test_LiveRateTextIsDisplay() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.LiveRatetextDisplayOrNot();
//		
//		
//	}
//	
//	
//	@Test(priority=19)
//	public void test_MatrikaPromisesTextIsDisplay() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.MatrikaPromisesTexttDisplayOrNot(driver);
//		
//		
//	}
//	
//	@Test(priority = 19)
//	public void test_AssuredLifeTimeMaintenancetextDisplayOrNotIsDisplay() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.AssuredLifeTimeMaintenancetextDisplayOrNot(driver);
//
//	}
//
//	@Test(priority = 20)
//	public void test_Purity24KtextDisplayOrNotIsDisplay() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.Purity24KtextDisplayOrNot(driver);
//
//	}
//
//	@Test(priority = 21)
//	public void test_EasyExchangetextDisplayOrNottextDisplayOrNotIsDisplay() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.EasyExchangetextDisplayOrNot(driver);
//
//	}
//
//	@Test(priority = 22)
//	public void test_yourJewelleryisInSuredtextDisplayOrNotDisplayOrNotIsDisplay() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.yourJewelleryisInSuredtextDisplayOrNot(driver);
//
//	}
//
//	@Test(priority = 23)
//	public void test_Days14ReturntextDisplayOrNottextDisplayOrNotDisplayOrNotIsDisplay() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.Days14ReturntextDisplayOrNot(driver);
//
//	}
//
//	@Test(priority = 24)
//	public void test_GuaranteedBuybacktextDisplayOrNottextDisplayOrNottextDisplayOrNotDisplayOrNotIsDisplay()
//			throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.GuaranteedBuybacktextDisplayOrNot(driver);
//
//	}
//
//	@Test(priority = 25)
//	public void test_completeTransparencytextDisplayOrNotIsDisplay() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.completeTransparencytextDisplayOrNot(driver);
//
//	}
//
//	@Test(priority = 26)
//	public void test_SecuritytextDisplayOrNotDisplayOrNottextDisplayOrNotDisplayOrNotIsDisplay()
//			throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.SecuritytextDisplayOrNot(driver);
//
//	}
//
//	@Test(priority = 27)
//	public void test_TopPicksForYoutextDisplayOrNotOrNotIsDisplay() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.TopPicksForYoutextDisplayOrNot(driver);
//
//	}
//
//	@Test(priority = 28)
//	public void test_SpecialGifttextDisplayOrNot() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.SpecialGifttextDisplayOrNot(driver);
//
//	}
//
//	@Test(priority = 29)
//	public void test_DesirableOrnamentstextDisplayOrNot() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.DesirableOrnamentstextDisplayOrNot(driver);
//
//	}
//
//	@Test(priority = 30)
//	public void test_NewArrialsTextDisplayOrNot() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.NewArrialsTextDisplayOrNot(driver);
//
//	}

//	@Test(priority = 31)
//	public void test_FestiveAndBridesJewelleryTextDisplayOrNot() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.FestiveAndBridesJewelleryTextDisplayOrNot(driver);
//
//	}
//
//	@Test(priority = 32)
//	public void test_DealsOfTheDayTextDisplayOrNot() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.DealsOfTheDayTextDisplayOrNot(driver);
//
//	}
//
//	@Test(priority = 33)
//	public void test_JewelleryWholesaleShopTextDisplayOrNot() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.JewelleryWholesaleShopTextDisplayOrNot(driver);
//
//	}
//
//	@Test(priority = 34)
//	public void test_CorporateOfficeTextDisplayOrNot() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.CorporateOfficeTextDisplayOrNot(driver);
//
//	}

//	@Test(priority = 14)
//	public void test_NavigationToFollowUsFacebook() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.FollowUsFacebookButton(driver);
//
//	}
//
//	@Test(priority = 15)
//	public void test_NavigationToFollowUsInstagram() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.FollowUsInstagramButton(driver);
//
//	}
//
//	@Test(priority = 16)
//	public void test_NavigationToFollowUsYoutube() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.FollowUsYoutubeButton(driver);
//
//	}
//
//	@Test(priority = 17)
//	public void test_NavigationToFollowUsLinked() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.FollowUsLinkedinButton(driver);
//
//	}
//
//	@Test(priority = 18)
//	public void test_NavigationToFollowUsTwitter() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.FollowUsTwitterButton(driver);
//	}
//
//	@Test(priority = 19)
//	public void test_NavigationToFollowUspinterest() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.FollowUspinterestButton(driver);
//	}
//	
//	
//	@Test(priority = 20)
//	public void test_NavigationToXyugTechnologies() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.xyugTechnologies(driver);
//	}
//
//	
//	
//	@Test(priority = 21)
//	public void test_FacebookLogoIsdisplayorNot() throws InterruptedException, IOException {
//		HomePage HP = new HomePage(driver);
//		HP.FacebookLogoisDisplayorNot(driver);
//
//	}
//
//	@Test(priority = 22)
//	public void test_InstragramLogoIsdisplayorNot() throws InterruptedException, IOException {
//		HomePage HP = new HomePage(driver);
//		HP.InstragramLogoisDisplayorNot(driver);
//
//	}
//
//	@Test(priority = 23)
//	public void test_youTubeLogoIsdisplayorNot() throws InterruptedException, IOException {
//		HomePage HP = new HomePage(driver);
//		HP.youTubeLogoisDisplayorNot(driver);
//
//	}
//
//	@Test(priority = 24)
//	public void test_linkedinLogoIsdisplayorNot() throws InterruptedException, IOException {
//		HomePage HP = new HomePage(driver);
//		HP.linkedinLogoisDisplayorNot(driver);
//	}
//
//	@Test(priority = 25)
//	public void test_TwitterLogoIsdisplayorNot() throws InterruptedException, IOException {
//		HomePage HP = new HomePage(driver);
//		HP.TwitterLogoisDisplayorNot(driver);
//	}
//
//	@Test(priority = 26)
//	public void test_pinterestLogoIsdisplayorNot() throws InterruptedException, IOException {
//		HomePage HP = new HomePage(driver);
//		HP.pinterestLogoisDisplayorNot(driver);
//	}
//	
//	@Test(priority = 20)
//	public void test_MatrikaCollectionsText() throws InterruptedException, IOException {
//		
//		HomePage HP = new HomePage(driver);
//		HP.MatrikaCollectionsText(driver);
//		
//		
//	}
//	
//	@Test(priority=21)
//	public void test_NosePinTextIsDisplayOrNot() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.NosePinTextIsDisplayOrNot(driver);
//	}
//
//	@Test(priority=22)
//	public void test_ATMTextIsDisplayOrNot() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.ATMTextIsDisplayOrNot(driver);
//	}
//	@Test(priority=23)
//	public void test_MangalasutaramTextIsDisplayOrNot() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.MangalasutaramTextIsDisplayOrNot(driver);
//		
//	}
//	@Test(priority=24)
//	public void test_LocketsTextIsDisplayOrNot() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		
//		HP.LocketsTextIsDisplayOrNot(driver);
//	}
//	@Test(priority=25)
//	public void test_EarringsTextIsDisplayOrNot() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.EarringsTextIsDisplayOrNot(driver);
//		
//	}
//	@Test(priority=26)
//	public void test_HaramTextIsDisplayOrNot() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.HaramTextIsDisplayOrNot(driver);
//		
//		
//	}
//	@Test(priority=27)
//	public void test_JhumkaTextIsDisplayOrNot() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.JhumkaTextIsDisplayOrNot(driver);
//	}
//	@Test(priority=28)
//	public void test_ViewMoreTextIsDisplayOrNot() throws InterruptedException {
//		HomePage HP = new HomePage(driver);
//		HP.ViewMoreTextIsDisplayOrNot(driver);
//	}
//


}

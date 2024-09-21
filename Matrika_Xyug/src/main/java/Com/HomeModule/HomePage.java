package Com.HomeModule;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	// Home Page above Element
	@FindBy(xpath = "//img[@class='matrika-logo']")
	public WebElement MatrikaLogo;

	@FindBy(xpath = "//img[@class='gold-sikka-logo']")
	public WebElement GoldSikkaLogo;

	@FindBy(xpath = "//p[normalize-space()='Account']")
	public WebElement AccountButton;

	@FindBy(xpath = "//p[normalize-space()='Wishlist']")
	public WebElement WishListButton;

	@FindBy(xpath = "//p[normalize-space()='Cart']")
	public WebElement CartButton;

	@FindBy(xpath = "//span[contains(text(),'X-YUG Technologies')]")
	public WebElement XYUGTechnologies;

	// Matrika Promises Text xpath

	// Live Price text

	@FindBy(xpath = "//p[contains(text(), '22K Gold')]")
	public WebElement Goldprice22k;

	@FindBy(xpath = "//p[contains(text(), '24K Gold')]")
	public WebElement GoldPrice24k;

	@FindBy(xpath = "//p[contains(text(), 'Silver:')]")
	public WebElement sliverprice;

	@FindBy(xpath = "//p[contains(text(), 'Live Rates')]")
	public WebElement LiveRate;

	@FindBy(xpath = "//p[contains(text(), 'Matrika Promises')]")
	public WebElement MatrikaPromises;

	@FindBy(xpath = "//p[normalize-space()='Top Picks For You']")
	public WebElement TopPicksForYoutext;

	@FindBy(xpath = "//p[normalize-space()='A Special Gift']")
	public WebElement SpecialGiftText;

	@FindBy(xpath = "//p[normalize-space()='Desirable Ornaments']")
	public WebElement DesirableOrnamentsText;

	@FindBy(xpath = "//p[normalize-space()='New Arrivals']")
	public WebElement NewArrialsText;

	@FindBy(xpath = "//p[normalize-space()=\"Festive & Brides Jewellery\"]")
	public WebElement FestiveAndBridesJewelleryText;

	@FindBy(xpath = "//p[normalize-space()='Deals Of The Day']")
	public WebElement DealsOfTheDayText;

	@FindBy(xpath = "//p[normalize-space()='Jewellery Wholesale Shop']")
	public WebElement JewelleryWholesaleShopText;

	@FindBy(xpath = "//p[normalize-space()='Corporate Office']")
	public WebElement CorporateOfficeText;

	@FindBy(xpath = "//p[normalize-space()='Matrika Collections']")
	public WebElement MatrikaCollectionsText;

	public HomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void MatrikaCollectionsText(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(3000);
		scrollToElementInCenter(MatrikaCollectionsText, driver);

		Thread.sleep(1000);
		boolean logoofMatrika = MatrikaCollectionsText.isDisplayed();

		if (logoofMatrika == true) {
			System.out.println("MatrikaCollections Text  is present on the Home page..!!");

		} else {

			System.out.println("MatrikaCollections Text is not present on the Home page..!!");

		}

	}

	// Check Matrika Logo is display or not ..!
	public void MatrikaLogo() throws InterruptedException, IOException {
		Thread.sleep(3000);
		boolean logoofMatrika = MatrikaLogo.isDisplayed();

		if (logoofMatrika == true) {
			System.out.println("Matrika logo is present on the Home page..!!");

		} else {

			System.out.println("Matrika logo is not present on the Home page..!!");

		}

		takeElementScreenshot(MatrikaLogo, "MatrikaLogo");

	}

	// Check Matrika Logo is display or not ..!
	public void GoldSikkaLogo() throws InterruptedException, IOException {

		Thread.sleep(3000);
		boolean logoofGoldSikka = GoldSikkaLogo.isDisplayed();

		if (logoofGoldSikka == true) {
			System.out.println("GoldSikka logo is present on the Home page..!!");

		} else {

			System.out.println("Matrika logo is not present on the Home page..!!");

		}

		takeElementScreenshot(GoldSikkaLogo, "GoldSikkaLogo");

	}

	// check AccountButton is display or not..!
	public void AccountButton() throws InterruptedException {
		Thread.sleep(3000);
		boolean accountbutton = AccountButton.isDisplayed();

		if (accountbutton == true) {
			System.out.println("AccountButton is present on the Home page..!!");

		} else {

			System.out.println("AccountButton is not present on the Home page..!!");

		}

	}

	// check WishList Button is display or not..!
	public void WishListButton() throws InterruptedException {
		Thread.sleep(3000);
		boolean wshlistbutton = WishListButton.isDisplayed();

		if (wshlistbutton == true) {
			System.out.println("wshlistbutton is present on the Home page..!!");

		} else {

			System.out.println("wshlistbutton is not present on the Home page..!!");

		}

	}

	// check CartButton is display or not..!
	public void carttButton() throws InterruptedException {
		Thread.sleep(3000);
		boolean cartbutton = CartButton.isDisplayed();

		if (cartbutton == true) {
			System.out.println("CartButton is present on the Home page..!!");

		} else {

			System.out.println("CartButton is not present on the Home page..!!");

		}

	}

	// X-yugTechnologies click
	public void xyugTechnologies(WebDriver driver) throws InterruptedException, AWTException {
		scrollToElementInCenter(XYUGTechnologies, driver);
		Thread.sleep(2000);
		String originalWindow = driver.getWindowHandle();
		XYUGTechnologies.click();
		Thread.sleep(3000);
		Set<String> allWindows = driver.getWindowHandles();
		for (String windowHandle : allWindows) {
			if (!windowHandle.equals(originalWindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://www.xyug.in/";
		if (currentURL.equals(expectedURL)) {
			System.out.println("xyug link opened correctly.");
		} else {
			System.out.println("xyug link did not open correctly.");
		}
		driver.close();
		driver.switchTo().window(originalWindow);

	}

	public void emailBtn() {

	}

	// Below all methods text is display or not..!

	// check Gold22kPrice text is display or not
	public void Gold22kPricetextDisplayOrNot() throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(2000);
		boolean goldprice22k = Goldprice22k.isDisplayed();

		if (goldprice22k == true) {
			System.out.println("GoldPrice22k  text is display");

		} else {

			System.out.println("GoldPrice22k text is not display");
		}

	}

	// check Gold24kPrice text is display or not
	public void Gold24kPricetextDisplayOrNot() throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(2000);

		boolean goldprice24k = GoldPrice24k.isDisplayed();

		if (goldprice24k == true) {
			System.out.println("GoldPrice24k  text is display");

		} else {

			System.out.println("GoldPrice24k text is not display");
		}

	}

	// check Silver text is display or not
	public void silvertextDisplayOrNot() throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(2000);
		boolean goldprice24k = sliverprice.isDisplayed();

		if (goldprice24k == true) {
			System.out.println("Silver  text is display");

		} else {

			System.out.println("Silver text is not display");
		}

	}

	// check live rate text is display or not
	public void LiveRatetextDisplayOrNot() throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(2000);
		boolean liveRateText = LiveRate.isDisplayed();

		if (liveRateText == true) {
			System.out.println("liveRateText is display");

		} else {

			System.out.println("liveRateText is not display");
		}

	}

	// check MatrikaPromises Text is display or not ..!
	public void MatrikaPromisesTexttDisplayOrNot(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(2000);
		scrollToElementInCenter(MatrikaPromises, driver);
		boolean MatrikaPromisesText = MatrikaPromises.isDisplayed();

		if (MatrikaPromisesText == true) {
			System.out.println("MatrikaPromises Text is display");

		} else {

			System.out.println(" MatrikaPromises Text is not display");
		}

	}

	// check TopPicksForYoutext is display or not ..!
	public void TopPicksForYoutextDisplayOrNot(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(2000);
		scrollToElementInCenter(TopPicksForYoutext, driver);
		boolean MatrikaPromisesText = TopPicksForYoutext.isDisplayed();

		if (MatrikaPromisesText == true) {
			System.out.println("TopPicksForYoutext is display");

		} else {

			System.out.println(" TopPicksForYoutext is not display");
		}

	}

	// check SpecialGiftText is display or not ..!
	public void SpecialGifttextDisplayOrNot(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(2000);
		scrollToElementInCenter(SpecialGiftText, driver);
		boolean MatrikaPromisesText = SpecialGiftText.isDisplayed();

		if (MatrikaPromisesText == true) {
			System.out.println("SpecialGift is display");

		} else {

			System.out.println("SpecialGift is not display");
		}

	}

	// check DesirableOrnamentsText is display or not ..!
	public void DesirableOrnamentstextDisplayOrNot(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(2000);
		scrollToElementInCenter(DesirableOrnamentsText, driver);
		boolean MatrikaPromisesText = DesirableOrnamentsText.isDisplayed();

		if (MatrikaPromisesText == true) {
			System.out.println("DesirableOrnaments Text is display");

		} else {

			System.out.println("DesirableOrnaments Text is not display");
		}

	}

	// check NewArrials Text is display or not ..!
	public void NewArrialsTextDisplayOrNot(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(2000);
		scrollToElementInCenter(NewArrialsText, driver);
		boolean MatrikaPromisesText = NewArrialsText.isDisplayed();

		if (MatrikaPromisesText == true) {
			System.out.println("NewArrialsText  is display");

		} else {

			System.out.println("NewArrialsText is not display");
		}

	}

	// check Festive & Brides Jewellery text is display or not..!
	public void FestiveAndBridesJewelleryTextDisplayOrNot(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(2000);
		scrollToElementInCenter(FestiveAndBridesJewelleryText, driver);
		Thread.sleep(1000);

		boolean MatrikaPromisesText = FestiveAndBridesJewelleryText.isDisplayed();

		if (MatrikaPromisesText == true) {
			System.out.println("FestiveAndBridesJewelleryText  is display");

		} else {

			System.out.println("FestiveAndBridesJewelleryText is not display");
		}

	}

	// check Deals of the Day text is display or not..!
	public void DealsOfTheDayTextDisplayOrNot(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(2000);
		scrollToElementInCenter(DealsOfTheDayText, driver);
		boolean MatrikaPromisesText = DealsOfTheDayText.isDisplayed();

		if (MatrikaPromisesText == true) {
			System.out.println("DealsOfTheDayText  is display");

		} else {

			System.out.println("DealsOfTheDayText is not display");
		}

	}

	// check Jewellery Wholesale shop text is display or not ..!!
	public void JewelleryWholesaleShopTextDisplayOrNot(WebDriver driver) throws InterruptedException {

		HomePageLogoMatrika();
		Thread.sleep(2000);
		scrollToElementInCenter(JewelleryWholesaleShopText, driver);
		boolean MatrikaPromisesText = JewelleryWholesaleShopText.isDisplayed();

		if (MatrikaPromisesText == true) {
			System.out.println("JewelleryWholesaleShopText  is display");

		} else {

			System.out.println("JewelleryWholesaleShopText is not display");
		}

	}

	// Check CorporateOfficeText is display or not..!!
	public void CorporateOfficeTextDisplayOrNot(WebDriver driver) throws InterruptedException {

		HomePageLogoMatrika();
		Thread.sleep(2000);
		scrollToElementInCenter(CorporateOfficeText, driver);
		boolean MatrikaPromisesText = CorporateOfficeText.isDisplayed();

		if (MatrikaPromisesText == true) {
			System.out.println("CorporateOfficeText  is display");

		} else {

			System.out.println("CorporateOfficeText is not display");
		}

	}

	// Scroll the page till find the element
	public void scrollToElementInCenter(WebElement element, WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
	}

	// click on the HomePage MatrikaLogo
	public void HomePageLogoMatrika() throws InterruptedException {
		Thread.sleep(1000);
		MatrikaLogo.click();

	}

	// Method to take a screenshot of a specific element
	public void takeElementScreenshot(WebElement element, String name) throws InterruptedException, IOException {
		File file = element.getScreenshotAs(OutputType.FILE);
		String screenshotDir = "C:\\Users\\admin\\git\\Matrika\\Matrika_Xyug\\ScreenShot";

		File directory = new File(screenshotDir);
		if (!directory.exists()) {
			directory.mkdirs();
		}
		File targetFile = new File(screenshotDir + File.separator + name + ".png");
		FileUtils.copyFile(file, targetFile);

		System.out.println("Screenshot saved: " + targetFile.getAbsolutePath());
	}

}

package Com.HomeModule;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

	// contact Us
	@FindBy(xpath = "//p[normalize-space()='Contact Us']")
	public WebElement ContactUsText;

	@FindBy(xpath = "//a[normalize-space()='Call: 040-4013 7575']")
	public WebElement callButton;

	@FindBy(xpath = "(//a[contains(text(),'What’s App: 91600 06724')])[1]")
	public WebElement WhatsApp;

	@FindBy(xpath = "//a[normalize-space()='Email: info@goldsikka.com']")
	public WebElement EmailButton;

	// Follow Us
	@FindBy(xpath = "//a[@href='https://www.facebook.com/matrika.goldsikka']//img[@class='social-icons']")
	public WebElement FacebookButton;

	@FindBy(xpath = "//img[@src='../../../assets/instagram.png']")
	public WebElement instagramButton;

	@FindBy(xpath = "//a[@href='https://www.youtube.com/@matrika_goldsikka']//img[@class='social-icons']")
	public WebElement YoutubeButton;

	@FindBy(xpath = "//a[@href='https://www.linkedin.com/company/goldsikkalimited/']//img[@class='social-icons']")
	public WebElement linkendInButton;

	@FindBy(xpath = "//img[@src='../../../assets/twitter-new-logo.png']")
	public WebElement twitterButton;

	@FindBy(xpath = "//a[@href='https://in.pinterest.com/Matrika_goldsikka/']//img[@class='social-icons']")
	public WebElement printrestButton;

	// Matrika Promises button xpath
	@FindBy(xpath = "(//img[@class='guaranted-img'])[1]")
	public WebElement AssuredLifeTimeMaintenance;

	@FindBy(xpath = "(//img[@class='guaranted-img'])[2]")
	public WebElement Purity24K;

	@FindBy(xpath = "//section//section//div[3]//div[1]//img[1]")
	public WebElement EasyExchange;

	@FindBy(xpath = "//section//section//div[4]//div[1]//img[1]")
	public WebElement yourJewelleryisInSured;

	@FindBy(xpath = "//section//section//div[5]//div[1]//img[1]")
	public WebElement Days14Return;

	@FindBy(xpath = "//section//section//div[6]//div[1]//img[1]")
	public WebElement GuaranteedBuyback;

	@FindBy(xpath = "//section//section//div[7]//div[1]//img[1]")
	public WebElement completeTransparency;

	@FindBy(xpath = "//section//section//div[8]//div[1]//img[1]")
	public WebElement Security;

	@FindBy(xpath = "//span[contains(text(),'X-YUG Technologies')]")
	public WebElement XYUGTechnologies;

	// Matrika Promises Text xpath

	@FindBy(xpath = "//p[@class='assured-life-para']")
	public WebElement AssuredLifeText;

	// Shop By Categories
	@FindBy(xpath = "(//img[@class='w-75 rounded-circle catimg mb-2'])[6]")
	public WebElement NosePin;

	@FindBy(xpath = "(//img[@class='w-75 rounded-circle catimg mb-2'])[7]")
	public WebElement ATM;

	@FindBy(xpath = "(//img[@class='w-75 rounded-circle catimg mb-2'])[8]")
	public WebElement Managalasutram;

	@FindBy(xpath = "(//img[@class='w-75 rounded-circle catimg mb-2'])[9]")
	public WebElement Lockets;

	@FindBy(xpath = "(//img[@class='w-75 rounded-circle catimg mb-2'])[10]")
	public WebElement Earrings;

	@FindBy(xpath = "(//img[@class='w-75 rounded-circle catimg mb-2'])[11]")
	public WebElement Haram;

	@FindBy(xpath = "(//img[@class='w-75 rounded-circle catimg mb-2'])[12]")
	public WebElement Jhumka;

	@FindBy(xpath = "//button[normalize-space()='View all categories']")
	public WebElement ViewMore;

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

	// Matrika Promises text xpath
	@FindBy(xpath = "//p[@class='assured-para'][normalize-space()='Assured Lifetime Maintenance']")
	public WebElement AssuredLifeTimeMaintenancetext;

	@FindBy(xpath = "//p[@class='assured-para'][normalize-space()='Purity 24k(999 Purity)']")
	public WebElement Purity24Ktext;

	@FindBy(xpath = "//p[@class='assured-para'][normalize-space()='Easy Exchange']")
	public WebElement EasyExchangetext;

	@FindBy(xpath = "//p[@class='assured-para'][normalize-space()='Your Jewellery is Insured']")
	public WebElement yourJewelleryisInSuredtext;

	@FindBy(xpath = "//p[@class='assured-para'][normalize-space()='14 Days Return Policy']")
	public WebElement Days14Returntext;

	@FindBy(xpath = "//p[@class='assured-para'][normalize-space()='Guaranteed Buyback']")
	public WebElement GuaranteedBuybacktext;

	@FindBy(xpath = "//p[@class='assured-para'][normalize-space()='Complete Transparency']")
	public WebElement completeTransparencytext;

	@FindBy(xpath = "//p[@class='assured-para'][normalize-space()='Security']")
	public WebElement Securitytext;

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

	public HomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void MatrikaLogo() throws InterruptedException {
		Thread.sleep(3000);
		boolean logoofMatrika = MatrikaLogo.isDisplayed();

		if (logoofMatrika == true) {
			System.out.println("Matrika logo is present on the Home page..!!");

		} else {

			System.out.println("Matrika logo is not present on the Home page..!!");

		}

	}

	public void GoldSikkaLogo() throws InterruptedException {

		Thread.sleep(3000);
		boolean GoldSikkaLogo = MatrikaLogo.isDisplayed();

		if (GoldSikkaLogo == true) {
			System.out.println("GoldSikka logo is present on the Home page..!!");

		} else {

			System.out.println("Matrika logo is not present on the Home page..!!");

		}

	}

	public void AccountButton() throws InterruptedException {
		Thread.sleep(3000);
		boolean accountbutton = AccountButton.isDisplayed();

		if (accountbutton == true) {
			System.out.println("AccountButton is present on the Home page..!!");

		} else {

			System.out.println("AccountButton is not present on the Home page..!!");

		}

	}

	public void WishListButton() throws InterruptedException {
		Thread.sleep(3000);
		boolean wshlistbutton = WishListButton.isDisplayed();

		if (wshlistbutton == true) {
			System.out.println("wshlistbutton is present on the Home page..!!");

		} else {

			System.out.println("wshlistbutton is not present on the Home page..!!");

		}

	}

	public void carttButton() throws InterruptedException {
		Thread.sleep(3000);
		boolean cartbutton = CartButton.isDisplayed();

		if (cartbutton == true) {
			System.out.println("CartButton is present on the Home page..!!");

		} else {

			System.out.println("CartButton is not present on the Home page..!!");

		}

	}

	public void AssuredLifeTimeMaintenance(WebDriver driver) throws InterruptedException {
		MatrikaLogo.click();
		Thread.sleep(2000);
		scrollToElementInCenter(AssuredLifeTimeMaintenance, driver);
		Thread.sleep(2000);
		AssuredLifeTimeMaintenance.click();

		AssuredLifeText.isDisplayed();

		System.out.println("All context is display..!");

		driver.navigate().back();

	}

	public void Purity24K(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		MatrikaLogo.click();
		Thread.sleep(2000);
		scrollToElementInCenter(Purity24K, driver);
		Thread.sleep(2000);
		Purity24K.click();

		System.out.println("All context is display..!");

		driver.navigate().back();

	}

	public void EasyExchange(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		MatrikaLogo.click();
		Thread.sleep(2000);
		scrollToElementInCenter(EasyExchange, driver);
		Thread.sleep(2000);
		EasyExchange.click();

		System.out.println("All context is display..!");

		driver.navigate().back();

	}

	public void yourJewelleryisInSured(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		MatrikaLogo.click();
		Thread.sleep(2000);
		scrollToElementInCenter(yourJewelleryisInSured, driver);
		Thread.sleep(2000);
		yourJewelleryisInSured.click();

		System.out.println("All context is display..!");

		driver.navigate().back();

	}

	public void Days14Return(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		MatrikaLogo.click();
		Thread.sleep(2000);
		scrollToElementInCenter(Days14Return, driver);
		Thread.sleep(2000);
		Days14Return.click();

		System.out.println("All context is display..!");

		driver.navigate().back();

	}

	public void GuaranteedBuyback(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		MatrikaLogo.click();
		Thread.sleep(2000);
		scrollToElementInCenter(GuaranteedBuyback, driver);
		Thread.sleep(2000);
		GuaranteedBuyback.click();

		System.out.println("All context is display..!");

		driver.navigate().back();

	}

	public void completeTransparency(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		MatrikaLogo.click();
		Thread.sleep(2000);
		scrollToElementInCenter(completeTransparency, driver);
		Thread.sleep(2000);
		completeTransparency.click();

		System.out.println("All context is display..!");

		driver.navigate().back();

	}

	public void Security(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		MatrikaLogo.click();
		Thread.sleep(2000);
		scrollToElementInCenter(Security, driver);
		Thread.sleep(2000);
		Security.click();
		System.out.println("All context is display..!");
		driver.navigate().back();

	}

	public void FollowUsFacebookButton(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		scrollToElementInCenter(FacebookButton, driver);
		Thread.sleep(2000);
		String originalWindow = driver.getWindowHandle();
		FacebookButton.click();
		Thread.sleep(3000);
		Set<String> allWindows = driver.getWindowHandles();
		for (String windowHandle : allWindows) {
			if (!windowHandle.equals(originalWindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://www.facebook.com/matrika.goldsikka";
		if (currentURL.equals(expectedURL)) {
			System.out.println("Facebook link opened correctly.");
		} else {
			System.out.println("Facebook link did not open correctly.");
		}
		driver.close();
		driver.switchTo().window(originalWindow);
	}

	public void FollowUsInstagramButton(WebDriver driver) throws InterruptedException {
		scrollToElementInCenter(instagramButton, driver);
		Thread.sleep(2000);

		String originalWindow = driver.getWindowHandle();
		instagramButton.click();
		Thread.sleep(3000);
		Set<String> allWindows = driver.getWindowHandles();
		for (String windowHandle : allWindows) {
			if (!windowHandle.equals(originalWindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://www.instagram.com/matrika_goldsikka/";
		if (currentURL.equals(expectedURL)) {
			System.out.println("instagram link opened correctly.");
		} else {
			System.out.println("instagram link did not open correctly.");
		}
		driver.close();
		driver.switchTo().window(originalWindow);
	}

	public void FollowUsYoutubeButton(WebDriver driver) throws InterruptedException {
		scrollToElementInCenter(YoutubeButton, driver);
		Thread.sleep(2000);
		String originalWindow = driver.getWindowHandle();
		YoutubeButton.click();
		Thread.sleep(3000);
		Set<String> allWindows = driver.getWindowHandles();
		for (String windowHandle : allWindows) {
			if (!windowHandle.equals(originalWindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://www.youtube.com/@matrika_goldsikka";
		if (currentURL.equals(expectedURL)) {
			System.out.println("youtube link opened correctly.");
		} else {
			System.out.println("youtube link did not open correctly.");
		}
		driver.close();
		driver.switchTo().window(originalWindow);

	}

	public void FollowUsLinkedinButton(WebDriver driver) throws InterruptedException {
		scrollToElementInCenter(linkendInButton, driver);
		Thread.sleep(2000);

		String originalWindow = driver.getWindowHandle();
		linkendInButton.click();
		Thread.sleep(3000);
		Set<String> allWindows = driver.getWindowHandles();
		for (String windowHandle : allWindows) {
			if (!windowHandle.equals(originalWindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://www.linkedin.com/company/goldsikkalimited/";
		if (currentURL.equals(expectedURL)) {
			System.out.println("linkedin link opened correctly.");
		} else {
			System.out.println("linkedin link did not open correctly.");
		}
		driver.close();
		driver.switchTo().window(originalWindow);

	}

	public void FollowUsTwitterButton(WebDriver driver) throws InterruptedException {
		scrollToElementInCenter(twitterButton, driver);
		Thread.sleep(2000);
		String originalWindow = driver.getWindowHandle();
		twitterButton.click();
		Thread.sleep(3000);
		Set<String> allWindows = driver.getWindowHandles();
		for (String windowHandle : allWindows) {
			if (!windowHandle.equals(originalWindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://twitter.com/i/flow/login?redirect_after_login=%2Fmatrika_gs"; // Replace with the
																									// actual Facebook
																									// link
		if (currentURL.equals(expectedURL)) {
			System.out.println("twitter link opened correctly.");
		} else {
			System.out.println("twitter link did not open correctly.");
		}
		driver.close();
		driver.switchTo().window(originalWindow);

	}

	public void FollowUspinterestButton(WebDriver driver) throws InterruptedException {
		scrollToElementInCenter(printrestButton, driver);
		Thread.sleep(2000);
		String originalWindow = driver.getWindowHandle();
		printrestButton.click();
		Thread.sleep(3000);
		Set<String> allWindows = driver.getWindowHandles();
		for (String windowHandle : allWindows) {
			if (!windowHandle.equals(originalWindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://in.pinterest.com/Matrika_goldsikka/"; // Replace with the actual Facebook link
		if (currentURL.equals(expectedURL)) {
			System.out.println("pinterest link opened correctly.");
		} else {
			System.out.println("pinterest link did not open correctly.");
		}
		driver.close();
		driver.switchTo().window(originalWindow);

	}

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

	// Contact Us
	public void contactUsButton(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		scrollToElementInCenter(ContactUsText, driver);
		ContactUsText.click();

		String currentURL = driver.getCurrentUrl();
		String expectedURL = "http://stg-ecom.goldbox.gold/contact-us";
		if (currentURL.equals(expectedURL)) {
			System.out.println("Contact-us link opened correctly.");
		} else {
			System.out.println("Contact-us link did not open correctly.");
		}

	}

	// ShopByCategories

	public void clickNosePins(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(2000);
		scrollToElementInCenter(NosePin, driver);
		Thread.sleep(2000);
		NosePin.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	public void clickATM(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(2000);
		scrollToElementInCenter(ATM, driver);
		Thread.sleep(2000);

		ATM.click();

		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	public void clickManagalasutram(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(2000);
		scrollToElementInCenter(Managalasutram, driver);
		Thread.sleep(2000);

		Managalasutram.click();

		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	public void clickLockets(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(2000);
		scrollToElementInCenter(Lockets, driver);
		Thread.sleep(2000);

		Lockets.click();

		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);

	}

	public void clickEarrings(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(2000);
		scrollToElementInCenter(Earrings, driver);
		Thread.sleep(2000);

		Earrings.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);

	}

	public void clickHaram(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(2000);
		scrollToElementInCenter(Haram, driver);
		Thread.sleep(2000);
		Haram.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	public void clickJhumka(WebDriver driver) throws InterruptedException {

		HomePageLogoMatrika();
		Thread.sleep(2000);
		scrollToElementInCenter(Jhumka, driver);
		Thread.sleep(2000);
		Jhumka.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	public void clickViewMore(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(2000);
		scrollToElementInCenter(ViewMore, driver);
		Thread.sleep(2000);

		ViewMore.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);

	}

	// Disply or not check methods

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

	public void AssuredLifeTimeMaintenancetextDisplayOrNot(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(2000);
		scrollToElementInCenter(AssuredLifeTimeMaintenancetext, driver);
		boolean MatrikaPromisesText = AssuredLifeTimeMaintenancetext.isDisplayed();

		if (MatrikaPromisesText == true) {
			System.out.println("AssuredLifeTimeMaintenancetext is display");

		} else {

			System.out.println(" AssuredLifeTimeMaintenancetext is not display");
		}

	}

	public void Purity24KtextDisplayOrNot(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(2000);
		scrollToElementInCenter(Purity24Ktext, driver);
		boolean MatrikaPromisesText = Purity24Ktext.isDisplayed();

		if (MatrikaPromisesText == true) {
			System.out.println("Purity24Ktext is display");

		} else {

			System.out.println(" Purity24Ktext is not display");
		}

	}

	public void EasyExchangetextDisplayOrNot(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(2000);
		scrollToElementInCenter(EasyExchangetext, driver);
		boolean MatrikaPromisesText = EasyExchangetext.isDisplayed();

		if (MatrikaPromisesText == true) {
			System.out.println("EasyExchangetext is display");

		} else {

			System.out.println(" EasyExchangetext is not display");
		}

	}

	public void yourJewelleryisInSuredtextDisplayOrNot(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(2000);
		scrollToElementInCenter(yourJewelleryisInSuredtext, driver);
		boolean MatrikaPromisesText = yourJewelleryisInSuredtext.isDisplayed();

		if (MatrikaPromisesText == true) {
			System.out.println("yourJewelleryisInSuredtext is display");

		} else {

			System.out.println(" yourJewelleryisInSuredtext is not display");
		}

	}

	public void Days14ReturntextDisplayOrNot(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(2000);
		scrollToElementInCenter(Days14Returntext, driver);
		boolean MatrikaPromisesText = Days14Returntext.isDisplayed();

		if (MatrikaPromisesText == true) {
			System.out.println("Days14Returntext is display");

		} else {

			System.out.println(" Days14Returntext is not display");
		}

	}

	public void GuaranteedBuybacktextDisplayOrNot(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(2000);
		scrollToElementInCenter(GuaranteedBuybacktext, driver);
		boolean MatrikaPromisesText = GuaranteedBuybacktext.isDisplayed();

		if (MatrikaPromisesText == true) {
			System.out.println("GuaranteedBuybacktext is display");

		} else {

			System.out.println(" GuaranteedBuybacktext is not display");
		}

	}

	public void completeTransparencytextDisplayOrNot(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(2000);
		scrollToElementInCenter(completeTransparencytext, driver);
		boolean MatrikaPromisesText = completeTransparencytext.isDisplayed();

		if (MatrikaPromisesText == true) {
			System.out.println("completeTransparencytext is display");

		} else {

			System.out.println(" completeTransparencytext is not display");
		}

	}

	public void SecuritytextDisplayOrNot(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(2000);
		scrollToElementInCenter(Securitytext, driver);
		boolean MatrikaPromisesText = Securitytext.isDisplayed();

		if (MatrikaPromisesText == true) {
			System.out.println("Securitytext is display");

		} else {

			System.out.println(" Securitytext is not display");
		}

	}

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

	public void scrollToElementInCenter(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
	}

	public void HomePageLogoMatrika() throws InterruptedException {
		Thread.sleep(1000);
		MatrikaLogo.click();

	}

}

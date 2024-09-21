package Com.HomeModule;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_MatrikaPromises {

	@FindBy(xpath = "//img[@class='matrika-logo']")
	public WebElement MatrikaLogo;

	
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
	
		@FindBy(xpath = "//p[@class='assured-life-para']")
		public WebElement AssuredLifeText;
	
	public HomePage_MatrikaPromises(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
	
	
	
	// click on the Matrika Promises AssuredLifeMaintenance
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

		// click on the Matrika Promises Purity
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

		// click on the Matrika Promises EasyExchange
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

		// click on the Matrika Promises Your Jewellery is insured
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

		// click on the Matrika Promises Days14Return
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

		// click on the Matrika Promises GuaranteedBuyBack
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

		// click on the Matrika Promises CompleteTransparency
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

		// click on the Matrika Promises Security
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

	
	
		// 1) Matrika Promises check AssuredLifeTimeMaintenance text is display or
		// not..!
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

		// 2) Matrika Promises check Purity24Ktext is display or not..!
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

		// 3) Matrika Promises check EasyExchange text is display or not..!
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

		// 4) Matrika Promises check yourJewelleryisInSured text is display or not..!
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

		// 5) Matrika Promises check Days14Return text is display or not..!
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

		// 6) Matrika Promises check GuaranteedBuyback text is display or not ..!
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

		// 7) Matrika Promises check completeTransparency text is display or not ..!
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

		// 8) Matrika Promises check Security text is display or not ..!
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

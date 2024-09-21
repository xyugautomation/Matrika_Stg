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

public class HomePage_ShopByCategories {

	// Home Page above Element
	@FindBy(xpath = "//img[@class='matrika-logo']")
	public WebElement MatrikaLogo;

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

	public HomePage_ShopByCategories(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	// Check NosePin Text is display or not
	public void NosePinTextIsDisplayOrNot(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		scrollToElementInCenter(NosePin, driver);
		Thread.sleep(3000);
		boolean logoofprintrest = NosePin.isDisplayed();
		if (logoofprintrest == true) {
			System.out.println("NosePin text is present on the Home page..!!");

		} else {

			System.out.println("NosePin text is not present on the Home page..!!");

		}

	}

	// Check ATM Text is display or not
	public void ATMTextIsDisplayOrNot(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		scrollToElementInCenter(ATM, driver);
		Thread.sleep(3000);
		boolean logoofprintrest = ATM.isDisplayed();
		if (logoofprintrest == true) {
			System.out.println("ATM text is present on the Home page..!!");

		} else {

			System.out.println("ATM text is not present on the Home page..!!");

		}

	}

	// Check Managalasutram Text is display or not
	public void MangalasutaramTextIsDisplayOrNot(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		scrollToElementInCenter(Managalasutram, driver);
		Thread.sleep(3000);
		boolean logoofprintrest = Managalasutram.isDisplayed();
		if (logoofprintrest == true) {
			System.out.println("Managalasutram text is present on the Home page..!!");

		} else {

			System.out.println("Managalasutram text is not present on the Home page..!!");

		}

	}

	// Check Lockets Text is display or not
	public void LocketsTextIsDisplayOrNot(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		scrollToElementInCenter(Lockets, driver);
		Thread.sleep(3000);
		boolean logoofprintrest = Lockets.isDisplayed();
		if (logoofprintrest == true) {
			System.out.println("Lockets text is present on the Home page..!!");

		} else {

			System.out.println("Lockets text is not present on the Home page..!!");

		}

	}

	// Check Earrings Text is display or not
	public void EarringsTextIsDisplayOrNot(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		scrollToElementInCenter(Earrings, driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean logoofprintrest = Earrings.isDisplayed();
		if (logoofprintrest == true) {
			System.out.println("Earrings text is present on the Home page..!!");

		} else {

			System.out.println("Earrings text is not present on the Home page..!!");

		}

	}

	// Check Haram Text is display or not
	public void HaramTextIsDisplayOrNot(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		scrollToElementInCenter(Haram, driver);
		Thread.sleep(3000);
		boolean logoofprintrest = Haram.isDisplayed();
		if (logoofprintrest == true) {
			System.out.println("Haram text is present on the Home page..!!");

		} else {

			System.out.println("Haram text is not present on the Home page..!!");

		}

	}

	// Check Jhumka Text is display or not
	public void JhumkaTextIsDisplayOrNot(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		scrollToElementInCenter(Jhumka, driver);
		Thread.sleep(3000);
		boolean logoofprintrest = Jhumka.isDisplayed();
		if (logoofprintrest == true) {
			System.out.println("Jhumka text is present on the Home page..!!");

		} else {

			System.out.println("Jhumka text is not present on the Home page..!!");

		}

	}

	// Check ViewMore Text is display or not
	public void ViewMoreTextIsDisplayOrNot(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		scrollToElementInCenter(ViewMore, driver);
		Thread.sleep(3000);
		boolean logoofprintrest = ViewMore.isDisplayed();
		if (logoofprintrest == true) {
			System.out.println("ViewMore text is present on the Home page..!!");

		} else {

			System.out.println("ViewMore text is not present on the Home page..!!");

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

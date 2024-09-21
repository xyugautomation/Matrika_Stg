package Com.HomeModule;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_FollowUs {

	@FindBy(xpath = "//img[@class='matrika-logo']")
	public WebElement MatrikaLogo;

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

	public HomePage_FollowUs(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	// click on the FaceBook
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

	// click on the Instagram
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

	// click on the YouTube
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

	// click on the LinkedIn
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

	// click on the Twitter
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

	// click on the Pinterest
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

	

	// Check Facebook logo is display or not
	public void FacebookLogoisDisplayorNot(WebDriver driver) throws InterruptedException, IOException {
		scrollToElementInCenter(FacebookButton, driver);
		Thread.sleep(3000);
		boolean logoofFacebook = FacebookButton.isDisplayed();
		if (logoofFacebook == true) {
			System.out.println("Facebook logo is present on the Home page..!!");

		} else {

			System.out.println("Facebook logo is not present on the Home page..!!");

		}

		takeElementScreenshot(FacebookButton, "FaceBookLogo");

	}

	// Check Instragram logo is display or not
	public void InstragramLogoisDisplayorNot(WebDriver driver) throws InterruptedException, IOException {

		scrollToElementInCenter(instagramButton, driver);
		Thread.sleep(3000);
		boolean logoofinstagram = instagramButton.isDisplayed();
		if (logoofinstagram == true) {
			System.out.println("instagram logo is present on the Home page..!!");

		} else {

			System.out.println("instagram logo is not present on the Home page..!!");

		}

		takeElementScreenshot(instagramButton, "instagramLogo");

	}

	// Check youTube logo is display or not
	public void youTubeLogoisDisplayorNot(WebDriver driver) throws InterruptedException, IOException {
		scrollToElementInCenter(YoutubeButton, driver);
		Thread.sleep(3000);
		boolean logoofYoutube = YoutubeButton.isDisplayed();
		if (logoofYoutube == true) {
			System.out.println("Youtube logo is present on the Home page..!!");

		} else {

			System.out.println("Youtube logo is not present on the Home page..!!");

		}

		takeElementScreenshot(YoutubeButton, "YoutubeLogo");
	}

	// Check linkedin logo is display or not
	public void linkedinLogoisDisplayorNot(WebDriver driver) throws InterruptedException, IOException {
		scrollToElementInCenter(linkendInButton, driver);
		Thread.sleep(3000);
		boolean logooflinkendIn = linkendInButton.isDisplayed();
		if (logooflinkendIn == true) {
			System.out.println("linkendIn logo is present on the Home page..!!");

		} else {

			System.out.println("linkendIn logo is not present on the Home page..!!");

		}

		takeElementScreenshot(linkendInButton, "linkendInLogo");
	}

	// Check Twitter logo is display or not
	public void TwitterLogoisDisplayorNot(WebDriver driver) throws InterruptedException, IOException {
		scrollToElementInCenter(twitterButton, driver);
		Thread.sleep(3000);
		boolean logooftwitter = twitterButton.isDisplayed();
		if (logooftwitter == true) {
			System.out.println("twitter logo is present on the Home page..!!");

		} else {

			System.out.println("twitter logo is not present on the Home page..!!");

		}

		takeElementScreenshot(twitterButton, "twitterLogo");
	}

	// Check pinterest logo is display or not
	public void pinterestLogoisDisplayorNot(WebDriver driver) throws InterruptedException, IOException {

		scrollToElementInCenter(printrestButton, driver);
		Thread.sleep(3000);
		boolean logoofprintrest = printrestButton.isDisplayed();
		if (logoofprintrest == true) {
			System.out.println("printrest logo is present on the Home page..!!");

		} else {

			System.out.println("printrest logo is not present on the Home page..!!");

		}

		takeElementScreenshot(printrestButton, "printrestLogo");
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

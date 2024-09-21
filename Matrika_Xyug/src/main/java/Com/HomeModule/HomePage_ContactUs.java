package Com.HomeModule;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_ContactUs {
	@FindBy(xpath = "//img[@class='matrika-logo']")
	public WebElement MatrikaLogo;

	// contact Us
	@FindBy(xpath = "//p[normalize-space()='Contact Us']")
	public WebElement ContactUsText;

	@FindBy(xpath = "//a[normalize-space()='Call: 040-4013 7575']")
	public WebElement callButton;

	@FindBy(xpath = "(//a[contains(text(),'What’s App: 91600 06724')])[1]")
	public WebElement WhatsApp;

	@FindBy(xpath = "//a[normalize-space()='Email: info@goldsikka.com']")
	public WebElement EmailButton;

	public HomePage_ContactUs(WebDriver driver) {

		PageFactory.initElements(driver, this);

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

	// in the contact Us CallBtn
	public void callBtn(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();
		Thread.sleep(4000);
		scrollToElementInCenter(callButton, driver);
		Thread.sleep(2000);

		callButton.click();
		Thread.sleep(4000);

		Actions action = new Actions(driver);
		Thread.sleep(4000);

		action.sendKeys(Keys.TAB).perform(); // Use multiple TABs if necessary

		action.sendKeys(Keys.ENTER).perform();

//	        Alert alert = driver.switchTo().alert();
//	        String alertText = alert.getText();
//	        System.out.println("Alert text: " + alertText);
		//
//	        String expectedText = "Open Pick an app?";
//	        if (alertText.equals(expectedText)) {
//	            System.out.println("Alert text matches: " + alertText);
//	        } else {
//	            System.out.println("Alert text does not match. Expected: " + expectedText + ", but found: " + alertText);
//	        }
//	        Thread.sleep(2000);
		//
//	        alert.accept();

	}

	public void whatsAppBtn(WebDriver driver) throws InterruptedException {
		HomePageLogoMatrika();

		Thread.sleep(5000);
		scrollToElementInCenter(WhatsApp, driver);
		WhatsApp.click();
		Thread.sleep(2000);
		String originalWindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			if (!windowHandle.equals(originalWindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		String newTabTitle = driver.getTitle();
		System.out.println("New Tab Title: " + newTabTitle);

		String expectedTitle = "api.whatsapp.com";
		if (newTabTitle.equals(expectedTitle)) {
			System.out.println("Title matches: " + newTabTitle);
		} else {
			System.out.println("Title does not match. Expected: " + expectedTitle + ", but found: " + newTabTitle);
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

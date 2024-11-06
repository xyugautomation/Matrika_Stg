package Com.CategoryModule;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ankletsPage {

	@FindBy(xpath = "//h2[normalize-space()='ankets']")
	public WebElement Anklet;

	@FindBy(xpath = "//a[normalize-space()='Anketsssss']")
	public WebElement SubAnklet;

	@FindBy(xpath = "//p[@class='filter-para']")
	public WebElement FilterByText;

	@FindBy(xpath = "//div[@class='ng-star-inserted']//img[@alt='No Product']")
	public WebElement NoProdutFountText;

	public ankletsPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void checkAnkletButtonClickable(WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

			wait.until(ExpectedConditions.elementToBeClickable(Anklet));

			System.out.println("The Anklet button is clickable.");
		} catch (Exception e) {

			System.out.println("The Anklet button is NOT clickable.");
		}

	}

	public void checkSubAnkletButtonClickable(WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			MouseOver(driver, Anklet);
			wait.until(ExpectedConditions.elementToBeClickable(SubAnklet));
			System.out.println("The SubCategoryAnklet button is clickable.");
		} catch (Exception e) {

			System.out.println("The SubCategoryAnklet button is NOT clickable.");
		}

	}

	public void FilterByText(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		MouseOver(driver, Anklet);
		wait.until(ExpectedConditions.elementToBeClickable(SubAnklet)).click();
		wait.until(ExpectedConditions.visibilityOf(FilterByText));
		try {
			Thread.sleep(3000);
			scrollToElement(driver, NoProdutFountText);
			if (NoProdutFountText.isDisplayed()) {
				System.out.println("Product is not found.");
			}
		} catch (Exception e) {
			Thread.sleep(3000);
			if (FilterByText.isDisplayed()) {
				System.out.println("Filter By Text is displayed.");
				takeScreenshot(driver, "FilterByText_Screenshot");
			}
		}
	}

	public void scrollToElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void MouseOver(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		action.moveToElement(element).click();
	}

	public void WaitDriver(WebDriver driver, WebElement element, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element)).click();

	}

	public void WaitDriverTest() {

		try {

		} catch (Exception e) {

		}

	}

	// Method to take a screenshot
	public void takeScreenshot(WebDriver driver, String screenshotName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		try {
			// Define the location to save the screenshot
			FileHandler.copy(source,
					new File("C:\\Users\\admin\\git\\Matrika\\Matrika_Xyug\\ScreenShot" + screenshotName + ".png"));
			System.out.println("Screenshot taken: " + screenshotName);
		} catch (IOException e) {
			System.out.println("Exception while taking screenshot: " + e.getMessage());
		}
	}

}

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

public class NosePinPage {
	

	@FindBy(xpath = "//h2[normalize-space()='NosePin']")
	WebElement nosePin;

	@FindBy(xpath = "//a[normalize-space()='SubNosePin']")
	WebElement subNosePin;
	
	public NosePinPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
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
	
	
	
	// Method to take a screenshot
	public void takeScreenshot(WebDriver driver, String screenshotName) {
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    try {
	        // Define the location to save the screenshot
	        FileHandler.copy(source, new File("C:\\Users\\admin\\git\\Matrika\\Matrika_Xyug\\ScreenShot" + screenshotName + ".png"));
	        System.out.println("Screenshot taken: " + screenshotName);
	    } catch (IOException e) {
	        System.out.println("Exception while taking screenshot: " + e.getMessage());
	    }
	}
	
	
	
	
	
}

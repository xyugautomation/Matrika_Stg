package Com.Filter_Module;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilterPage {

	@FindBy(xpath = "//h2[normalize-space()='NosePin']")
	WebElement nosePin;

	@FindBy(xpath = "//a[normalize-space()='SubNosePin']")
	WebElement subNosePin;

	// WebElements for Filters
	@FindBy(xpath = "(//button[normalize-space()='TYPE'])[1]")
	WebElement typeFilter;

	@FindBy(xpath="//input[@value='Gold']")
	WebElement typeFilterGold;
	
	@FindBy(xpath="//p[normalize-space()='Silver']")
	WebElement typefilterSilver;
	
	
	@FindBy(xpath="(//p[@class='gold-id'])[1]")
	WebElement ProductNameNosePin;
	
	
	@FindBy(xpath = "//button[@id='priceDropdownMenuButton']")
	WebElement priceFilter;

	@FindBy(xpath = "//button[@id='caratDropdownMenuButton']")
	WebElement caratFilter;

	@FindBy(xpath = "//button[@id='weightDropdownMenuButton']")
	WebElement weightFilter;

	@FindBy(xpath = "//button[normalize-space()='Reset Filter']")
	WebElement resetFilter;

	// Product Information
	@FindBy(xpath = "//div[@class='product-name']")
	WebElement productName;

	@FindBy(xpath = "//div[@class='product-price']")
	WebElement productPrice;

	@FindBy(xpath = "//div[@class='product-weight']")
	WebElement productWeight;

	public FilterPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void WaitDriver(WebDriver driver, WebElement element, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element)).click();

	}

	public void MouseOver(WebDriver driver, WebElement element) {

		Actions action = new Actions(driver);
		
		// Move the mouse over the category
		action.moveToElement(element).perform();
		
		action.moveToElement(element).click();

	}

	public boolean isElementClickable(WebElement element) {

		if (element.isDisplayed() && element.isEnabled()) {
			return true;
		} else {
			return false;
		}

	}

	public void clickNosePin(WebDriver driver) {

		WaitDriver(driver, nosePin, 20);

	}

	public void clickSubNosePin(WebDriver driver) {

		MouseOver(driver, subNosePin);

		WaitDriver(driver, subNosePin, 20);
	}

	public void NosePinClickable() throws InterruptedException {
		Thread.sleep(1000);
		if (isElementClickable(nosePin)) {
			System.out.println("The NosePin is clickable.");
		} else {
			System.out.println("The NosePin is not clickable.");
		}
	}


	public void SubNosePinClickable(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		nosePin.click();
		Thread.sleep(2000);
		MouseOver(driver, subNosePin);

		if (isElementClickable(subNosePin)) {
			System.out.println("The SubNosePin is clickable.");
		} else {
			System.out.println("The SubNosePin is not clickable.");
		}
	}
	
	
	
	public void typeFilterDisplay(WebDriver driver) throws InterruptedException {
		nosePin.click();
		Thread.sleep(2000);
		MouseOver(driver, subNosePin);
		Thread.sleep(2000);
		subNosePin.click();
		Thread.sleep(4000);
		boolean typefilter =typeFilter.isDisplayed();
		if(typefilter==true) {
			System.out.println("Type button is display..");
		}else {
			System.out.println("Type button is not display..");
			
		}
		
		
	}
	
	
	
	public void typeFilterGoldDisplayOrNot(WebDriver driver) throws InterruptedException {

		nosePin.click();
		Thread.sleep(2000);
		MouseOver(driver, subNosePin);
		Thread.sleep(2000);
		subNosePin.click();
		Thread.sleep(1000);
		typeFilter.click();
		Thread.sleep(3000);
		if (typeFilterGold.isDisplayed()) {

			System.out.println("Gold button is display..");

		} else {

			System.out.println("Gold button is display..");

		}

	}
	
	
	
	
	
	
	public void typefilterSilverDisplayOrNot(WebDriver driver) throws InterruptedException {

		nosePin.click();
		Thread.sleep(2000);
		MouseOver(driver, subNosePin);
		Thread.sleep(2000);
		subNosePin.click();
		Thread.sleep(1000);
		typeFilter.click();
		Thread.sleep(3000);
		if (typefilterSilver.isDisplayed()) {

			System.out.println("silver button is display..");

		} else {

			System.out.println("silver button is display..");

		}

	}
	
	
	
	
	
	public void ProductDisplay(WebDriver driver) throws InterruptedException {
		nosePin.click();
		Thread.sleep(2000);
		MouseOver(driver, subNosePin);
		Thread.sleep(2000);
		subNosePin.click();
		Thread.sleep(1000);
		typeFilter.click();
		Thread.sleep(3000);
		typeFilterGold.click();

		if (ProductNameNosePin.isDisplayed()) {
			System.out.println("NosePin Product is display..");

		} else {

			System.out.println("NosePin Product is not display..");
		}
		
		
		
		
		
		
		
	}
	
	
	
}

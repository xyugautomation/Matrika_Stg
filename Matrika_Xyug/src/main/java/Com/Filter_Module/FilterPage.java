package Com.Filter_Module;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

	@FindBy(xpath = "//div[@class='ng-star-inserted']//img[@alt='No Product']")
	public WebElement NoProdutFountText;

	// WebElements for Filters
	@FindBy(xpath = "(//button[normalize-space()='TYPE'])[1]")
	WebElement typeFilter;

	@FindBy(xpath = "//input[@value='Gold']")
	WebElement typeFilterGold;

	@FindBy(xpath = "//input[@value='Silver']")
	WebElement typefilterSilver;

	@FindBy(xpath = "(//p[@class='gold-id'])[1]")
	WebElement ProductNameNosePinGold;

	@FindBy(xpath = "(//p[@class='gold-id'])[1]")
	WebElement ProductNameNosePinSilver;

	@FindBy(xpath = "//button[@id='priceDropdownMenuButton']")
	WebElement priceFilter;

	// For input value 30000
	@FindBy(xpath = "//input[@value='30000']")
	public WebElement input30000;

	// For input value 60000
	@FindBy(xpath = "//input[@value='60000']")
	public WebElement input60000;

	// For input value 100000
	@FindBy(xpath = "//input[@value='100000']")
	public WebElement input100000;

	// For input value 150000
	@FindBy(xpath = "//input[@value='150000']")
	public WebElement input150000;

	// For input value 150001
	@FindBy(xpath = "//input[@value='150001']")
	public WebElement input150001;

	@FindBy(xpath = "//button[@id='caratDropdownMenuButton']")
	WebElement caratFilter;

	@FindBy(xpath = "//input[@value='22']")
	public WebElement Cart22k;

	@FindBy(xpath = "//input[@value='24']")
	public WebElement Cart24k;

	@FindBy(xpath = "//button[@id='weightDropdownMenuButton']")
	WebElement weightFilter;

	// For weight value 5
	@FindBy(xpath = "//input[@value='5']")
	public WebElement weight5;

	// For weight value 10
	@FindBy(xpath = "//input[@value='10']")
	public WebElement weight10;

	// For weight value 15
	@FindBy(xpath = "//input[@value='15']")
	public WebElement weight15;

	// For weight value 20
	@FindBy(xpath = "//input[@value='20']")
	public WebElement weight20;

	// For weight value 50
	@FindBy(xpath = "//input[@value='50']")
	public WebElement weight50;

	// For weight value 51
	@FindBy(xpath = "//input[@value='51']")
	public WebElement weight51;

	@FindBy(xpath = "//button[normalize-space()='Reset Filter']")
	WebElement resetFilter;

	public FilterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void ClickOnAllFirstFiledGoldAnd22k(WebDriver driver) throws InterruptedException {
		applyFilters(driver, "Gold", "22k");
	}

	public void ClickOnAllFirstFiledGoldAnd24k(WebDriver driver) throws InterruptedException {
		applyFilters(driver, "Gold", "24k");
	}

	public void ClickOnAllFirstFiledSilverAnd22k(WebDriver driver) throws InterruptedException {
		applyFilters(driver, "Silver", "22k");
	}

	public void ClickOnAllFirstFiledSilverAnd24k(WebDriver driver) throws InterruptedException {
		applyFilters(driver, "Silver", "24k");
	}

	private void applyFilters(WebDriver driver, String metalType, String caratType) throws InterruptedException {
		boolean productAvailable = true;

		NosePinAndSubNosePin(driver);
		Thread.sleep(2000);
		scrollToElement1(driver);
		Thread.sleep(2000);
		if (isProductNotAvailable(driver)) {
			System.out.println("Product is not available.");
			productAvailable = false;
		}

		// Apply metal type filter (Gold/Silver)
		if (metalType.equals("Gold")) {
			ClickOnTypeFilterAndGoldCheckBox();
		} else {
			ClickOnTypeFilterAndSilverCheckBox();
		}
		Thread.sleep(2000);
		// Check product availability after applying metal filter
		if (isProductNotAvailable(driver)) {
			System.out.println("Product is not available after applying " + metalType + " filter.");
			productAvailable = false;
		}
		// Apply price filters and check after each step
		productAvailable = applyPriceFilters(driver) && productAvailable;
		Thread.sleep(2000);
		// Apply carat filter (22k/24k)
		if (caratType.equals("22k")) {
			ClickonTheCarat22k();
		} else {
			ClickonTheCarat24k();
		}
		Thread.sleep(2000);
		// Check product availability after applying carat filter
		if (isProductNotAvailable(driver)) {
			System.out.println("Product is not available after applying carat filter: " + caratType);
			productAvailable = false;
		}
		// Apply weight filters and check after each step
		productAvailable = applyWeightFilters(driver) && productAvailable;
		Thread.sleep(2000);
		// Final check after all filters
		if (productAvailable) {
			System.out.println("Product is displayed.");
		} else {
			System.out.println("Product is still not available after all filters.");
		}
		Thread.sleep(3000);
		ClickOnTheResetButton();
	}

	private boolean applyPriceFilters(WebDriver driver) throws InterruptedException {
		priceFilter.click();
		Thread.sleep(3000);
		input30000.click();
		Thread.sleep(1000);
		if (isProductNotAvailable(driver)) {
			System.out.println("Product is not available after applying price filter: 30,000");
			return false;
		}
		input60000.click();
		Thread.sleep(1000);
		if (isProductNotAvailable(driver)) {
			System.out.println("Product is not available after applying price filter: 60,000");
			return false;
		}
		input100000.click();
		Thread.sleep(1000);
		if (isProductNotAvailable(driver)) {
			System.out.println("Product is not available after applying price filter: 100,000");
			return false;
		}
		input150000.click();
		Thread.sleep(2000);
		if (isProductNotAvailable(driver)) {
			System.out.println("Product is not available after applying price filter: 150,000");
			return false;
		}
		input150001.click();
		Thread.sleep(2000);
		if (isProductNotAvailable(driver)) {
			System.out.println("Product is not available after applying price filter: 150,000");
			return false;
		}

		return true; // Product is available after all price filters
	}

	private boolean applyWeightFilters(WebDriver driver) throws InterruptedException {
		weightFilter.click();
		Thread.sleep(3000);
		weight5.click();
		Thread.sleep(2000);
		if (isProductNotAvailable(driver)) {
			System.out.println("Product is not available after applying weight filter: 5");
			return false;
		}
		weight10.click();
		Thread.sleep(2000);
		if (isProductNotAvailable(driver)) {
			System.out.println("Product is not available after applying weight filter: 10");
			return false;
		}
		weight15.click();
		Thread.sleep(2000);
		if (isProductNotAvailable(driver)) {
			System.out.println("Product is not available after applying weight filter: 15");
			return false;
		}
		weight20.click();
		Thread.sleep(2000);
		if (isProductNotAvailable(driver)) {
			System.out.println("Product is not available after applying weight filter: 20");
			return false;
		}
		weight50.click();
		Thread.sleep(2000);
		if (isProductNotAvailable(driver)) {
			System.out.println("Product is not available after applying weight filter: 50");
			return false;
		}
		weight51.click();
		Thread.sleep(2000);
		if (isProductNotAvailable(driver)) {
			System.out.println("Product is not available after applying weight filter: 51");
			return false;
		}
		return true; // Product is available after all weight filters
	}

	private boolean isProductNotAvailable(WebDriver driver) {
		return !driver.findElements(By.xpath("//div[@class='ng-star-inserted']//img[@alt='No Product']")).isEmpty();
	}

	// Nose pin Clickable or not
	public void NosePinClickable() throws InterruptedException {
		Thread.sleep(1000);
		if (isElementClickable(nosePin)) {
			System.out.println("The NosePin is clickable.");
		} else {
			System.out.println("The NosePin is not clickable.");
		}
	}

	// subNosePin Clickable or not
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

	// TypeFilter Button is display or not
	public void typeFilterDisplay(WebDriver driver) throws InterruptedException {
		NosePinAndSubNosePin(driver);
		boolean typefilter = typeFilter.isDisplayed();
		if (typefilter == true) {
			System.out.println("Type button is display..");
		} else {
			System.out.println("Type button is not display..");
		}
	}

	// TypeFilter Button in Gold CheckBox is display or not
	public void typeFilterGoldDisplayOrNot(WebDriver driver) throws InterruptedException {
		NosePinAndSubNosePin(driver);
		Thread.sleep(1000);
		scrollToElement1(driver);
		typeFilter.click();
		Thread.sleep(3000);
		if (typeFilterGold.isDisplayed()) {
			System.out.println("Gold button is display..");
		} else {
			System.out.println("Gold button is display..");
		}
	}

	// TypeFilter Button in Silver CheckBox is display or not
	public void typefilterSilverDisplayOrNot(WebDriver driver) throws InterruptedException {
		NosePinAndSubNosePin(driver);
		Thread.sleep(1000);
		scrollToElement1(driver);
		Thread.sleep(2000);
		typeFilter.click();
		Thread.sleep(3000);
		if (typefilterSilver.isDisplayed()) {
			System.out.println("silver button is display..");
		} else {
			System.out.println("silver button is display..");
		}
	}

	// verify filter type gold product is display or not
	public void GoldProductDisplay(WebDriver driver) throws InterruptedException {
		NosePinAndSubNosePin(driver);
		Thread.sleep(2000);
		scrollToElement1(driver);
		Thread.sleep(3000);
		if (!driver.findElements(By.xpath("//div[@class='ng-star-inserted']//img[@alt='No Product']")).isEmpty()) {
			scrollToElement1(driver);
			System.out.println("Product is not available.");
			return;
		}
		Thread.sleep(3000);
		if (typeFilter.isDisplayed()) {
			Thread.sleep(2000);
			scrollToElement1(driver);
			Thread.sleep(2000);
			typeFilter.click();
			Thread.sleep(3000);
			typeFilterGold.click();
			Thread.sleep(2000);
			if (ProductNameNosePinGold.isDisplayed()) {
				System.out.println("NosePin Gold Product is displayed.");
			} else {
				System.out.println("NosePin Gold Product is not displayed.");
			}
		} else {
			System.out.println("Type Filter button is not displayed.");
		}
	}

	// verify filter type Silver product is display or not
	public void SilverProductDisplay(WebDriver driver) throws InterruptedException {
		NosePinAndSubNosePin(driver);

		Thread.sleep(3000);
		if (!driver.findElements(By.xpath("//div[@class='ng-star-inserted']//img[@alt='No Product']")).isEmpty()) {
			scrollToElement1(driver);
			System.out.println("Product is not available.");
			return;
		}
		Thread.sleep(3000);
		if (typeFilter.isDisplayed()) {
			typeFilter.click();
			Thread.sleep(3000);
			scrollToElement1(driver, typefilterSilver);
			Thread.sleep(2000);
			typefilterSilver.click();
			Thread.sleep(2000);

			List<WebElement> noProductElements = driver
					.findElements(By.xpath("//div[@class='ng-star-inserted']//img[@alt='No Product']"));

			if (!noProductElements.isEmpty() && noProductElements.get(0).isDisplayed()) {

				System.out.println("NosePin silver Product is not available.");
			} else {

				System.out.println("NosePin silver Product is displayed.");
			}
		} else {
			System.out.println("Type Filter button is not displayed.");
		}
	}

	// Method to apply filters and check for products for gold
	public void applyFiltersAndCheckProductsGold(WebDriver driver) throws InterruptedException {
		NosePinAndSubNosePin(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(typeFilter)).click();
		wait.until(ExpectedConditions.elementToBeClickable(typeFilterGold)).click();
		wait.until(ExpectedConditions.elementToBeClickable(priceFilter)).click();
		checkPriceFilterAndProduct(driver, input30000, "30,000");
		wait.until(ExpectedConditions.elementToBeClickable(priceFilter)).click();
		checkPriceFilterAndProduct(driver, input60000, "60,000");
		wait.until(ExpectedConditions.elementToBeClickable(priceFilter)).click();
		checkPriceFilterAndProduct(driver, input100000, "1,00,000");
		wait.until(ExpectedConditions.elementToBeClickable(priceFilter)).click();
		checkPriceFilterAndProduct(driver, input150000, "1,50,000");
		wait.until(ExpectedConditions.elementToBeClickable(priceFilter)).click();
		checkPriceFilterAndProduct(driver, input150001, "1,50,001");
		ClickOnTheResetButton();
	}

	// Helper method to check product display after selecting a price filter for
	// gold
	public void checkPriceFilterAndProduct(WebDriver driver, WebElement priceElement, String price) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(priceElement)).click();
		try {
			if (ProductNameNosePinGold.isDisplayed()) {
				System.out.println("NosePin Gold Product is displayed for price filter: " + price);
			}
		} catch (Exception e) {
			System.out.println("NosePin Gold Product is not available for price filter: " + price);
		}
		wait.until(ExpectedConditions.elementToBeClickable(priceFilter)).click();
	}

	// Method to apply filters and check for products for Silver
	public void applyFiltersAndCheckProductsSilver(WebDriver driver) throws InterruptedException {
		NosePinAndSubNosePin(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(typeFilter)).click();
		wait.until(ExpectedConditions.elementToBeClickable(typefilterSilver)).click();
		wait.until(ExpectedConditions.elementToBeClickable(priceFilter)).click();
		checkPriceFilterAndProductSilver(driver, input30000, "30,000");
		wait.until(ExpectedConditions.elementToBeClickable(priceFilter)).click();
		checkPriceFilterAndProductSilver(driver, input60000, "60,000");
		wait.until(ExpectedConditions.elementToBeClickable(priceFilter)).click();
		checkPriceFilterAndProductSilver(driver, input100000, "1,00,000");
		wait.until(ExpectedConditions.elementToBeClickable(priceFilter)).click();
		checkPriceFilterAndProductSilver(driver, input150000, "1,50,000");
		wait.until(ExpectedConditions.elementToBeClickable(priceFilter)).click();
		checkPriceFilterAndProductSilver(driver, input150001, "1,50,001");
		ClickOnTheResetButton();
	}

	// Helper method to check product display after selecting a price filter for
	// Silver
	public void checkPriceFilterAndProductSilver(WebDriver driver, WebElement priceElement, String price) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(priceElement)).click();
		try {
			if (ProductNameNosePinGold.isDisplayed()) {
				System.out.println("NosePin silver Product is displayed for price filter: " + price);
			}
		} catch (Exception e) {
			System.out.println("NosePin silver Product is not available for price filter: " + price);
		}
		wait.until(ExpectedConditions.elementToBeClickable(priceFilter)).click();
	}

	// Verify filter Gold click carat 22k checkbx product is display or not
	public void TypeGoldcartButton22k(WebDriver driver) throws InterruptedException {
		NosePinAndSubNosePin(driver);
		Thread.sleep(2000);
		ClickOnTypeFilterAndGoldCheckBox();
		ClickonTheCarat22k();
		Thread.sleep(3000);
		scrollToElement1(driver);
		Thread.sleep(2000);
		try {
			if (ProductNameNosePinGold.isDisplayed()) {
				System.out.println("Type Gold Cart 22k Product is displayed ");
			}
		} catch (Exception e) {
			System.out.println("Type Gold Cart 22k Product is Not displayed");
		}

		ClickOnTheResetButton();
	}

	// Verify filter Gold click carat 24k checkbx product is display or not
	public void TypeGoldcartButton24k(WebDriver driver) throws InterruptedException {
		NosePinAndSubNosePin(driver);
		ClickOnTypeFilterAndGoldCheckBox();
		ClickonTheCarat24k();
		Thread.sleep(3000);
		scrollToElement1(driver);
		Thread.sleep(3000);
		List<WebElement> noProductElements = driver
				.findElements(By.xpath("//div[@class='ng-star-inserted']//img[@alt='No Product']"));

		if (!noProductElements.isEmpty() && noProductElements.get(0).isDisplayed()) {

			System.out.println("Type Gold Cart 24k Product is displayed");
		} else {

			System.out.println("Type Gold Cart 24k Product is Not displayed");
		}

		ClickOnTheResetButton();
	}

	// Verify filter silver click carat 22k checkbx product is display or not
	public void TypeSilvercartButton22k(WebDriver driver) throws InterruptedException {
		NosePinAndSubNosePin(driver);
		Thread.sleep(2000);
		ClickOnTypeFilterAndSilverCheckBox();
		ClickonTheCarat22k();
		Thread.sleep(3000);
		scrollToElement1(driver);
		Thread.sleep(2000);

		List<WebElement> noProductElements = driver
				.findElements(By.xpath("//div[@class='ng-star-inserted']//img[@alt='No Product']"));

		if (!noProductElements.isEmpty() && noProductElements.get(0).isDisplayed()) {

			System.out.println("Type Silver Cart 22k Product is Not displayed");
		} else {

			System.out.println("Type Silver Cart 22k Product is displayed");
		}

		ClickOnTheResetButton();
	}

	// Verify filter silver click carat 24k checkbx product is display or not
	public void TypeSilvercartButton24k(WebDriver driver) throws InterruptedException {
		NosePinAndSubNosePin(driver);
		Thread.sleep(2000);
		ClickOnTypeFilterAndSilverCheckBox();
		ClickonTheCarat24k();
		Thread.sleep(3000);
		scrollToElement1(driver);
		Thread.sleep(3000);
		List<WebElement> noProductElements = driver
				.findElements(By.xpath("//div[@class='ng-star-inserted']//img[@alt='No Product']"));

		if (!noProductElements.isEmpty() && noProductElements.get(0).isDisplayed()) {

			System.out.println("Type Silver Cart 24k Product is Not displayed");
		} else {

			System.out.println("Type Silver Cart 24k Product is displayed");
		}

		ClickOnTheResetButton();
	}

	// Verify filter Gold click on the weight product is display or not
	public void applyFiltersAndCheckProductsWeightGold(WebDriver driver) throws InterruptedException {
		NosePinAndSubNosePin(driver);
		Thread.sleep(3000);
		scrollToElement1(driver);
		ClickOnTypeFilterAndGoldCheckBox();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(weightFilter)).click();
		checkWeightFilterAndProductGold(driver, weight5, "5");
		checkWeightFilterAndProductGold(driver, weight10, "10");
		checkWeightFilterAndProductGold(driver, weight15, "15");
		checkWeightFilterAndProductGold(driver, weight20, "20");
		checkWeightFilterAndProductGold(driver, weight50, "50");
		checkWeightFilterAndProductGold(driver, weight51, "51");
		ClickOnTheResetButton();
	}

	// Verify filter Silver click on the weight product is display or not
	public void applyFiltersAndCheckProductsWeightSilver(WebDriver driver) throws InterruptedException {
		NosePinAndSubNosePin(driver);
		Thread.sleep(2000);
		scrollToElement1(driver);
		ClickOnTypeFilterAndSilverCheckBox();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(weightFilter)).click();
		checkWeightFilterAndProductSilver(driver, weight5, "5");
		checkWeightFilterAndProductSilver(driver, weight10, "10");
		checkWeightFilterAndProductSilver(driver, weight15, "15");
		checkWeightFilterAndProductSilver(driver, weight20, "20");
		checkWeightFilterAndProductSilver(driver, weight50, "50");
		checkWeightFilterAndProductSilver(driver, weight51, "51");
		ClickOnTheResetButton();

	}

	// Verify filter Gold click carat 22k checkbx and click on the weight product is
	// display or not
	public void applyFiltersAndCarat22kCheckProductsWeightGold(WebDriver driver) throws InterruptedException {
		NosePinAndSubNosePin(driver);
		Thread.sleep(2000);
		scrollToElement1(driver);
		ClickOnTypeFilterAndGoldCheckBox();
		ClickonTheCarat22k();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(weightFilter)).click();
		checkWeightFilterAndProductGold(driver, weight5, "5");
		checkWeightFilterAndProductGold(driver, weight10, "10");
		checkWeightFilterAndProductGold(driver, weight15, "15");
		checkWeightFilterAndProductGold(driver, weight20, "20");
		checkWeightFilterAndProductGold(driver, weight50, "50");
		checkWeightFilterAndProductGold(driver, weight51, "51");
		ClickOnTheResetButton();

	}

	// Verify filter Gold click carat 24k checkbx and click on the weight product is
	// display or not
	public void applyFiltersAndCarat24kCheckProductsWeightGold(WebDriver driver) throws InterruptedException {
		NosePinAndSubNosePin(driver);
		Thread.sleep(2000);
		scrollToElement1(driver);
		ClickOnTypeFilterAndGoldCheckBox();
		ClickonTheCarat24k();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(weightFilter)).click();
		checkWeightFilterAndProductGold(driver, weight5, "5");
		checkWeightFilterAndProductGold(driver, weight10, "10");
		checkWeightFilterAndProductGold(driver, weight15, "15");
		checkWeightFilterAndProductGold(driver, weight20, "20");
		checkWeightFilterAndProductGold(driver, weight50, "50");
		checkWeightFilterAndProductGold(driver, weight51, "51");
		ClickOnTheResetButton();

	}

	// Verify filter Silver click carat 22k checkbx and click on the weight product
	// is display or not
	public void applyFiltersAndCarat22kCheckProductsWeightSilver(WebDriver driver) throws InterruptedException {
		NosePinAndSubNosePin(driver);
		Thread.sleep(2000);
		scrollToElement1(driver);
		ClickOnTypeFilterAndSilverCheckBox();
		ClickonTheCarat22k();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(weightFilter)).click();
		checkWeightFilterAndProductSilver(driver, weight5, "5");
		checkWeightFilterAndProductSilver(driver, weight10, "10");
		checkWeightFilterAndProductSilver(driver, weight15, "15");
		checkWeightFilterAndProductSilver(driver, weight20, "20");
		checkWeightFilterAndProductSilver(driver, weight50, "50");
		checkWeightFilterAndProductSilver(driver, weight51, "51");
		ClickOnTheResetButton();

	}

	// Verify filter Silver click carat 24k checkbx and click on the weight product
	// is display or not
	public void applyFiltersAndCarat24kCheckProductsWeightSilver(WebDriver driver) throws InterruptedException {
		NosePinAndSubNosePin(driver);
		Thread.sleep(2000);
		scrollToElement1(driver);
		ClickOnTypeFilterAndSilverCheckBox();
		ClickonTheCarat24k();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(weightFilter)).click();
		checkWeightFilterAndProductSilver(driver, weight5, "5");
		checkWeightFilterAndProductSilver(driver, weight10, "10");
		checkWeightFilterAndProductSilver(driver, weight15, "15");
		checkWeightFilterAndProductSilver(driver, weight20, "20");
		checkWeightFilterAndProductSilver(driver, weight50, "50");
		checkWeightFilterAndProductSilver(driver, weight51, "51");
		ClickOnTheResetButton();

	}

	// Gold Helper method
	public void checkWeightFilterAndProductGold(WebDriver driver, WebElement weightElement, String weight) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(weightElement)).click();

		try {
			wait.until(ExpectedConditions.visibilityOf(ProductNameNosePinGold));
			if (ProductNameNosePinGold.isDisplayed()) {
				System.out.println("NosePin Gold Product is displayed for weight filter: " + weight);
			}
		} catch (Exception e) {
			System.out.println("NosePin Gold Product is not available for weight filter: " + weight);
		}
	}

	// silver Helper Method
	public void checkWeightFilterAndProductSilver(WebDriver driver, WebElement weightElement, String weight) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(weightElement)).click();

		try {
			wait.until(ExpectedConditions.visibilityOf(ProductNameNosePinGold));
			if (ProductNameNosePinGold.isDisplayed()) {
				System.out.println("NosePin Silver Product is displayed for weight filter: " + weight);
			}
		} catch (Exception e) {
			System.out.println("NosePin Silver Product is not available for weight filter: " + weight);
		}
	}

	// click on the Nose Pin and mouseoverSubNosePin
	public void NosePinAndSubNosePin(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		nosePin.click();
		Thread.sleep(2000);
		MouseOver(driver, subNosePin);
		Thread.sleep(2000);
		subNosePin.click();
		Thread.sleep(3000);
	}

	// ClickOnTypeFilterAndGoldCheckBox
	public void ClickOnTypeFilterAndGoldCheckBox() throws InterruptedException {
		Thread.sleep(2000);
		typeFilter.click();
		Thread.sleep(2000);
		typeFilterGold.click();
		Thread.sleep(2000);
	}

	// ClickOnTypeFilterAndSilverCheckBox
	public void ClickOnTypeFilterAndSilverCheckBox() throws InterruptedException {
		Thread.sleep(2000);
		typeFilter.click();
		Thread.sleep(2000);
		typefilterSilver.click();
		Thread.sleep(2000);
	}

	// Click on the 22k carat
	public void ClickonTheCarat22k() throws InterruptedException {
		Thread.sleep(2000);
		caratFilter.click();
		Thread.sleep(2000);
		Cart22k.click();
		Thread.sleep(1000);
	}

	// Click on the 24k carat
	public void ClickonTheCarat24k() throws InterruptedException {
		Thread.sleep(2000);
		caratFilter.click();
		Thread.sleep(2000);
		Cart24k.click();
		Thread.sleep(1000);
	}

	// Click on the ResetButton
	public void ClickOnTheResetButton() throws InterruptedException {
		Thread.sleep(2000);
		resetFilter.click();
		System.out.println("Click on the ResetButton successfully.");
	}

	public void WaitDriver(WebDriver driver, WebElement element, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element)).click();

	}

	// MouseOver method
	public void MouseOver(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		action.moveToElement(element).click();
	}

	// click method
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

	public void scrollToElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void scrollToElement1(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 300);");
	}

	
	
	public void scrollToElement1(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500);");
	}

}

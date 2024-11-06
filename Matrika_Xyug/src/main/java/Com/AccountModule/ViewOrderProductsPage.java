package Com.AccountModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewOrderProductsPage {

	private WebDriver driver;

	@FindBy(xpath = "//button[normalize-space()='View Order Products']")
	public WebElement ViewOrderProduts;
	
	// Locators for dynamic values
	private By orderIdLocator = By.xpath("//div[@class='gramsdiv' and text()='Order Id:']/following-sibling::div");
	private By dateOfOrderLocator = By
			.xpath("//p[@class='goldpurity' and text()='Date Of Order']/following-sibling::p");
	private By caratLocator = By.xpath("//p[@class='goldpurity' and text()='Carat']/following-sibling::p");
	private By productNameLocator = By.xpath("//p[@class='goldpurity' and text()='Product Name']/following-sibling::p");
	private By weightLocator = By.xpath("//p[@class='goldpurity' and text()='Weight']/following-sibling::p");
	private By sizeLocator = By.xpath("//p[@class='goldpurity' and text()='Size']/following-sibling::p");
	private By productPriceLocator = By
			.xpath("//p[@class='goldpurity' and text()='Product Price']/following-sibling::p");
	private By stonePriceLocator = By.xpath("//p[@class='goldpurity' and text()='Stone Price']/following-sibling::p");
	private By vaPriceLocator = By.xpath("//p[@class='goldpurity' and text()='VA Price']/following-sibling::p");
	private By gstPriceLocator = By.xpath("//p[@class='goldpurity' and text()='GST Price']/following-sibling::p");
	private By totalLocator = By.xpath("//p[@class='price-rate' and text()='Total']/following-sibling::p");

//    // Constructor
//    public ViewOrderProductsPage(WebDriver driver) {
//       
//    }

	// Helper method click on the element
		public void ClickOn( WebDriver driver ,WebElement element) throws InterruptedException {
			Thread.sleep(2000);
			element.click();

		}
	
	
	public void clickonAccountOrderStatus(WebDriver driver) throws InterruptedException {
		ClickOn(driver, ViewOrderProduts);

	}

	
	
	// Method to get Order Id
	public String getOrderId(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(orderIdLocator).getText();
	}

	// Method to get Date of Order
	public String getDateOfOrder(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(dateOfOrderLocator).getText();
	}

	// Method to get Carat
	public String getCarat(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(caratLocator).getText();
	}

	// Method to get Product Name
	public String getProductName(WebDriver driver) {
		return driver.findElement(productNameLocator).getText();
	}

	// Method to get Weight
	public String getWeight(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(weightLocator).getText();
	}

	// Method to get Size
	public String getSize(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(sizeLocator).getText();
	}

	// Method to get Product Price
	public String getProductPrice(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(productPriceLocator).getText();
	}

	// Method to get Stone Price
	public String getStonePrice(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(stonePriceLocator).getText();
	}

	// Method to get VA Price
	public String getVaPrice(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(vaPriceLocator).getText();
	}

	// Method to get GST Price
	public String getGstPrice(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(gstPriceLocator).getText();
	}

	// Method to get Total
	public String getTotal(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(totalLocator).getText();
	}

	
	// Method to retrieve all product details
    public void printAllProductDetails(WebDriver driver) throws InterruptedException {
    	
    	clickonAccountOrderStatus(driver);
        System.out.println("Order Id: " + getOrderId(driver));
        System.out.println("Date Of Order: " + getDateOfOrder(driver));
        System.out.println("Carat: " + getCarat(driver));
        System.out.println("Product Name: " + getProductName(driver));
        System.out.println("Weight: " + getWeight(driver));
        System.out.println("Size: " + getSize(driver));
        System.out.println("Product Price: " + getProductPrice(driver));
        System.out.println("Stone Price: " + getStonePrice(driver));
        System.out.println("VA Price: " + getVaPrice(driver));
        System.out.println("GST Price: " + getGstPrice(driver));
        System.out.println("Total: " + getTotal(driver));
    }
	
	
	
}

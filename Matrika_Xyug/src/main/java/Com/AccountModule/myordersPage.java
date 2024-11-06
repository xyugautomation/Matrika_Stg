package Com.AccountModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myordersPage {

	@FindBy(xpath = "//div[@id='dropdownMenuButton1']")
	public WebElement AccountButton;

	@FindBy(xpath = "//button[normalize-space()='My Orders']")
	public WebElement MyOrders;

	@FindBy(xpath = "//img[@class='mt-3 mb-5']")
	public WebElement NoProductAvailabeText;

	@FindBy(xpath = "//button[normalize-space()='Download Receipt']")
	public WebElement DownloadReceipt;

	@FindBy(xpath="//div[@id='exampleModal']//button[@aria-label='Close']")
	public WebElement closeButton; 
	
	@FindBy(xpath = "//button[normalize-space()='Order Status']")
	public WebElement OrderStatus;

	@FindBy(xpath = "//button[normalize-space()='View Order Products']")
	public WebElement ViewOrderProduts;

	public myordersPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	// Helper method click on the element
	public void ClickOn(WebElement element) throws InterruptedException {
		Thread.sleep(2000);
		element.click();

	}

	public void clickonAccountButton() throws InterruptedException {
		ClickOn(AccountButton);

	}

	public void clickonMyOrders() throws InterruptedException {
		ClickOn(MyOrders);

	}

	public void clickonAccountOrderStatus() throws InterruptedException {
		ClickOn(OrderStatus);

	}

	
	public void clickOnclosePop() throws InterruptedException {
		
		ClickOn(closeButton);
	}
	
	
}

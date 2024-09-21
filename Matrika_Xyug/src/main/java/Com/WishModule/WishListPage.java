package Com.WishModule;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WishListPage {

	@FindBy(xpath = "//div[@class='container-fluid my-connn']//div[2]//div[1]//div[1] | //div[@class='container-fluid my-connn']//div[2]//div[1]//div[1]")
	public WebElement wishlistButton;

	@FindBy(xpath = "(//img[@alt='No Product'])[1] | //body[1]/app-root[1]/app-layout[1]/app-wishlist[1]/div[1]/img[1]")
	public WebElement NoProduct;

	@FindBy(xpath = "//p[contains(text(), 'Wishlist Items')]")
	public WebElement TotalItems;

	@FindBy(xpath = "")
	public WebElement f;

	@FindBy(xpath = "//p[@class='Removeparagraph']")
	public WebElement RemoveButton;

	public WishListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void wishbtn(WebDriver driver) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.visibilityOf(wishlistButton)).click();
	}

	public boolean isProductAvailable() throws InterruptedException {
		try {
			Thread.sleep(5000);

			if (NoProduct.isDisplayed()) {
				System.out.println("No product is available.");
				return false;
			} else {
				System.out.println("Product is available.");
				return true;
			}
		} catch (NoSuchElementException e) {

			System.out.println("Product is available.");
			return true;
		}
	}

	public void WishButtonIsClickable() throws InterruptedException {

		Thread.sleep(3000);
		// Check if the wishlist button is enabled (clickable)
		boolean wishButtonClickable = wishlistButton.isEnabled();

		if (wishButtonClickable) {
			System.out.println("Wishlist button is clickable.");
			// You can add the action to click the button here if needed
			wishlistButton.click();
		} else {
			System.out.println("Wishlist button is not clickable.");
		}

	}

	public void checkProductDisplayStatusyy() throws InterruptedException {
		WishButtonIsClickable();

	}

	
	
	
	
	
	
	
}

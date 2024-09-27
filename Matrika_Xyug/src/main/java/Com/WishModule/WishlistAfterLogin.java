package Com.WishModule;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WishlistAfterLogin {

	@FindBy(xpath = "//p[normalize-space()='Wishlist']")
	public WebElement WishListButton;

	@FindBy(xpath = "//p[contains(@class, 'my-wish') and contains(text(), 'Wishlist Items')]")
	public WebElement WhisListIteam;

	@FindBy(xpath = "//div[@style='text-align: center;']//img[@src='/assets/noProductFound.png' and @alt='No Product' and @width='300']")
	public WebElement NoProductFoundText;

	@FindBy(xpath = "//p[contains(@class, 'Matrika-para') and contains(text(), 'Matrika Promises')]")
	public WebElement MatrikaPromisesText;

	@FindBy(xpath = "//button[normalize-space()='Move to Cart']")
	public WebElement MoveCartButton;

	public WishlistAfterLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void WishButtonClick() throws InterruptedException {
		Thread.sleep(3000);
		WishListButton.click();
	}

	public void WhisListIteamDisplayOrNot(WebDriver driver) throws InterruptedException {
		WishButtonClick();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(WhisListIteam));
		if (WhisListIteam.isDisplayed()) {
			System.out.println("WhisListIteam is display");
		} else {
			System.out.println("WhisListIteam is not display");

		}

	}

	public void MatrikaPromisesTextDisplayOrNot(WebDriver driver) throws InterruptedException {
		WishButtonClick();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(MatrikaPromisesText));
		if (MatrikaPromisesText.isDisplayed()) {
			System.out.println("MatrikaPromisesText is display");
		} else {
			System.out.println("MatrikaPromisesText is not display");

		}
	}

	public void MoveCartButtonDisplayOrNot(WebDriver driver) throws InterruptedException {
		WishButtonClick();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(MoveCartButton));
		if (MoveCartButton.isDisplayed()) {
			System.out.println("MoveCartButton is display");
		} else {
			System.out.println("MoveCartButton is not display");

		}
	}
//check wish list updated or not number 
	public void checkWishlistNumberUpdated() throws InterruptedException {

		String initialWishlistText = WishListButton.getText();
		int initialWishlistNumber = Integer.parseInt(initialWishlistText.trim());

//	        // Step 3: Perform an action (e.g., add an item to the wishlist)
//	        WebElement addItemButton = driver.findElement(By.id("addItemButton")); // Use the correct locator
//	        addItemButton.click();

		// Optionally, add a wait if needed for the wishlist to update
		Thread.sleep(2000); // Use WebDriverWait for a better approach

		// Step 4: Get the updated wishlist number
		String updatedWishlistText = WishListButton.getText();
		int updatedWishlistNumber = Integer.parseInt(updatedWishlistText.trim());

		// Step 5: Compare the numbers and assert
		Assert.assertNotEquals(initialWishlistNumber, updatedWishlistNumber, "Wishlist number was not updated!");
	}

}

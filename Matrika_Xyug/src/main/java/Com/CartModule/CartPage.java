package Com.CartModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	
	@FindBy(xpath="//div[@routerlink='/cart-in']")
	public WebElement cartButton;
	
	
	
	
	
	public CartPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
	
	
	
	
	
	
	
	
}

package Com.CheckOutModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	
	@FindBy(xpath="//h6[normalize-space()='Total Items :']")
	public WebElement TotalTitemtext;
	
	
	@FindBy(xpath="//p[@class='Matrika-para']")
	public WebElement MatrikaPromisesText;
	
	@FindBy(xpath="(//button[@class='btn btn-info'])[1]")
	public WebElement RemoveButton;
	
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete it']")
	public WebElement RemoveButtonyes;
	
	
	@FindBy(xpath="//button[normalize-space()='Cancel']")
	public WebElement RemoveButtoncancel;
	
	
	
	
	public CheckoutPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	
}

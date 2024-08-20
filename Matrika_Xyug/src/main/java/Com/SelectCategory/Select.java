package Com.SelectCategory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select {
	@FindBy(xpath = "//select[@class='search-input ng-untouched ng-pristine ng-valid']")
	public WebElement selectCategory;
	
	@FindBy(xpath="//img[@alt='No Product']")
	public WebElement NoProduct;
	
	
	 
	
	
	public Select(WebDriver driver){
		PageFactory.initElements(driver, this);
		
		
	}
	

	
	public void SelectOption() {
		
		
		
	}
    
    
    
    
	
	public void SearchDropDownButtonisClickable() {

		
		
	
		
		
	}

	public void SearchButtonDisplayingAllDropDowns() {

	}

	public void NosePinDrop_downButtonisClickable() {

	}

	public void NosepinDropdownbuttonisDisplayingalltheimage() {

	}

	public void AtmDrop_downcatergoryisclickable() {

	}

	public void AtmDrop_downcatergoryisclickableandDisplayingtheimage() {

	}

	public void BanglesButtonisclickable() {

	}

	public void BanglesDropdownButtonRubyemeraldisclickableanddisplayingtheimagewhenclicking() {

	}
	
	
}

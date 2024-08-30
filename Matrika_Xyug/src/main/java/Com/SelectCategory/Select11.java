package Com.SelectCategory;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Select11 {
	@FindBy(xpath = "//select[@formcontrolname='selectedCategory']")
	public WebElement selectCategory;
	
	@FindBy(xpath="//img[@alt='No Product']")
	public WebElement NoProduct;
	
	/*Nose Pins
ATM
Mangalasutaram
Earrings
Haram
Jhumka
Bracelets
Rings
Nose
Bangles
	 
	 * 
	 */
	
	
	
	
	
	 
	public Select11(WebDriver driver){
		PageFactory.initElements(driver, this);
		
		
	}
	 // Function to re-locate the dropdown element
    WebElement getDropdown(WebDriver driver) {
        return driver.findElement(By.xpath("//select[@formcontrolname='selectedCategory']"));
    }
   
    
    
	public void SearchDropDownButtonisClickable(WebDriver driver) throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//
//       
//
//        // Iterate through options
//        boolean continueSelection = true;
//        while (continueSelection) {
//            try {
//                // Re-locate the dropdown element
//                WebElement dropdown = getDropdown(driver);
//                Select select = new Select(dropdown);
//
//                // Get all options from the dropdown
//                List<WebElement> allOptions = select.getOptions();
//
//                for (int i = 0; i < allOptions.size(); i++) {
//                    WebElement option = allOptions.get(i);
//                    String category = option.getText(); // Get category name for logging
//
//                    // Check if the option is enabled before selecting
//                    if (option.isEnabled()) {
//                        select.selectByVisibleText(category);
//                        System.out.println("Selected category: " + category);
//
//                        // Wait for any potential dynamic changes
//                        wait.until(ExpectedConditions.stalenessOf(option));
//
//                        // Verify the result of the selection
//                        if (NoProduct.isDisplayed()) {
//                            System.out.println("No products found for category: " + category);
//                        } else {
//                            System.out.println("Products found for category: " + category);
//                        }
//
//                        // Check if the dropdown becomes disabled after selection
//                        if (!dropdown.isEnabled()) {
//                            System.out.println("Dropdown is disabled after selecting category: " + category);
//                            reEnableDropdown(dropdown ,driver);  // Re-enable dropdown if disabled
//                            break; // Break the loop to re-locate dropdown and continue
//                        }
//                    } else {
//                        System.out.println("Category: " + category + " is disabled and cannot be selected.");
//                    }
//                }
//                
//                // Exit loop if all options are processed
//                continueSelection = false;
//
//            } catch (Exception e) {
//                System.out.println("Exception encountered: " + e.getMessage());
//                Thread.sleep(2000); // Wait a bit before retrying
//            }
//        }
//    }
//
//    // Method to re-enable the dropdown using JavaScript
//    private void reEnableDropdown(WebElement dropdown ,WebDriver driver) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].removeAttribute('disabled');", dropdown);
//        System.out.println("Dropdown has been re-enabled.");
//    }

		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        wait.until(ExpectedConditions.visibilityOf(selectCategory));

	        // Create a Select object for the dropdown
	        Select select = new Select(selectCategory);

	        // Get all options from the dropdown
	        List<WebElement> allOptions = select.getOptions();

	        System.out.println("All Category Names:");
	        for (WebElement option : allOptions) {
	            String categoryName = option.getText();
	            System.out.println(categoryName);
	        }
	   
	
	
	
	
	
	
	}

		
		
		
		
		
//		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//	        boolean continueSelection = true;
//
//	        while (continueSelection) {
//	            try {
//	                // Re-locate the dropdown element
//	                WebElement dropdown = driver.findElement(By.xpath("//select[@formcontrolname='selectedCategory']"));
//	                Select select = new Select(dropdown);
//
//	                // Get all options from the dropdown
//	                List<WebElement> allOptions = select.getOptions();
//
//	                for (int i = 0; i < allOptions.size(); i++) {
//	                    WebElement option = allOptions.get(i);
//	                    String category = option.getText(); // Get category name for logging
//
//	                    // Ensure the dropdown is enabled before making a selection
//	                    if (!dropdown.isEnabled()) {
//	                        reEnableDropdown(driver);  // Re-enable the dropdown
//	                    }
//
//	                    // Check if the option is enabled before selecting
//	                    if (option.isEnabled()) {
//	                        select.selectByVisibleText(category);
//	                        System.out.println("Selected category: " + category);
//
//	                        // Wait for any potential dynamic changes
//	                        wait.until(ExpectedConditions.stalenessOf(option));
//
//	                        // Verify the result of the selection
//	                        if (NoProduct.isDisplayed()) {
//	                            System.out.println("No products found for category: " + category);
//	                        } else {
//	                            System.out.println("Products found for category: " + category);
//	                        }
//
//	                        // Check if the dropdown becomes disabled after selection
//	                        if (!dropdown.isEnabled()) {
//	                            System.out.println("Dropdown is disabled after selecting category: " + category);
//	                            reEnableDropdown(driver);  // Re-enable dropdown if disabled
//	                            break; // Break the loop to re-locate dropdown and continue
//	                        }
//	                    } else {
//	                        System.out.println("Category: " + category + " is disabled and cannot be selected.");
//	                    }
//	                }
//
//	                // Exit loop if all options are processed
//	                continueSelection = false;
//
//	            } catch (Exception e) {
//	                System.out.println("Exception encountered: " + e.getMessage());
//	                Thread.sleep(2000); // Wait a bit before retrying
//	            }
//	        }
//}

	   		
		
		
		
  
    


    
    
    
    
    
    
public void handleDropdownSelection(WebDriver driver) throws InterruptedException {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.visibilityOf(selectCategory));

    boolean continueSelection = true;

    while (continueSelection) {
        try {
            // Re-locate the dropdown element
            WebElement dropdown = driver.findElement(By.xpath("//select[@formcontrolname='selectedCategory']"));
            Select select = new Select(dropdown);

            // Get all options from the dropdown
            List<WebElement> allOptions = select.getOptions();

            for (int i = 0; i < allOptions.size(); i++) {
                WebElement option = allOptions.get(i);
                String category = option.getText(); // Get category name for logging

                // Ensure the dropdown is enabled before making a selection
                if (!dropdown.isEnabled()) {
                    reEnableDropdown(driver);  // Re-enable the dropdown
                }

                // Check if the option is enabled before selecting
                if (option.isEnabled()) {
                    // Select the option by visible text
                    select.selectByVisibleText(category);
                    System.out.println("Selected category: " + category);

                    // Wait for any potential dynamic changes
                    wait.until(ExpectedConditions.stalenessOf(option));

                    // Verify the result of the selection
                    if (NoProduct.isDisplayed()) {
                        System.out.println("No products found for category: " + category);
                    } else {
                        System.out.println("Products found for category: " + category);
                    }

                    // Check if the dropdown becomes disabled after selection
                    if (!dropdown.isEnabled()) {
                        System.out.println("Dropdown is disabled after selecting category: " + category);
                        reEnableDropdown(driver);  // Re-enable dropdown if disabled
                        break; // Break the loop to re-locate dropdown and continue
                    }

                    // Re-locate dropdown after each selection to handle dynamic changes
                    dropdown = driver.findElement(By.xpath("//select[@formcontrolname='selectedCategory']"));
                    select = new Select(dropdown);
                    allOptions = select.getOptions();
                } else {
                    System.out.println("Category: " + category + " is disabled and cannot be selected.");
                }
            }

            // Exit loop if all options are processed
            continueSelection = false;

        } catch (Exception e) {
            System.out.println("Exception encountered: " + e.getMessage());
            Thread.sleep(2000); // Wait a bit before retrying
        }
    }









}


    

// Method to re-enable the dropdown using JavaScript
   private void reEnableDropdown(WebDriver driver) {
       JavascriptExecutor js = (JavascriptExecutor) driver;
       WebElement dropdown = driver.findElement(By.xpath("//select[@formcontrolname='selectedCategory']"));
       js.executeScript("arguments[0].removeAttribute('disabled');", dropdown);
       System.out.println("Dropdown has been re-enabled.");
   }   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void enableDropdownWithJS(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].removeAttribute('disabled');", selectCategory);
        System.out.println("Select category dropdown was disabled and is now enabled.");
    }
	
	
	
	
	public void SelectOption() throws InterruptedException {
	    Thread.sleep(2000);
	    Select select = new Select(selectCategory);

	    // Get all options from the dropdown
	    List<WebElement> allOptions = select.getOptions();
	    Thread.sleep(2000);

	    // Iterate through all options
	    for (WebElement option : allOptions) {
	        // Skip disabled options
	        if (!option.isEnabled()) {
	            System.out.println("Skipping disabled option: " + option.getText());
	            continue;
	        }

	        String category = option.getText(); // Get category name for logging/debugging

	        // Select the option
	        select.selectByVisibleText(category);
	        Thread.sleep(2000);

	        // Verify if the product is displayed or not
	        if (NoProduct.isDisplayed()) {
	            System.out.println("No products found for category: " + category);
	        } else {
	            System.out.println("Products found for category: " + category);
	        }
	    }}
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

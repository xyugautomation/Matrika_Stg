package Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebElementUtilities {

	public static void btnclick(WebElement element) {
		element.click();

	}

	public static void enterText(WebElement element, String text) {
		element.sendKeys(text);

	}

	public static String getText(WebElement element) {

		return element.getText();

	}

	public static void clearField(WebElement element) {
		
		element.clear();

	}

	public static void SelectDropDownByText(WebElement dropdown, String visibleText) {

		Select select = new Select(dropdown);
		select.selectByVisibleText(visibleText);

	}

	public static boolean isElementDisplay(WebElement element) {

		return element.isDisplayed();
	}

}

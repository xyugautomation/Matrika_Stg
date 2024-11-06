package Com.AccountModule;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderTrackingPage {


	private By timelineItems = By.cssSelector(".timeline-item");
	private By statusTitle = By.cssSelector("h5");
	private By statusText = By.cssSelector("p.mb-0");
	private By statusIcon = By.cssSelector(".timeline-icon");

	
	public List<WebElement> getTimelineItems(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElements(timelineItems);
	}

	public String getStatusTitle(WebElement timelineItem) throws InterruptedException {
		Thread.sleep(2000);
		return timelineItem.findElement(statusTitle).getText();
	}

	public String getStatusText(WebElement timelineItem) throws InterruptedException {
		Thread.sleep(2000);
		return timelineItem.findElement(statusText).getText();
	}

	public boolean isStatusCompleted(WebElement timelineItem) throws InterruptedException {
		Thread.sleep(2000);
		return timelineItem.findElement(statusIcon).getAttribute("class").contains("completed");
	}

}

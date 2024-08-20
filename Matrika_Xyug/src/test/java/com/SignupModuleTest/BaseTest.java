package com.SignupModuleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
	 protected WebDriver driver;

	    //@BeforeMethod
	    @Test
	    public void setup() {
	        // Initialize the WebDriver (e.g., ChromeDriver)
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://stg-ecom.goldbox.gold/login"); // replace with actual signup URL
	    }

	 
}

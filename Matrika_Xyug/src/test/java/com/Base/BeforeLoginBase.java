package com.Base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class BeforeLoginBase {
	public WebDriver driver;

	@BeforeSuite
	// @Test
	public void setup() throws IOException {
		// Initialize the WebDriver (e.g., ChromeDriver)
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		FileReader fr = new FileReader("./Config//Confi.properties");
		Properties p = new Properties();
		p.load(fr);
		driver.get(p.getProperty("url2"));

	}

}

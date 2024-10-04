package com.Base;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static WebDriver driver;

	@BeforeTest
	public static void SetBrowser() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		FileReader fr = new FileReader("./Config//Confi.properties");
		Properties p = new Properties();
		p.load(fr);
		driver.get(p.getProperty("url1"));

	}
}

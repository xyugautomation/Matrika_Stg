package Com.ExcelHandling;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ExcelSheet {

	XSSFWorkbook jj = new XSSFWorkbook();

	XSSFSheet sheet1 = jj.getSheet("login");

	XSSFCell cell = sheet1.getRow(0).getCell(0);
	
	
	RemoteWebDriver ds;
	
	
	WebDriver d;
	
	
	JavascriptExecutor s;
	
	ChromeDriver ss;
	

}

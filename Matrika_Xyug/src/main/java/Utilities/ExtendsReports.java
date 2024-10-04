package Utilities;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class ExtendsReports {
	public static ExtentSparkReporter extentSparkReporter;
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;

	public static void startReporter() {

		extentSparkReporter = new ExtentSparkReporter(
				System.getProperty("user.dir") + "/test-output/extentReport.html");
		extentReports = new ExtentReports();
		extentReports.attachReporter(extentSparkReporter);

		// configuration items to change the look and feel
		// add content, manage tests etc
		extentSparkReporter.config().setDocumentTitle("Simple Automation Report");
		extentSparkReporter.config().setReportName("Test Report");
		extentSparkReporter.config().setTheme(Theme.STANDARD);
		extentSparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

	}

}

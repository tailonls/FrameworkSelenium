package core;

import static core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTest {

	static ExtentReports extent;
	static ExtentTest logger;
	static WebDriver driver = DriverFactory.getDriver();

	@Rule
	public TestName nomeTeste = new TestName(); // Nome do teste em execução

	@BeforeClass
	public static void setup() throws IOException {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("target/Reports/learn_automation2.html");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		logger = extent.createTest("Teste tailon");

		extent.flush();
	}

	public static void logPass(String log) {
		try {
			String temp = getScreenshot();
			logger.pass(log, MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
			extent.flush();

		} catch (IOException e) {
			logFail("Capture Failed " + e.getMessage());
		}
	}

	public static void logFail(String log) {
		try {
			String temp = getScreenshot();
			logger.pass(log, MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
			extent.flush();

		} catch (IOException e) {
			logFail("Capture Failed " + e.getMessage());
		}
	}

	public static void logInfo(String log) {
		logger.info(log);
		extent.flush();
	}

	public static String getScreenshot() {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String path = System.getProperty("user.dir") + "/Screenshot/" + System.currentTimeMillis() + ".png";
		File destination = new File(path);

		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			logFail("Capture Failed " + e.getMessage());
		}
		return path;
	}

	@AfterClass
	public static void finalizarTestes() throws IOException {
		extent.flush();
		killDriver();
	}
}
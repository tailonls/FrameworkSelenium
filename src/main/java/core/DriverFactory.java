package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	private static WebDriver driver;

	private DriverFactory() {
	}

	public static WebDriver getDriver() {

		if (driver == null) {
			switch (Propriedades.browser) {
			case FIREFOX:
				System.setProperty("webdriver.gecko.driver",
						"C:/GitPush/FrameworkSelenium/src/main/resources/drivers/geckodriver.exe");
				driver = new FirefoxDriver();
				break;

			case CHROME:
				System.setProperty("webdriver.chrome.driver",
						"C:/GitPush/FrameworkSelenium/src/main/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();
				break;

			default:
				System.out.println("Driver para o browser nao enontrado");
				break;
			}
		}
		driver.manage().window().maximize(); // Expandido a janela do navegador
		return driver;
	}

	public static WebDriver killDriver() {

		if (driver != null) {
			driver.quit();
			driver = null;
		}

		return driver;
	}
}
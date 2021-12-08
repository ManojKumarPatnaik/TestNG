package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DriverSetup {

	public static WebDriver driver;

	public static WebDriver getWebDriver() {

		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://webapps.tekstac.com/FormRegistration/EMICalculator.html");
		return driver;
	}
}
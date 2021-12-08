package testNg;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TestEmiCalculator{
	
	public static WebDriver driver;
	public static EmiCalculator emicalc;
	public static String emimsg;
	public static String[] data;
	public static String nametxt;
	@BeforeSuite
	public void setUp() {
		driver = DriverSetup.getWebDriver();
		emicalc = new EmiCalculator(driver);
	}
	
	@BeforeMethod
	public static String[] getExcelData() throws IOException {
		data = ExcelUtils.readExcelData("Sheet1");
		return data;	
	}
	@Test
	public void testValidEmiCalculator() {
		
		emicalc = new EmiCalculator(driver);
		emicalc.setName("John");
		emicalc.setAmount(data[0]);
		emicalc.setYear(data[1]);
		emicalc.setROI(data[2]);
		emicalc.setCalculate();
		emicalc.setAlert();
		String mgs = driver.findElement(By.id("msg")).getText();
		System.out.println(mgs);	
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
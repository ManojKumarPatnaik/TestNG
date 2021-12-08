package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class EmiCalculator {
	
	static WebDriver driver = TestEmiCalculator.driver;
	public EmiCalculator(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void setName(String name) {
		
		driver.findElement(By.id("demo")).click();
		driver.switchTo().alert().sendKeys(name);
		driver.switchTo().alert().accept();
	}
	
	public void setAmount(String amt) {
		driver.findElement(By.id("amount")).sendKeys(amt);
	}
	
	public void setYear (String yrs) {
		driver.findElement(By.id("year")).sendKeys(yrs);
	}
	
	public void setROI (String interest) {
		driver.findElement(By.id("roi")).sendKeys(interest);
	}
	
	public void setCalculate() {
		driver.findElement(By.name("button")).click();
	}
	
	public void setAlert() {
		driver.switchTo().alert().accept();
	}
}
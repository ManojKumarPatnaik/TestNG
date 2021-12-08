package addressBook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SetFormValues {


	public WebDriver driver;

	public SetFormValues(){}

	public SetFormValues(WebDriver driver){
 this.driver = driver;
	}

	public void setNickName(String nickname){

driver.findElement(By.id("nickname")).sendKeys();
	}

	public void setContactName(String contactname){

driver.findElement(By.id("contact")).sendKeys();
	}

	public void setCompany(String company){
 driver.findElement(By.id("company")).sendKeys(company);
 }
	public void setCity(String city){
		 driver.findElement(By.id("city")).sendKeys(city);
	}

	public void setCountry(String country){
		 driver.findElement(By.id("country")).sendKeys(country);
	}

	public void setType(String type){
		driver.findElement(By.id("type")).sendKeys(type);
	}

	public void ClickAddButton(){
		 driver.findElement(By.id("add")).click();
	}
}

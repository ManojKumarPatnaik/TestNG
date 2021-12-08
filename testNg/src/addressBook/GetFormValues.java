package addressBook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetFormValues {

 public WebDriver driver;

 public GetFormValues(){}

public GetFormValues(WebDriver driver){
 this.driver = driver;
 }

 public List<WebElement> getNickName(){
 return driver.findElements(By.xpath("//*[@id='result']//tr[2]/td[1]"));
 }
	

	public String getContactName(){
 return  ((WebElement) driver.findElements(By.xpath("//*[@id='result']//tr[2]/td[2]"))).getText();
	}

	public String getCompany(){
 return
 ((WebElement) driver.findElements(By.xpath("//*[@id='result']//tr[2]/td[3]"))).getText();
	}

	public String getCity(){
  return ((WebElement) driver.findElements(By.xpath("//*[@id='result']//tr[2]/td[4]"))).getText();
	}

	public String getCountry(){
  return ((WebElement) driver.findElements(By.xpath("//*[@id='result']//tr[2]/td[5]"))).getText();
	}

	public String getType(){
  return driver.findElement(By.xpath("//*[@id='result']//tr[2]/td[6]")).getText();
	}
}
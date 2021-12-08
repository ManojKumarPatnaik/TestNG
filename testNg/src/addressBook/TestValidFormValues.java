package addressBook;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners
 public class TestValidFormValues extends DriverSetup{
 public static WebDriver driver;
 static SetFormValues setformValues;
 static GetFormValues getformValues;

 public static List<WebElement> nickNameTxt;
 public static String contactNameTxt;
 public static String companyTxt;
 public static String cityTxt;
 public static String countryTxt;
 public static String typeTxt;

 public static String[] excelValidData = new String[6];

 @BeforeClass
 public void setUp(){
 driver = DriverSetup.getDriver();
 setformValues = new SetFormValues(driver);
 getformValues = new GetFormValues(driver);
 }

 public static String[] getExcelData() throws Exception{
 return ExcelUtils.readExcelData("address_valid");
 }

 @Test
 public void testValidAddressDetails() throws Exception{
 excelValidData = getExcelData();
 setformValues.setNickName(excelValidData[0]);
  setformValues.setContactName(excelValidData[1]);
  setformValues.setCompany(excelValidData[2]);
  setformValues.setCity(excelValidData[3]);
  setformValues.setCountry(excelValidData[4]);
  setformValues.setType(excelValidData[5]);
  setformValues.ClickAddButton(); 
  nickNameTxt = getformValues.getNickName();
  contactNameTxt = getformValues.getContactName();
  companyTxt = getformValues.getCompany();
  cityTxt = getformValues.getCity();
  countryTxt = getformValues.getCountry();
  typeTxt = getformValues.getType();
  Assert.assertEquals(excelValidData[0],nickNameTxt);
  Assert.assertEquals(excelValidData[1],contactNameTxt);
  Assert.assertEquals(excelValidData[2], null);
  Assert.assertEquals(excelValidData[3], null);
  Assert.assertEquals(excelValidData[4], null);
  
  Assert.assertEquals(excelValidData[5],  null);
 }

 @AfterClass
 public void closeBrowser(){
 driver.close();
 }

}
  
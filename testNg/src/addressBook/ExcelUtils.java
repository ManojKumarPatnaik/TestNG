package addressBook;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

 private static XSSFSheet ExcelWSheet;
 private static XSSFWorkbook ExcelWBook;
private static FileInputStream excelFile;
 private static String filePath;

public static String[] readExcelData(String sheetName) throws Exception{
 String[] s = new String[6];
 filePath = "AddressBook//src//AddressBook.xlsx";
 excelFile = new FileInputStream(filePath);
 ExcelWBook = new XSSFWorkbook(excelFile);
 ExcelWSheet = ExcelWBook.getSheet(sheetName);
 for(int i=0;i<6;i++){
 s[i] =
String.valueOf(ExcelWSheet.getRow(0).getCell(i));
 }
 return s;
}
}
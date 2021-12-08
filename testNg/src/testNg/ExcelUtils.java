package testNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static String[] readExcelData(String sheetName) throws IOException {
		String address = "C:\\Users\\manoj\\eclipse-workspace\\New folder\\testNg\\Excel\\Book1.xlsx";
		String[] data = new String[11];
		File file = new File(address);
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet1 = workbook.getSheet(sheetName);
		XSSFRow row = sheet1.getRow(1);
		for (int i = 0; i < 3; i++) {
			XSSFCell cell = row.getCell(i);
			data[i] = String.valueOf(cell.getNumericCellValue());
		}
		return data;
	}
}
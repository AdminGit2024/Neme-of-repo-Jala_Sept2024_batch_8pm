package ApachePoi_ExcelOpration;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class getDataFromExcel {

	@Test
	public void getSingleDataFromExcel() throws IOException {
		FileInputStream path = new FileInputStream("C:\\Users\\OM SAI AM\\eclipse-workspace\\Sept2024_SeleniumBatch\\employeeDetails.xlsx");
	XSSFWorkbook action = new XSSFWorkbook(path);
	XSSFSheet sheetName = action.getSheet("Sheet2");
	
	XSSFRow row = sheetName.getRow(4);
	String getdata = row.getCell(1).getStringCellValue();
	System.out.println(getdata);
	}
}

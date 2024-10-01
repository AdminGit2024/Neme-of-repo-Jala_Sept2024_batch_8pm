package ApachePoi_ExcelOpration;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class GetAllDataFromExcel {

	@Test
	public void fetchAlldata() throws IOException {
		FileInputStream path = new FileInputStream("C:\\Users\\OM SAI AM\\eclipse-workspace\\Sept2024_SeleniumBatch\\employeeDetails.xlsx");
		XSSFWorkbook action = new XSSFWorkbook(path);
		XSSFSheet sheetName = action.getSheet("Sheet1");
		int rowCount = sheetName.getLastRowNum();
		for(int i =0; i<rowCount; i++) {
			XSSFRow row = sheetName.getRow(i);
			short cellCount = row.getLastCellNum();
			for(int j=0; j<cellCount; j++) {
				String getdata = row.getCell(j).toString();
				System.out.print(" "+getdata);
			}System.out.println();
		}
	}
}

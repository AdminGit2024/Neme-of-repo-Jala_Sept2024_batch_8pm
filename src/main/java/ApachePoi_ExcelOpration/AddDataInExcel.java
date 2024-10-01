package ApachePoi_ExcelOpration;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class AddDataInExcel {
	
	@Test
	public void addDataInExcel() throws IOException {
		FileInputStream path = new FileInputStream("C:\\Users\\OM SAI AM\\eclipse-workspace\\Sept2024_SeleniumBatch\\employeeDetails.xlsx");
		XSSFWorkbook action = new XSSFWorkbook(path);
		XSSFSheet sheetName = action.getSheet("Sheet2");
		XSSFRow row = sheetName.createRow(4);
		row.createCell(4).setCellValue("Dipak");
		FileOutputStream save = new FileOutputStream("C:\\Users\\OM SAI AM\\eclipse-workspace\\Sept2024_SeleniumBatch\\employeeDetails.xlsx");
		action.write(save);
	}

}

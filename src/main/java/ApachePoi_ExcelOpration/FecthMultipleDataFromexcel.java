package ApachePoi_ExcelOpration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class FecthMultipleDataFromexcel {

	@Test
	public void getMultilpeData() throws IOException {
		FileInputStream path = new FileInputStream("C:\\Users\\OM SAI AM\\eclipse-workspace\\Sept2024_SeleniumBatch\\employeeDetails.xlsx");
		XSSFWorkbook action = new XSSFWorkbook(path);
		XSSFSheet sheetName = action.getSheet("Sheet1");
		int rowNumber = sheetName.getLastRowNum();
		
		for(int i=0; i<rowNumber;i++) {
			XSSFRow getrow = sheetName.getRow(i);
			
			String getdata = getrow.getCell(0).getStringCellValue();
			System.out.print(getdata);
		}
	}
}

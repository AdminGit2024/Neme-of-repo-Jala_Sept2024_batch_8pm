package ApachePoi_ExcelOpration;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidateLoginCredentialUsingApachePoi {
	WebDriver driver;
	@Test
	public void ValidateLoginPage() throws IOException, InterruptedException {
		FileInputStream path = new FileInputStream("C:\\Users\\OM SAI AM\\eclipse-workspace\\Sept2024_SeleniumBatch\\employeeDetails.xlsx");
		XSSFWorkbook action = new XSSFWorkbook(path);
		XSSFSheet sheetName = action.getSheet("Sheet4");
		
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		int countRowNo = sheetName.getLastRowNum();
		for(int i=1; i<countRowNo;i++) {
			XSSFRow row = sheetName.getRow(i);
//			row.getCell(0).getStringCellValue();
			driver.findElement(By.id("UserName")).sendKeys(row.getCell(0).getStringCellValue());
			driver.findElement(By.name("Password")).sendKeys(row.getCell(1).getStringCellValue());
			driver.findElement(By.id("btnLogin")).click();
			
			Thread.sleep(3000);
			String actual = driver.getTitle();
			System.out.println(actual);
			row.createCell(4).setCellValue(actual);
			String expected = row.getCell(2).getStringCellValue();
			
			if(expected.equals(actual)) {
				row.createCell(4).setCellValue("pass");
			}else {
				row.createCell(4).setCellValue("failed");
			}
			
			
			driver.close();
			Thread.sleep(3000);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://magnus.jalatechnologies.com/");
			
		}
		
		FileOutputStream save = new FileOutputStream("C:\\Users\\OM SAI AM\\eclipse-workspace\\Sept2024_SeleniumBatch\\employeeDetails.xlsx");
		action.write(save);
		
	}
}

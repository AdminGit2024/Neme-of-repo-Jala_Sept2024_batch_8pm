package ApachePoi_ExcelOpration;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetDataFromDropDownForExcel {

	@Test
	public void getDataFromOptions() throws IOException, InterruptedException {
		FileInputStream path = new FileInputStream("C:\\Users\\OM SAI AM\\eclipse-workspace\\Sept2024_SeleniumBatch\\employeeDetails.xlsx");
		XSSFWorkbook action = new XSSFWorkbook(path);
		XSSFSheet sheetName = action.getSheet("Sheet3");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.name("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
//		driver.findElement(By.linkText("Forgot Password")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Employee")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create")).click();
		WebElement dropdown = driver.findElement(By.id("CountryId"));
		List<WebElement> countryList = dropdown.findElements(By.tagName("option"));
		
		
		
		
		for(int i=0; i<countryList.size(); i++) {
//			System.out.println(countryList.get(i).getText());
			XSSFRow row = sheetName.createRow(i);
			row.createCell(0).setCellValue(countryList.get(i).getText());
		}
		
		FileOutputStream save = new FileOutputStream("C:\\Users\\OM SAI AM\\eclipse-workspace\\Sept2024_SeleniumBatch\\employeeDetails.xlsx");
		action.write(save);
	}
}

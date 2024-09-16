package TestPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('UserName').value='training@jalaacademy.com'");
		js.executeScript("document.getElementById('Password').value='jobprogram'");
		js.executeScript("document.getElementById('btnLogin').click()");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Employee")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Search")).click();
		Thread.sleep(3000);
		WebElement table = driver.findElement(By.id("tblEmployee"));
		 List<WebElement> getData = table.findElements(By.tagName("tr"));
		 for(int i=0; i<getData.size();i++) {
			 System.out.println(getData.get(i).getText());
		 }
		 
		 Thread.sleep(3000);
		 System.out.println("********************single data*************");
		 driver.findElement(By.id("MobileNo")).sendKeys("9705366113");
		 driver.findElement(By.id("btnSearch")).click();
		 
		 Thread.sleep(3000);
		 WebElement table1 = driver.findElement(By.id("tblEmployee"));
		 List<WebElement> getData1 = table.findElements(By.tagName("tr"));
		 
		 for(int i=0; i<getData1.size();i++) {
			 System.out.println(getData1.get(i).getText());
			 String actual = getData1.get(i).getText();
			 String expected ="05/01/1998";
			 if(actual.contains(expected)) {
				 System.out.println("matched");
			 }
		 }
	}

}

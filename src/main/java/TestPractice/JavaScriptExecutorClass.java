package TestPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('UserName').value='training@jalaacademy.com'");
		js.executeScript("document.getElementById('Password').value='jobprogram'");
		js.executeScript("document.getElementById('btnLogin').click()");
		String getURL = js.executeScript("return document.URL").toString();
		System.out.println(getURL);
		
		Thread.sleep(3000);
//		driver.findElement(By.linkText("Logout")).click();
//		Thread.sleep(3000);
//		String javascript = "document.getElementById('btnLogin').style.border='2px solid red'";
		
		String getTitle = js.executeScript("return document.title").toString();
		System.out.println(getTitle);

		
//		String javascript = "document.getElementById('btnLogin').style.border='2px solid red'";
//		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//		jsExecutor.executeScript(javascript);
		Thread.sleep(3000);
		driver.findElement(By.linkText("Employee")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Search")).click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,5000)");
	}
}

package TestPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getOptionsFromDropDown {
	public static void main(String[] args) throws InterruptedException {
		
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
		WebElement countryOptions = driver.findElement(By.id("CountryId"));
		List<WebElement> getOptions = countryOptions.findElements(By.tagName("option"));
		System.out.println(getOptions.size());
		
		for(int i=0; i<getOptions.size();i++) {
			System.out.println(getOptions.get(i).getText());
		}
	}

}

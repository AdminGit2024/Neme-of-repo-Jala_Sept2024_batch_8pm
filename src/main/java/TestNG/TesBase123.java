package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import TestPractice.webDriver;

public class TesBase123 {
static WebDriver driver;
	public  static void Initinlization() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
	}
}

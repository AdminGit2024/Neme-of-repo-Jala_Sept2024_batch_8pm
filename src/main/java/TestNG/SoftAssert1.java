package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class SoftAssert1 {

	@Test
	public void Tc1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		String actual = driver.getCurrentUrl();
		System.out.println("url is : "+actual);
		String expected ="https://www.google123.com/";
		
	
		
	}
}

package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestNG.TestNg_Listner.class)
public class LoginClass {
	
	@Test
	public void TC1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		String actual = driver.getCurrentUrl();
		System.out.println("url is : "+actual);
		String expected ="https://www.google.com/";
		driver.close();
	}
	
	@Test
	public void TC2() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");

		String actual = driver.getCurrentUrl();
		System.out.println("url is : "+actual);
		String expected ="https://magnus.jalatechnologies.com/";
		
		Assert.fail();
	}

}

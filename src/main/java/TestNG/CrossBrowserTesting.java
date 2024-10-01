package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
WebDriver driver;
@Parameters("browserName")
	@Test
	public void launchBroawer(String browserName) {
		if(browserName.equals("Chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equals("FireFox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("please enter the correct browser name");
		}
		
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.close();
	}
}

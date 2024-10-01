package TestNG;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	public void Tc1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		String actual = driver.getCurrentUrl();
		System.out.println("url is : "+actual);
		String expected ="https://www.google123.com/";
		
		Assert.assertEquals(actual, expected);
		Reporter.log("TC passed...!", true);
		System.out.println("continue....!");
		}
		
		
		
//		Assert.assertEquals(actual, expected);
		
//		Assert.assertNotEquals(actual, expected);
//		Reporter.log("TC passed",true);
//		
//		String title = driver.getTitle();
//		System.out.println("title is:"+title);
//
//		
//	}
	
//	@Test
//	public void tc2() {
//		boolean Result=true;
//		String name ="hello";
//		 
//		 Assert.assertFalse(Result,"Result is true");
		
//		Assert.assertTrue(Result);
		
//		Assert.assertNull(name);
//		Assert.assertNotNull(name);
//		Assert.fail();
//		
//		 Reporter.log("TC4 is running", true);
//	}
}

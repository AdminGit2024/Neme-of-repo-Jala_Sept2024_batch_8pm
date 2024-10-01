package TestNG;

import org.jspecify.annotations.Nullable;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TesBase123 {
	PomClass login;
	@BeforeMethod
	public void setup() {
		Initinlization();
		login = new PomClass();
	}
	
	@Test
	public void validateLoginPage() throws InterruptedException {
		login.username();
		login.passowrd();
		login.loginbtn();
		Thread.sleep(3000);
		String actual = driver.getTitle();
		String expected = "Magnus";
		
		Assert.assertEquals(actual, expected);
		Reporter.log("Login page validated successfully", true);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
}

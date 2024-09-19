package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {

	@Test
	public void TC3() {
		System.out.println("this is TC3");
	}
	@Test
	public void TC6() {
		System.out.println("this is TC6");
	}
	@Test
	public void TC7() {
		System.out.println("this is TC7");
	}
	@AfterClass
	public void TC4() {
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void TC2() {
		System.out.println("Before Method");
	}
	
	
	@AfterMethod
	public void TC5() {
		System.out.println("AfterMethod");
	}
	
	
	
	@BeforeClass
	public void TC1() {
		System.out.println("Before class");
	}
}

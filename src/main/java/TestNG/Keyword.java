package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword {
	
	@Test(groups = "Regression")
	public void add() {
		System.out.println("addition");
		
	}
	
//	-56, -34, -6, 0, 1,2,3.....
	@Test (groups = "Smoke")
	public void sub() {
		System.out.println("substraction");
		Reporter.log("substraction is :", true);
		
	}
	
	@Test(groups = "sanity")
	public void mul() {
		System.out.println("Multiplication");
		Reporter.log("Multiplication is :");
	}
	
	@Test(groups = "Functional")
	public void div() {
		System.out.println("Division");
	}

}

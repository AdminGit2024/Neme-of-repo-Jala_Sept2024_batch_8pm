package TestNG;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNg_Listner implements ITestListener {
	
	utility util;
	public void onTestStart(ITestResult result) {
	    System.out.println("Method execution started ...."+result.getName());
	  }

	 public void onTestSuccess(ITestResult result) {
		
		  }
	 
	 public void onTestFailure(ITestResult result) {
		  util = new utility();
		 System.out.println("Test case failed ...."+result.getName());
		 try {
			util.screenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		  }
	 
	 public void onTestSkipped(ITestResult result) {
		   System.out.println("Test case skipped..."+result.getName());
		  }
	 
	 public void onStart(ITestContext context) {
		    System.out.println("Test execution started"+context.getName());
		  }
	 
	 public void onFinish(ITestContext context) {
		    System.out.println("Test case execution completed.." +context.getName());
		  }
}

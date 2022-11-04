package listeners;

import pojo.Browser;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestNgListeners extends Browser implements ITestListener {

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is Successful:"+ result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test is fail:"+ result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is skipped:"+ result.getName());
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test is Started"+result.getTestName());
	}

}












 
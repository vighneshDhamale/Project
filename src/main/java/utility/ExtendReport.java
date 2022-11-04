package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReport {
	public static ExtentReports getReports() {
		ExtentSparkReporter sparkreporte=new ExtentSparkReporter("ExtendReports.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(sparkreporte);
		extent.setSystemInfo("ReportBy","Vighnesh");
		extent.setSystemInfo("TypeTest", "Regression");
		return extent;
	
	
	
	
	
	
	
	
	}
}
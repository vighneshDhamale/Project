package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.Browser;
import pom.Mothercarehomepage;
import utility.ExtendReport;
@Listeners(listeners.TestNgListeners.class)

public class MotherCareHomePageTest {
	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;

	@BeforeTest
		public void createReport() {
		extent=ExtendReport.getReports();
	}
	
	
	
	@BeforeMethod
	public void openBrowser() {
		driver=Browser.OpenChromeBrowser();
		
	}

	@Test(priority=1)
	public void validatemothercarehomepage() throws Exception {
		Mothercarehomepage mothercarehomepage=new Mothercarehomepage(driver);
		test=extent.createTest("MotherCareHomePageTest");
		
		//	driver.switchTo().alert().accept();
	//	ChromeOptions options=new ChromeOptions();
		
//		options.addArguments("--disable-notifications");
	//	options.addArguments("headless");
		mothercarehomepage.clickonbabyclothing();
		Thread.sleep(3000);
		mothercarehomepage.clickonkidsclothing();
		Thread.sleep(3000);
		mothercarehomepage.clickonmomandmaaternity();
		Thread.sleep(3000);
		mothercarehomepage.clickonbabycare();
		Thread.sleep(3000);
		mothercarehomepage.clickonbabygear();
		mothercarehomepage.clickonfurnitureandbedding();
		mothercarehomepage.clickonFootwearandAccrssories();
		mothercarehomepage.clickonhamley();
		mothercarehomepage.clickonsale();


	}

	@AfterMethod
	public void addResults(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS,result.getName());
	}
		else if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL,result.getName());
	}
		if(result.getStatus()==ITestResult.SKIP) {
			test.log(Status.SKIP,result.getName());
	}
}

	@AfterTest
	public void FlushReport() {
		extent.flush();
	}

}











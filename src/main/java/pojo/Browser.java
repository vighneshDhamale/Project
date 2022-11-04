package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
	public static WebDriver OpenChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
	//	WebDriverManager.Chromedriver().setup();
	//	WebDriver driver = new ChromeDriver(options);	
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		
	
	driver.navigate().to("https://www.mothercare.in/");
	driver.manage().window().maximize();
	return driver;
	

	
	}
}
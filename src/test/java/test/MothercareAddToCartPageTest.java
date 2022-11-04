package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.MotherCareAddToCart;

    public class MothercareAddToCartPageTest {

	WebDriver driver;
	
	
	@BeforeMethod
	public void openBrowser() {
	driver=Browser.OpenChromeBrowser();
	
	}
	
	@Test
	public void validateMotherCareAddToCart() throws Exception{
		MotherCareAddToCart mothercareaddtocart=new MotherCareAddToCart(driver);
		driver.switchTo().alert().accept();
//		String alerttext=driver.switchTo().alert().getText();
//		System.out.println(alerttext);
		
//	WebElement alert=driver.findElement(By.xpath("//iframe[@id='_hjRemoteVarsFrame']"));
//	alert.click();
        
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--disable-notifcation");
		options.addArguments("headless");
		
		
		
		
		mothercareaddtocart.clickonbabyclothing();
		mothercareaddtocart.clickonAddtocart();
		mothercareaddtocart.clickonagegroup();
		mothercareaddtocart.clickonqty();
		mothercareaddtocart.clickonaddtocart();
		mothercareaddtocart.clickoncheckout();
		mothercareaddtocart.clickonremove();
		mothercareaddtocart.clickoncontinue();
	
	
	}
	
	
	
	
	
	
}

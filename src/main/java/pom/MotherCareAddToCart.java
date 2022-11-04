package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MotherCareAddToCart {
		@FindBy(xpath="//a[text()='Baby clothing']")private WebElement Babyclothing;
		@FindBy(xpath="(//button[@type='button'])[7]")private WebElement Addtocart;
		@FindBy(xpath="//label[text()='0-6M']")private WebElement AgeGroup;
		@FindBy(xpath="")private WebElement Qty;
		@FindBy(xpath="")private WebElement addtocart;
		@FindBy(xpath="")private WebElement Checkout;
		@FindBy(xpath="")private WebElement Remove;
		@FindBy(xpath="")private WebElement Continue1;

	public MotherCareAddToCart (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickonbabyclothing() {
		Babyclothing.click();
	}
	public void clickonAddtocart() {
		Addtocart.click();
	}
	public void clickonagegroup() {
		AgeGroup.click();
	}
	public void clickonqty() {
		Qty.click();
	}
	public void clickonaddtocart() {
		addtocart.click();
	}
	public void clickoncheckout() {
		Checkout.click();
	}
	public void clickonremove() {
		Remove.click();
	}
	public void clickoncontinue() {
		Continue1.click();
	}


}

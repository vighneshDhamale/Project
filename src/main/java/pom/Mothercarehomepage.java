package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mothercarehomepage {
	@FindBy(xpath="//a[text()='Baby clothing']")private WebElement babyClothing;
	@FindBy(xpath="//a[text()='Kids clothing']")private WebElement KidsClothing;
	@FindBy(xpath="//a[text()='Moms & maternity']")private WebElement momandmaternity;
	@FindBy(xpath="//a[text()='Babycare']")private WebElement babycare;
	@FindBy(xpath="//a[text()='Baby gear']")private WebElement babygear;
	@FindBy(xpath="//a[text()='Furniture & bedding']")private WebElement FurnitureandBedding;
	@FindBy(xpath="//a[text()='Footwear & accessorie']")private WebElement FootwearandandAccessoreis;
	@FindBy(xpath="//a[text()='Hamleys']")private WebElement hamleys;
	@FindBy(xpath="//a[text()='Sale']")private WebElement sale;

	public Mothercarehomepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void clickonbabyclothing() {
		babyClothing.click();
	}

	public void clickonkidsclothing() {
		KidsClothing.click();
	}

	public void clickonmomandmaaternity() {
		momandmaternity.click();
	}

	public void clickonbabycare() {
		babycare.click();
	}
	
	public void clickonbabygear() {
		babygear.click();
	}

	public void clickonfurnitureandbedding() {
		FurnitureandBedding.click();
	}

	public void clickonFootwearandAccrssories() {
		FootwearandandAccessoreis.click();
	}

	public void clickonhamley() {
		hamleys.click();
	}

	public void clickonsale() {
		sale.click();
	}



}

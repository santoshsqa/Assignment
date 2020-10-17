package com.axelerant.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.axelerant.utility.CommonActions;

public class HomePage {

	Actions action;
	WebDriver driver;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	action=new Actions(driver);
	}
	
	public void addToCardProduct(int ProductNo ) {
		WebElement productImage = driver.findElement(By.xpath("(//ul[@id='homefeatured']//a/img)["+ProductNo+"]"));
		action.moveToElement(productImage).build().perform();
		WebElement addToCart=driver.findElement(By.xpath("(//ul[@id='homefeatured']//div/a/span[text()='Add to cart'])["+ProductNo+"]"));
		CommonActions.clickOnElement(addToCart, "Clicked on Add to Cart button");
	}
	//@FindBy()
	
	
}

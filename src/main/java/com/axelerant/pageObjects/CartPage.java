package com.axelerant.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axelerant.utility.CommonActions;

public class CartPage {

	
	
	
	
	WebDriver driver;
	Actions action;
	public CartPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver=driver;
	action=new Actions(driver);
	}
	
	
	@FindBy(xpath="//div[@id=\"layer_cart\"]//a/span[contains(text(),'Proceed to checkout')]")
	WebElement btn_popup_ProceedtoCheckout;
	
	
	
	@FindBy(xpath="//p[@class='cart_navigation clearfix']/a[@title='Proceed to checkout']")
	WebElement btn_ProceedtoCheckout;
	
	
	public void clickOnProceedToCheckoutbuttonFromPopup() {
		CommonActions.clickOnElement(btn_popup_ProceedtoCheckout, "Click on Proceed to checkout button");
	}
	
	public void clickOnProceedToCheckoutFromCartPage() {
		CommonActions.clickOnElement(btn_ProceedtoCheckout, "Click on Proceed to Checkout button from Cart page");
	}
	
	
}

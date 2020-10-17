package com.axelerant.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axelerant.utility.CommonActions;

public class ShippingPage {

	WebDriver driver;
	public ShippingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath="//label[@for='cgv']")
	WebElement checkbox_Agreement;
	
	@FindBy(name="processCarrier")
	WebElement btn_ProceedToCheckout;
	
	public void clickOnAgremmentCheckbox() {
		CommonActions.clickOnElement(checkbox_Agreement, "Click on Agreement Checkbox");
	}
	
	public void clickOnProceedToCheckoutbutton() {
		CommonActions.clickOnElement(btn_ProceedToCheckout, "Click on Proceed to checkout button");
	}
	
}

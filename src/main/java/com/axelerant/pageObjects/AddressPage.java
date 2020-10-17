package com.axelerant.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axelerant.utility.CommonActions;

public class AddressPage {

	WebDriver driver;
	public AddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(name="processAddress")
	WebElement ProcessAddress;
	
	public void clickOnProcessAddress() {
		CommonActions.clickOnElement(ProcessAddress, "Click on ProcessAddress button");
	}
}

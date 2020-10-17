package com.axelerant.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axelerant.utility.CommonActions;

public class SignInPage {

	WebDriver driver;
	public SignInPage(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(id="email")
	WebElement txtField_EmailId;
	
	@FindBy(id="passwd")
	WebElement txtField_Password;
	
	@FindBy(id="SubmitLogin")
	WebElement btn_SignIn;
	
	public void enterEmailId(String EmailId) {
		CommonActions.typeTextInEditField(txtField_EmailId, EmailId);
	}
	public void enterPassword(String Password) {
		CommonActions.typeTextInEditField(txtField_Password, Password);
	}
	
	public void clickOnSignbutton() {
		CommonActions.clickOnElement(btn_SignIn, "Click on Sign in button");
	}
}

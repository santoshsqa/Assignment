package com.axelerant.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.axelerant.utility.CommonActions;

public class PaymentPage {

	WebDriver driver;
	
	public PaymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "bankwire")
	WebElement link_PayByBankWire;
	
	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']/span")
	WebElement link_ConfirmMyOrder;
	
	@FindBy(xpath="//p[@class='cheque-indent']/strong")
	WebElement msg_SucessMessage;
	
	public void clickOnPaybyBankWirelink() {
		CommonActions.clickOnElement(link_PayByBankWire, "Click on Pay by Bank Wire link");
	}
	
	public void clickOnConfirmbutton() {
		CommonActions.clickOnElement(link_ConfirmMyOrder, "Click on I confirm my order button");
	}
	
	public String getPaymentSuccessMessage() {
		return CommonActions.getTextFromElement(msg_SucessMessage);
	}
	
}

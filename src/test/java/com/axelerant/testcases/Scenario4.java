package com.axelerant.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.axelerant.utility.ObjectInitializations;
import com.axelerant.utility.PropertyFileOperation;

public class Scenario4 extends ObjectInitializations{
	
	@Test
	public void validateCheckoutFlow() {
		homePage.addToCardProduct(2);
		cartPage.clickOnProceedToCheckoutbuttonFromPopup();
		cartPage.clickOnProceedToCheckoutFromCartPage();
		signIn.enterEmailId(PropertyFileOperation.getPropertyValue("EmailId"));
		signIn.enterPassword(PropertyFileOperation.getPropertyValue("Password"));
		signIn.clickOnSignbutton();
		address.clickOnProcessAddress();
		shipping.clickOnAgremmentCheckbox();
		shipping.clickOnProceedToCheckoutbutton();
		payment.clickOnPaybyBankWirelink();
		payment.clickOnConfirmbutton();
		String paymentSuccessMessage = payment.getPaymentSuccessMessage();
		Assert.assertEquals(paymentSuccessMessage, PropertyFileOperation.getPropertyValue("PaymentSuceeMessage"));
		
		
		
	}


}

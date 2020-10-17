package com.axelerant.testcases;

import java.util.Random;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.axelerant.utility.ObjectInitializations;
import com.axelerant.utility.PropertyFileOperation;

public class Scenario2 extends ObjectInitializations {

	@Test(description = "Automate Newsletter subscription scenarios")
	public void validateNewsLetterScenario() {
		int randomInt = new Random().nextInt(10000);
		String EmailId = "testing" + randomInt + "@gmail.com";

//This will verify the success message of newsletter		
		commonPage.enterEmailIdOnNewsLetter(EmailId);
		commonPage.clickOnSubmitButtonForNewsLetter();
		String newsLetterConfirmationMessage = commonPage.getNewsLetterConfirmationMessage();
		Assert.assertEquals(newsLetterConfirmationMessage,
				PropertyFileOperation.getPropertyValue("NewsLetterSuccessMessage"));
		Reporter.log("Assertion Passed :- Verified the newsletter with new mail id");
		System.out.println("Assertion Passed :- Verified the newsletter with new Mail id");
		String newsLetterBackgroundColorOnFirstEmail = commonPage.getNewsLetterBackgroundColor();
		Assert.assertEquals(newsLetterBackgroundColorOnFirstEmail, "rgba(85, 198, 94, 1)");
		Reporter.log("Assertion Passed :- Verified the background color with new Mail id");
		System.out.println("Assertion Passed :- Verified the background color with new Mail id");

//This will verify the failure message of newsletter			
		commonPage.enterEmailIdOnNewsLetter(EmailId);
		commonPage.clickOnSubmitButtonForNewsLetter();
		String newsLetterConfirmationMessa = commonPage.getNewsLetterConfirmationMessage();
		Assert.assertEquals(newsLetterConfirmationMessa,
				PropertyFileOperation.getPropertyValue("NewsLetterFailureMessage"));
		Reporter.log("Assertion Passed :- Verified Failure Newsletter msssage");
		System.out.println("Assertion Passed :- Verified the Failure newsletter message");
		String newsLetterBackgroundColorOnSameEmail = commonPage.getNewsLetterBackgroundColor();
		Assert.assertEquals(newsLetterBackgroundColorOnSameEmail, "rgba(243, 81, 92, 1)");
		Reporter.log("Assertion Passed :- Verified the background color with existing Mail id");
		System.out.println("Assertion Passed :- Verified the background color with existing Mail id");
	}
}

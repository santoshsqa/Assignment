package com.axelerant.testcases;

import org.testng.annotations.Test;


import com.axelerant.utility.ObjectInitializations;

public class Scenario1 extends ObjectInitializations{


	/**
	 * 
	 */
	@Test(description="Navigate to multiple pages of the website and automate verification of the header and footer.")
	public void navigattionToDifferentPages() {
		validateFooterElements();
		commonPage.validateExistenceOfHeaderElements();
		commonPage.clickOnTopMenu("Women");
		validateFooterElements();
		commonPage.validateExistenceOfHeaderElements();
		validateFooterElements();
		commonPage.validateExistenceOfHeaderElements();		
		commonPage.clickOnTopMenu("Dresses");
		commonPage.validateExistenceOfHeaderElements();
		validateFooterElements();
		commonPage.clickOnTopMenu("T-shirts");
		commonPage.validateExistenceOfHeaderElements();
		validateFooterElements();
	}
	
	
	
	
	private void validateFooterElements() {
		commonPage.validateExistenceOfNewsLetterElemnts();
		commonPage.validateExistenceOfSocialMediaIconsElements();
		commonPage.validateCategoryElements();
		commonPage.validateExistenceOfInformationElements();
		commonPage.validateExistenceOfMyAccountElements();
		commonPage.validateExistenceOfStoreInformation();
		System.out.println("Verified footer elements");
	}
}

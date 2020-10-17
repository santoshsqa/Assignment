package com.axelerant.testcases;

import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.axelerant.utility.ObjectInitializations;

public class Scenario3 extends ObjectInitializations{

	
	@BeforeMethod
	public void beforeEveryTest() {
		commonPage.hoverToTopMenu("Women");
		commonPage.clickedOnSubmenu("Summer Dresses");
	}
	
	
	@Test(description = "Apply any one available filter and verify the results")
	public void validateSizeFilter() {
		int getNoOfProductForSize = resultPage.selecteSize("S");
		System.out.println(getNoOfProductForSize);
		resultPage.verifyAvailablilityOfListing(getNoOfProductForSize);	
		
	}
	
	@Test
	public void validateSorting() {
		resultPage.selectSortingValue("Price: Lowest first");
		List<String> Prices=resultPage.getPricesOnAllProducts();
		resultPage.verifyPriceSorting(Prices,"ascending");
		System.out.println(Prices);
		resultPage.selectSortingValue("Product Name: A to Z");
		List<String> getProductNames=resultPage.getProductsName();
		resultPage.verfiyProductSorting(getProductNames,"ascending");
	}
}

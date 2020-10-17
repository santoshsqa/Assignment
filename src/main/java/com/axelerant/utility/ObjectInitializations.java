package com.axelerant.utility;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.axelerant.base.TestBase;
import com.axelerant.pageObjects.AddressPage;
import com.axelerant.pageObjects.CartPage;
import com.axelerant.pageObjects.CommonPage;
import com.axelerant.pageObjects.HomePage;
import com.axelerant.pageObjects.PaymentPage;
import com.axelerant.pageObjects.SearchResultPage;
import com.axelerant.pageObjects.ShippingPage;
import com.axelerant.pageObjects.SignInPage;

public class ObjectInitializations extends TestBase{

	protected CommonPage commonPage;
	protected HomePage homePage;
	protected SearchResultPage resultPage;
	protected CartPage cartPage;
	protected SignInPage signIn;
	protected CommonActions common;
	protected AddressPage address;
	protected ShippingPage shipping;
	protected PaymentPage payment;
	@Parameters({ "browser" })
	@BeforeMethod
	public void initializeInstances(@Optional("chrome") String browser) {
		launchBrowserInstance(browser);
		commonPage=new CommonPage(driver);
		homePage=new HomePage(driver);
		resultPage=new SearchResultPage(driver);
		cartPage=new CartPage(driver);
		signIn=new SignInPage(driver);
		address=new AddressPage(driver);
		shipping=new ShippingPage(driver);
		payment=new PaymentPage(driver);
		common=new CommonActions(driver);
	}
	
	@AfterMethod
	public void closeBrowser() {
		removInstance();
	}
	
}

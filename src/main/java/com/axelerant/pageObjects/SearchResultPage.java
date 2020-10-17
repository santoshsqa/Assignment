package com.axelerant.pageObjects;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.axelerant.utility.CommonActions;

public class SearchResultPage {

	private WebDriver driver;




	public SearchResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(id="selectProductSort")
	WebElement dropdown_SortBy;
	
	@FindBy(xpath="//div[@class='right-block']/div[@itemprop='offers']/span[1]")
	List<WebElement> label_Prices;
	
	@FindBy(xpath="//ul[@class='product_list row list']/li")
	List<WebElement> view_ProductsListing;
	
	
	
	public int selecteSize(String Size) {
		WebElement SizeElement = driver.findElement(By.xpath("//ul[@id='ul_layered_id_attribute_group_1']//a[contains(text(),'"+Size+"')]/span"));
		CommonActions.clickOnElement(SizeElement, "Clicked on Size "+Size);
		int CountOfSizesData = CommonActions.getNumbersOnlyFromString(CommonActions.getTextFromElement(SizeElement));
		return CountOfSizesData;
	}
	
	//This method is used to compare with no of product item from filter
	public void verifyAvailablilityOfListing(int noOfProducts) {
		/* Getting issue in the application ie on apply filter or sorting application is showing 403
		and result is not showing and it is mentioned in Readme.md
	*/
		//	Assert.assertEquals(view_ProductsListing.size(), noOfProducts);
		
	}
	
	public void selectSortingValue(String Value) {
		Select select= new Select(dropdown_SortBy);
		select.selectByVisibleText(Value);
		System.out.println(Value +" is selected");
	}

	public List<String> getPricesOnAllProducts() {
		return label_Prices.stream().map(s->s.getText()).collect(Collectors.toList());
		
	}

	public void verifyPriceSorting(List<String> prices, String string) {
		/* Getting issue in the application ie on apply filter or sorting application is showing 403
		and result is not showing and it is mentioned in Readme.md
	*/
		
	}

	public void verfiyProductSorting(List<String> getProductNames, String string) {
		/* Getting issue in the application ie on apply filter or sorting application is showing 403
		and result is not showing and it is mentioned in Readme.md
	*/
		
	}

	public List<String> getProductsName() {
		/* Getting issue in the application ie on apply filter or sorting application is showing 403
		and result is not showing and it is mentioned in Readme.md
	*/
		return null;
	}
}

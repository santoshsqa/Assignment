package com.axelerant.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.axelerant.utility.CommonActions;

public class CommonPage {

	 WebDriver driver;
WebDriverWait wait;
	 Actions builder;
	public CommonPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		builder=new Actions(driver);
		wait=new WebDriverWait(driver, 30);
	}
	
	@FindBy(xpath="//div[@class='banner']//img")
	WebElement img_bannerImage;
	
	@FindBy(xpath="//div[@id=\"block_top_menu\"]/ul/li/a")
	List<WebElement> label_Menu;
	
	@FindBy(xpath="//ul[contains(@class,'submenu-container')]/li[2]/ul/li/a")
	List<WebElement> link_Submenu;
	
	@FindBy(xpath="//div[@id='contact-link']/a")
	WebElement link_ContactUS;
	
	@FindBy(linkText = "Sign in")
	WebElement link_SignIn;
	
	
//Footer
	@FindBy(xpath="//div[@id='newsletter_block_left']/h4[contains(text(),'Newsletter')]")
	WebElement label_Newsletter;	
	@FindBy(id="newsletter-input")
	WebElement field_EmailForNewsletter;
	@FindBy(name="submitNewsletter")
	WebElement btn_SubmitNewsLetter;
	@FindBy(xpath="//p[contains(@class,'alert alert')] ")
	WebElement label_NewsLetterMessage;
	
	@FindBy(xpath="//section[@id='social_block']/h4[contains(text(),'Follow us')]")
	WebElement label_FollowUs;
	
	@FindBy(xpath="//section[@id='social_block']//li/a")
	List<WebElement> link_SocialMedia;
	
	@FindBy(xpath="//section[contains(@class,'blockcategories_footer')]/h4[text()='Categories']")
	WebElement label_Categories;
	
	@FindBy(xpath="//h4[text()='Categories']/following-sibling::div[contains(@class,'category_footer')]/div/ul[@style=\"display: block;\"]/li/a")
	List<WebElement> link_Categories;
	
	@FindBy(xpath="//section[contains(@class,'footer-block')]/h4[text()='Information']")
	WebElement label_Information;
	
	@FindBy(xpath="//section[contains(@class,'footer-block')]/ul//a")
	List<WebElement> link_information;
	
	@FindBy(xpath="//section[contains(@class,'footer-block')]/h4/a[text()='My account']")
	WebElement label_MyAccount;
	
	@FindBy(xpath="//section[contains(@class,'footer-block')]/div/ul/li/a")
	List<WebElement> value_MyAccount;
	
	@FindBy(xpath="//section[@id=\"block_contact_infos\"]//h4")
	WebElement label_StoreInformation;
	
	@FindBy(xpath="//section[@id=\"block_contact_infos\"]//ul/li/i")
	List<WebElement> values_StoreInformation;
	
	
	
	
	public void hoverToTopMenu(String MenuName) {
		label_Menu.stream().forEach(s->{
			if(s.getText().equalsIgnoreCase(MenuName)) {
				builder.moveToElement(s).build().perform();
			}
		});
	
	}
	
	public void clickOnTopMenu(String MenuName) {
		WebElement Menu=driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li/a[text()='"+MenuName+"']"));
		CommonActions.clickOnElement(Menu, "Clicked on "+MenuName);
	}
	
	public void selectWomenDrssesSubmenu(String WomenDresses) {
		WebElement Dresses=driver.findElement(By.xpath("//ul[contains(@class,'submenu-container')]/li[2]/ul/li/a[text()='"+WomenDresses+"']"));
		CommonActions.clickOnElement(Dresses, "Clicked on Submenu "+WomenDresses);
	}
	public void enterEmailIdOnNewsLetter(String EmailId) {
		CommonActions.typeTextInEditField(field_EmailForNewsletter, EmailId);
	}
	
	public void clickOnSubmitButtonForNewsLetter() {
		CommonActions.clickOnElement(btn_SubmitNewsLetter,"Click on Submit button for NewsLetter");
	}
	
	public String getNewsLetterConfirmationMessage() {
		return CommonActions.getTextFromElement(label_NewsLetterMessage);
	}
public String getNewsLetterBackgroundColor() {
		return label_NewsLetterMessage.getCssValue("background-color");
		
	}
	
	
	public void clickedOnSubmenu(String SubMenu) {
		link_Submenu.stream().forEach(s->{
			if(s.getText().equalsIgnoreCase(SubMenu))
				s.click();
		});
	}
	
	public void validateExistenceOfHeaderElements() {
		Assert.assertTrue(img_bannerImage.isDisplayed(), "Banner image is not available");
		System.out.println("Verified HeaderElement");
	}
	
	
	
	public void validateExistenceOfNewsLetterElemnts() {
		Assert.assertTrue(label_Newsletter.isDisplayed());
		Assert.assertTrue(field_EmailForNewsletter.isDisplayed());
		Assert.assertTrue(btn_SubmitNewsLetter.isDisplayed());
	}
	
	public void validateExistenceOfSocialMediaIconsElements() {
		Assert.assertTrue(label_FollowUs.isDisplayed());
		Assert.assertTrue(link_SocialMedia.size()==4);
	}
	
	public void validateCategoryElements() {
		Assert.assertTrue(label_Categories.isDisplayed());
		Assert.assertTrue(link_Categories.size()==1);
	}
	
	public void validateExistenceOfInformationElements() {
		Assert.assertTrue(label_Information.isDisplayed());
				Assert.assertTrue(link_information.size()==8);
	}
	
	public void validateExistenceOfMyAccountElements() {
		Assert.assertTrue(label_MyAccount.isDisplayed());
		Assert.assertTrue(value_MyAccount.size()==4);
	}
	
	public void validateExistenceOfStoreInformation() {
		Assert.assertTrue(label_StoreInformation.isDisplayed());
		Assert.assertTrue(values_StoreInformation.size()==3);
	}

	
	
	
}

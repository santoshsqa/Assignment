package com.axelerant.utility;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class CommonActions {

	WebDriver driver;
	static WebDriverWait wait;
	public CommonActions(WebDriver driver) {
		this.driver=driver;
		wait=new WebDriverWait(driver, 30);
	}
	
	public static void clickOnElement(WebElement ele,String Log) {
		retryingFindClick(ele);
		Reporter.log(Log);
		System.out.println(Log);
	}
	
	public static void typeTextInEditField(WebElement ele,String TextToEnter) {
		ele.sendKeys(TextToEnter);
		Reporter.log("Entered "+ TextToEnter);
		System.out.println("Entered "+ TextToEnter);
	}
	
	public static String getTextFromElement(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.getText();
	}
	
	public static boolean retryingFindClick(WebElement element) {
        boolean result = false;
        int attempts = 0;
        while(attempts < 3) {
     
            try {
            	wait.until(ExpectedConditions.elementToBeClickable(element));
                element.click();
                result = true;
          
                break;
                
            } catch(StaleElementReferenceException e) {
            }
            catch(ElementClickInterceptedException e) {
            	
            }
            attempts++;
        }
        return result;
}
	public static int getNumbersOnlyFromString(String TextFrom) {
		return Integer.parseInt(TextFrom.replaceAll("[\\D]", ""));
	}
}

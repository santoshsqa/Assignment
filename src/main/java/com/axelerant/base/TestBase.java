package com.axelerant.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.axelerant.utility.PropertyFileOperation;

public class TestBase {

	protected WebDriver driver;
	BrowserFactory bf=new BrowserFactory();
//	public static ExtentHtmlReporter htmlReporter;
//	public static ExtentReports extent;
//	public static ExtentTest parentTest;
//	public static ExtentTest logger;
	
		
	public void launchBrowserInstance(String browserName) {
		WebDriver driverInstance = bf.createBrowserInstance(browserName);
		DriverFactory.getInstance().setDriver(driverInstance);
		driver = DriverFactory.getInstance().getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.valueOf(PropertyFileOperation.getPropertyValue("implicitWait")),
				TimeUnit.SECONDS);
		driver.navigate().to(PropertyFileOperation.getPropertyValue("Url"));
	}
	
	
	public void removInstance() {
		DriverFactory.getInstance().removeDriver();
	}
}

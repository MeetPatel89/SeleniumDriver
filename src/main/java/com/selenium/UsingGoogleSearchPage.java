package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UsingGoogleSearchPage {
	public static void main(String[] args) {
		
		// create a new instance of a driver
		WebDriver driver = SeleniumDriverUtil.launchDriver();
		
		// navigate to the right place
		driver.get("http://www.google.com");
		
		// create an instance of pageObject class
		GoogleSearchPage2 page = PageFactory.initElements(driver, GoogleSearchPage2.class);
		
		page.searchFor("Cheese");
		driver.quit();
	}
}

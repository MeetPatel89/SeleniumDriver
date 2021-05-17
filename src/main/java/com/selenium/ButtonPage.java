package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonPage {
	
	public String clickButtonAndGetText(String xpath, String id, String url) {
		
		SeleniumDriverUtil seleniumDriverUtil = new SeleniumDriverUtil();
		
		seleniumDriverUtil.launchBrowser(url);
		
		WebElement button = seleniumDriverUtil.findElementByXPath(xpath);
		button.click();

		WebElement element = seleniumDriverUtil.findElementById(id);
		String message = element.getText();
		
		seleniumDriverUtil.quitDriver();
		
		return message;
	}
}

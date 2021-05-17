package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonPage {
	public String clickButtonAndGetText(WebDriver driver, String xpath, String id) {
		
		WebElement button = SeleniumDriverUtil.findElementByXPath(driver, xpath);
		button.click();

		WebElement element = SeleniumDriverUtil.findElementById(driver, id);
		String message = element.getText();
		
		return message;
	}
}

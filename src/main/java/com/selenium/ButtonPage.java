package com.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonPage {
	
	private SeleniumDriverUtil  _seleniumDriverUtil;
	
	public ButtonPage(SeleniumDriverUtil seleniumDriverUtil) {
		_seleniumDriverUtil = seleniumDriverUtil;
	}

	public String clickButtonAndGetText(String xpath, String id, String url) {
		
		_seleniumDriverUtil.launchBrowser(url);
		
		WebElement button = _seleniumDriverUtil.findElementByXPath(xpath);
		button.click();

		WebElement element = _seleniumDriverUtil.findElementById(id);
		String message = element.getText();
		
		return message;
	}

	public String doubleClickButtonGetText(String buttonId, String textId, String url) {
		
		_seleniumDriverUtil.launchBrowser(url);
		
		WebElement button = _seleniumDriverUtil.findElementById(buttonId);
		Actions actions = new Actions(_seleniumDriverUtil.get_driver());
		actions.doubleClick(button).perform();
		
		WebElement element = _seleniumDriverUtil.findElementById(textId);
		String message = element.getText();
		
		return message;
		
	}

		
}

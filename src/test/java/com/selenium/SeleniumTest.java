package com.selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SeleniumTest {

	@Test
	public void canLaunchBrowser() {

		String url = "https://demoqa.com/";
		
		SeleniumDriverUtil seleniumDriverUtil = new SeleniumDriverUtil();

		seleniumDriverUtil.launchBrowser(url);
		assertEquals(seleniumDriverUtil.get_driver().getCurrentUrl(), url);
		seleniumDriverUtil.quitDriver();
	}	

	@Test
	public void canClickButtonAndGetResult() { 

		String url = "https://demoqa.com/buttons";
		String xpath = "//button[text()='Click Me']";
		String id = "dynamicClickMessage";
		
		ButtonPage buttonPage = new ButtonPage();
		
		String message = buttonPage.clickButtonAndGetText(xpath, id, url);

		assertEquals(message, "You have done a dynamic click");
	}

}

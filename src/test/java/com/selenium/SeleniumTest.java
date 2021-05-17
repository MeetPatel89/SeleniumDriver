package com.selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {

	private SeleniumDriverUtil _seleniumDriverUtil;

	@Test
	public void canLaunchBrowser() {

		String url = "https://demoqa.com/";

		_seleniumDriverUtil.launchBrowser(url);
		
		assertEquals(_seleniumDriverUtil.get_driver().getCurrentUrl(), url);
		
	}	

	@Test
	public void canClickButtonAndGetResult() { 

		String url = "https://demoqa.com/buttons";
		String xpath = "//button[text()='Click Me']";
		String id = "dynamicClickMessage";
		
		ButtonPage buttonPage = new ButtonPage(_seleniumDriverUtil);
		String message = buttonPage.clickButtonAndGetText(xpath, id, url);

		assertEquals(message, "You have done a dynamic click");
	}
	
	@Test
	public void canDoubleClickButtonAndGetResult() {
		
		String url = "https://demoqa.com/buttons";
		String buttonId = "doubleClickBtn";
		String textId = "doubleClickMessage";
		
		ButtonPage buttonPage = new ButtonPage(_seleniumDriverUtil);
		String message = buttonPage.doubleClickButtonGetText(buttonId, textId, url);
	}
	
	@BeforeTest
	public void setUp() {
		_seleniumDriverUtil = new SeleniumDriverUtil();
	}	
	
	@AfterTest
	public void cleanUp() {
		_seleniumDriverUtil.quitDriver();
			
	}

}

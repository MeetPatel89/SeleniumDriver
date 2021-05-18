package com.selenium;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculatorTest {
	
	private SeleniumDriverUtil _seleniumDriverUtil;

	@Test
	public void canLaunchBrowser() {
		String url = "https://www.calculator.net/";
		
		_seleniumDriverUtil.launchBrowser(url);
		
		assertEquals(_seleniumDriverUtil.get_driver().getCurrentUrl(), url);
	}
	
	@BeforeTest
	public void setUp() {
		_seleniumDriverUtil = new SeleniumDriverUtil();
	}
	
	@AfterTest
	public void cleanUP() {
		_seleniumDriverUtil.quitDriver();
	}
}

package com.selenium;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculatorTest {
	
	private SeleniumDriverUtil _seleniumDriverUtil;

	@Test
	public void canLaunchBrowser() {
		
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

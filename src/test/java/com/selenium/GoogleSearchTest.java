package com.selenium;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearchTest {

	private GoogleSearchPage googleSearchPageObject;
	private WebDriver driver;
	
	@Test
	public void findGoogleBox() {
		
		WebElement googleSearchBox = googleSearchPageObject.textBoxSearchElement();
		
	}
	
	@Test
	public void typeTextInGoogleBox() {
		googleSearchPageObject.typeTextGoogleBox("Random text typed in google search box for testing purposes...");
		String typedText = googleSearchPageObject.getTypedTextInGoogleBox();
		
		assertEquals(typedText, "Random text typed in google search box for testing purposes...");
	}
	
	@Test
	public void typeTextClickSearchButton() {
		googleSearchPageObject.typeTextGoogleBox("Selenium Web Driver");
		googleSearchPageObject.clickGoogleSearchButton();
	}

	@BeforeTest
	public void setUp() {
		driver = SeleniumDriverUtil.launchDriver();
		
		googleSearchPageObject = new GoogleSearchPage(driver);
		googleSearchPageObject.launchGoogleSearchPage();
	}

	@AfterTest
	public void cleanUp() {
		driver.quit();
		googleSearchPageObject = null;
	}
}

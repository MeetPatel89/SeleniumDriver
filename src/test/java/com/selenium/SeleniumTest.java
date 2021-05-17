package com.selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SeleniumTest {

	@Test
	public void canLaunchBrowser() {

		String url = "https://demoqa.com/";

		WebDriver driver = SeleniumDriverUtil.launchBrowser(url);
		assertEquals(driver.getCurrentUrl(), url);
		driver.quit();
	}

	@Test
	public void canClickButtonAndGetResult() {

		String url = "https://demoqa.com/buttons";
		String xpath = "//button[text()='Click Me']";
		String id = "dynamicClickMessage";

		WebDriver driver = SeleniumDriverUtil.launchBrowser(url);
		
		ButtonPage buttonPage = new ButtonPage();
		
		String message = buttonPage.clickButtonAndGetText(driver, xpath, id);

		assertEquals(message, "You have done a dynamic click");
		driver.quit();
	}

}

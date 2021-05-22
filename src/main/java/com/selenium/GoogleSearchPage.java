package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

	// locator strategies that return By object
	By googleSearchBox = By.name("q");
	By googleSearchButton = By.name("btnK");
	private WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void launchGoogleSearchPage() {
		driver.get("https://google.com");
	}

	public WebElement textBoxSearchElement() {

		return driver.findElement(googleSearchBox);
	}
	
	public void typeTextGoogleBox(String text) {
		this.textBoxSearchElement().sendKeys(text);
		
	}
	
	public String getTypedTextInGoogleBox() {
		return this.textBoxSearchElement().getAttribute("value");
	}

	public WebElement googleSearchButton() {

		return driver.findElement(googleSearchButton);
		
	}
	
	public void clickGoogleSearchButton() {
		this.googleSearchButton().click();
	}
	
}

package com.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage2 {
	
	// WebElement is looked up using a strategy defined using @FindBy annotation
	@FindBy(name= "q")
	private WebElement searchBox;
	
	public void searchFor(String text) {
		
		searchBox.sendKeys(text);
		searchBox.submit();
	}
}

package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class PageSuperClass {
	protected WebDriver driver;
	
	public PageSuperClass(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	protected PageSuperClass navigate(String pageURL) {
		driver.get(pageURL);
		driver.manage().window().maximize();
		return this;
	}
}

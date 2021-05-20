package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Guru99HomePage {
	WebDriver driver;
	By homePageUserName = By.xpath("//td[text()='Manger Id : mngr327777']");
	
	public Guru99HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getTableElementWithUserNameText() {
		return driver.findElement(homePageUserName);
	}
}

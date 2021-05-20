package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99LoginPage {
	WebDriver driver;

	By userNameBox = By.name("uid");

	By passwordBox = By.name("password");

	By loginButton = By.name("btnLogin");
	
	By titleLoginPage = By.xpath("//h2[@class='barone']");

	public Guru99LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setUserName(String userName) {
		driver.findElement(userNameBox).sendKeys(userName);
	}

	public void setPassword(String password) {
		driver.findElement(passwordBox).sendKeys(password);
	}
	
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
	
	public String getTitleLoginPage() {
		return driver.findElement(titleLoginPage).getText();
	}
	
	public void loginToGuru99(String userName, String password) {
		
		this.setUserName(userName);
		
		this.setPassword(password);
		
		this.clickLoginButton();
	}

}

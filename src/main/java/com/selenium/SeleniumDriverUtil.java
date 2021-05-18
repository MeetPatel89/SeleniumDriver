package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriverUtil {
	
	private WebDriver _driver;
	
	public SeleniumDriverUtil() {
		_driver = launchDriver();
	}
	
	public static WebDriver launchDriver() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		return driver;
	}
	
	public void launchBrowser(String url) {
		_driver.navigate().to(url);
	}
	
	public WebElement findElementById(String id) {
		WebElement element = _driver.findElement(By.id(id));
		return element;
	}
	
	public WebElement findElementByXPath(String xpath) {
		WebElement element = _driver.findElement(By.xpath(xpath));
		return element;
	}
	
	public void quitDriver() {
		_driver.quit();
	}

	public WebDriver get_driver() {
		return _driver;
	}

	public void set_driver(WebDriver _driver) {
		this._driver = _driver;
	}
}	

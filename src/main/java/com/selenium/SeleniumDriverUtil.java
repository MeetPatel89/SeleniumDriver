package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriverUtil {
	
	public static WebDriver launchDriver() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		return driver;
	}
	
	public static WebDriver launchBrowser(String url) {
		WebDriver driver = launchDriver();
		driver.navigate().to(url);
		return driver;
	}
}

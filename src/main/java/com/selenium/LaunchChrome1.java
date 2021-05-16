package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/nautilusshell/Documents/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}
}

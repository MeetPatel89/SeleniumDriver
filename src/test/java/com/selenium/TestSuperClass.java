package com.selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class TestSuperClass {
	
  protected WebDriver driver;

@BeforeTest
  public void setUp() {
	 driver = SeleniumDriverUtil.launchDriver();
	 driver.get("https://demoqa.com/select-menu");
	 driver.manage().window().maximize();
  }

@AfterTest
public void cleanUp() {
	driver.quit();
}
}

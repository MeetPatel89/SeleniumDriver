package com.selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
	
  @Test
  public void canLaunchBrowser() {
	  
	  String url = "https://demoqa.com/";
	  
	  WebDriver driver = SeleniumDriverUtil.launchBrowser(url);
	  assertEquals(driver.getCurrentUrl(), url);
	  driver.quit();
  }
}

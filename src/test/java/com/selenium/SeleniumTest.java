package com.selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SeleniumTest {
	
  @Test
  public void canLaunchBrowser() {
	  
	  String url = "https://demoqa.com/";
	  
	  WebDriver driver = SeleniumDriverUtil.launchBrowser(url);
	  assertEquals(driver.getCurrentUrl(), url);
	  driver.quit();
  }
  
  @Test
  public void canClickButtonAndGetResult() {
	  
	  String url = "https://demoqa.com/buttons";
	  String xpath = "//button[text()='Click Me']";
	  String id = "dynamicClickMessage";
	  
	  WebDriver driver = SeleniumDriverUtil.launchBrowser(url);
	  WebElement button = SeleniumDriverUtil.findElementByXPath(driver, xpath);
	  button.click();
	  
	  WebElement element = SeleniumDriverUtil.findElementById(driver, id);
	  String message = element.getText();
	  
	  assertEquals(message, "You have done a dynamic click");
	  driver.quit();
  }
  
}

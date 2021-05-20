package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NoPOMTestGoogleSearch {
	
  @Test
  public void f() {
	  WebDriver driver = SeleniumDriverUtil.launchDriver();
	  
	  driver.get("https://www.google.com");
	  
	  WebElement googleSearchBox = driver.findElement(By.name("q"));
	  
	  googleSearchBox.sendKeys("Text for NoPOMTestGoogleSearch");
	  
	  googleSearchBox.submit();
	  
	  driver.quit();
  }
}

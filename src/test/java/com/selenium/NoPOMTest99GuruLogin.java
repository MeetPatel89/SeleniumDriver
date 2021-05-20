package com.selenium;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NoPOMTest99GuruLogin {
	
  @Test
  public void testHomePageAppearCorrect() {
	  WebDriver driver = SeleniumDriverUtil.launchDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://demo.guru99.com/V4/");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.name("uid")).sendKeys("mngr327777");
	  
	  driver.findElement(By.name("password")).sendKeys("zYreheq");
	  
	  driver.findElement(By.name("btnLogin")).click();
	  
	  assertEquals(driver.getCurrentUrl(), "http://demo.guru99.com/V4/manager/Managerhomepage.php");
	  
	  driver.quit();
  }
}

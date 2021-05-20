package com.selenium;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test99GuruLogin {

	private WebDriver _driver;
	private Guru99LoginPage objLogin;
	private Guru99HomePage objHomePage;

	@BeforeTest
	public void setUp() {
		_driver = SeleniumDriverUtil.launchDriver();

		_driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		_driver.get("http://demo.guru99.com/V4/");
		
		objLogin = new Guru99LoginPage(_driver);
		
		objHomePage = new Guru99HomePage(_driver);
	}

	@AfterTest
	public void cleanUP() {
		_driver.quit();
		objLogin = null;
		objHomePage = null;
	}

	@Test
	public void testGetTitleLoginPage() {

		String loginPageTitle = objLogin.getTitleLoginPage();
		assertEquals(loginPageTitle, "Guru99 Bank");
	}
	
	@Test
	public void loginAndTestHomePageUserName() {
		objLogin.loginToGuru99("mngr327777", "zYreheq");
		
		assertNotNull(objHomePage.getTableElementWithUserNameText());
	}
	
	
}

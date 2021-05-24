package com.selenium;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectDropDownMenuTests extends TestSuperClass {
	
	private SelectPage selectPageObject;

	@BeforeClass
	public void instantiateSelectPage() {
		selectPageObject = new SelectPage(driver);
	}
	
  @Test
  public void canSelectValueFromOldStyleDropDownList () {
	  String valueToSelect = "Purple";
	 
	  String textSelected = selectPageObject.navigateToPageSelectDropDownGetDropDown(valueToSelect);
	  
	  assertEquals(textSelected, valueToSelect);
  }
}

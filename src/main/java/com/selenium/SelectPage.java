package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class SelectPage extends PageSuperClass {
	
	@FindBy(how=How.ID, using="oldSelectMenu")
	WebElement oldSelectMenu;
	
	Select oldStyleDropDownList;
	
	String pageURL = "https://demoqa.com/select-menu";

	public SelectPage(WebDriver driver) {
		super(driver);
	}
	
	public SelectPage selectValueFromDropDownList(String valueToSelect) {
		
		oldStyleDropDownList = new Select(oldSelectMenu);
		oldStyleDropDownList.selectByVisibleText(valueToSelect);
		
		return this;
	}
	
	public String getSelectedValueFromDropDownList() {
		return oldStyleDropDownList.getFirstSelectedOption().getText();
	}
	
	public String navigateToPageSelectDropDownGetDropDown(String valueToSelect) {
		return ((SelectPage)this.navigate(pageURL))
				.selectValueFromDropDownList(valueToSelect)
				.getSelectedValueFromDropDownList();
	}
	
}

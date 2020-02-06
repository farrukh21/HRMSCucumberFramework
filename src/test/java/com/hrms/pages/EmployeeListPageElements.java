
package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class EmployeeListPageElements {
	@FindBy(id = "empPic")
	public WebElement empPic;

	public EmployeeListPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
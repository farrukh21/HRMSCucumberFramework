package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class AddEmployeePageElements {
	@FindBy(id = "firstName")
	public WebElement firstName;
	@FindBy(id = "middleName")
	public WebElement middleName;
	@FindBy(id = "lastName")
	public WebElement lastName;
	@FindBy(id = "btnSave")
	public WebElement saveButton;
	@FindBy(id="employeeId")
	public WebElement ID;
	@FindBy(xpath="//span[text()='Required']")
	public WebElement errMsg;

	public AddEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}

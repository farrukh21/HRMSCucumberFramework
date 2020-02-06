package com.hrms.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class DashboardPageElements extends CommonMethods {

	@FindBy(linkText = "Leave")
	public WebElement leaveLink;
	@FindBy(linkText = "Leave List")
	public WebElement leaveList;

	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement pim;
	@FindBy(linkText = "Add Employee")
	public WebElement addEmp;
	
	@FindBy(xpath ="//h1[text()='Dashboard']")
	public WebElement Dashlogo;
	
	@FindBy(id = "welcome")
	public WebElement welcomeLnk;

	public DashboardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
		
	}
	public void navigateToLeaveList() {
		click(leaveList);
		click(leaveList);
	}
	public void navigateToAddEmployee() {
		click(pim);
		click(addEmp);
	}
}


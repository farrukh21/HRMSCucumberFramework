package com.hrms.pages;


	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

	public class PersonalDetailsPageElements {
		@FindBy(id="empPic")
		public WebElement empPicture;
		
		@FindBy(xpath="//div[@id='profile-pic']/h1")
		public WebElement nameOnPicture;
		
		@FindBy(id="personal_txtEmployeeId")
		public WebElement empId;
		
		@FindBy(id="btnSave")
		public WebElement EditSave;
		
		@FindBy(id="personal_txtLicenNo")
		public WebElement DrivingLicense;
		
		@FindBy(id="personal_txtNICNo")
		public WebElement SSN;
		
		@FindBy(id="personal_txtSINNo")
		public WebElement SIN;
		
		@FindBy(id="personal_optGender_1")
		public WebElement Male;
		
		@FindBy(id="personal_optGender_2")
		public WebElement Female;
		
		@FindBy(id="personal_cmbMarital")
		public WebElement maritalStatus;
		
		@FindBy(id="personal_cmbNation")
		public WebElement Nationality;
		
		@FindBy(xpath="//input[@id='personal_txtLicExpDate']")
		public WebElement LicenseExp;
		
		@FindBy(xpath="//input[@id='personal_DOB']")
		public WebElement DOB; 
		
		public PersonalDetailsPageElements() {
			PageFactory.initElements(BaseClass.driver, this);
		}
	}


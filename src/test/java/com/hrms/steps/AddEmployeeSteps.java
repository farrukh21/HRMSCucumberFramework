package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmployeeSteps extends CommonMethods {
	String empId;


	@Given("I am logged into HRMS")
	public void i_am_logged_into_HRMS() {
		
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	}

	@Given("I navigated to Add Employee Page")
	public void i_navigated_to_Add_Employee_Page() {
		dash.navigateToAddEmployee();
	}

	@When("I add {string}, {string} and {string}")
	public void i_add_and(String fName, String mName, String lName) {
		sendText(addemp.firstName, fName);
		sendText(addemp.middleName, mName);
		sendText(addemp.lastName, lName);
		String firstName = addemp.firstName.getAttribute("value");
		String middleName = addemp.middleName.getAttribute("value");
		String lastName = addemp.lastName.getAttribute("value");
		String fullname = firstName + " " + middleName + " " + lastName;
		System.out.println("a" + fullname);

	}

	@When("I click Save")
	public void i_click_Save() {
		click(addemp.saveButton);
	}

	@Then("I see Employee has been succesfully added")
	public void i_see_Employee_has_been_succesfully_added() {
		Boolean a = dtls.empPicture.isDisplayed();
		Assert.assertTrue(a);

	}

	@Then("I see Employee with {string}, {string} and {string} is displayed")
	public void i_see_Employee_with_and_is_displayed(String fName, String mName, String lName) {
		String a = dtls.nameOnPicture.getText();
		String actualname = fName + " " + mName + " " + lName;
		Assert.assertEquals(a, actualname);

//		waitForVisibility(dtls.nameOnPicture);
//		String n = dtls.nameOnPicture.getText();
//		System.out.println(n);

	}

	@When("I delete employee id")
	public void i_delete_employee_id() {
		addemp.ID.clear();
	}

	@Then("I see required error message next to the first and last name")
	public void i_see_required_error_message_next_to_the_first_and_last_name() {
		Boolean b = addemp.errMsg.isDisplayed();
		Assert.assertEquals("no error message displayed", b);
	}

	
	
	
	
	@When("I add enter employee details")
	public void i_add_enter_employee_details(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> a = dataTable.asMaps();
		for (Map<String, String> b : a) {
			sendText(addemp.firstName, b.get("FirstName"));
			sendText(addemp.middleName, b.get("MiddleName"));
			sendText(addemp.lastName, b.get("LastName"));

		}

	}

	@When("I click on Edit")
	public void i_click_on_Edit() {
		click(dtls.EditSave);
	}

	@Then("I am able to modify Employee Details")
	public void i_am_able_to_modify_Employee_Details(io.cucumber.datatable.DataTable empDetails) {
		List<Map<String, String>> empDetailList = empDetails.asMaps();

		for (Map<String, String> map : empDetailList) {
			sendText(dtls.DrivingLicense, map.get("DriverLisence"));
			sendText(dtls.LicenseExp, map.get("ExpirationDate"));
			sendText(dtls.SSN, map.get("SSN"));
			sendText(dtls.SIN, map.get("SIN"));
			if (map.get("Gender").equalsIgnoreCase("male")) {
				click(dtls.Male);
			} else if (map.get("Gender").equalsIgnoreCase("female")) {
				click(dtls.Female);
			} else {
				System.out.println("Enter valid gender");
			}
			
			selectDdValue(dtls.maritalStatus, map.get("MaritalStatus"));
			selectDdValue(dtls.Nationality, map.get("Nationality"));
			sendText(dtls.DOB, map.get("DOB"));
			click(dtls.EditSave);
			click(dtls.EditSave);
		}

	}

}
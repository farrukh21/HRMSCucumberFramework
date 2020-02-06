package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.EmployeeListPageElements;
import com.hrms.pages.LeaveListPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;

public class PageInitializer extends BaseClass {
	public static LoginPageElements login;
	public static DashboardPageElements dash;
	public static AddEmployeePageElements addemp;
	public static LeaveListPageElements leaveList;
	public static PersonalDetailsPageElements dtls;
	public static EmployeeListPageElements empList;
	
	public static void initializeAllPage() {
	
		login= new LoginPageElements();
		dash= new DashboardPageElements();
		addemp= new AddEmployeePageElements();
		leaveList= new LeaveListPageElements();
		dtls= new PersonalDetailsPageElements();
		empList= new EmployeeListPageElements();
		
	}

}

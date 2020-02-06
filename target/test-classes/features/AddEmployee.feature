@sprint2 @addemployee
Feature: AddEmployee

  Background: 
    Given I am logged into HRMS
    And I navigated to Add Employee Page

  
  @smoke
  Scenario: Add new Employee
  When I add "John", "S" and "Smith"
  And I click Save
  Then I see Employee has been succesfully added
  
  @regression
  Scenario Outline: Add new Employee
  When I add "<FirstName>", "<MiddleName>" and "<LastName>"
  And I click Save
  Then I see Employee with "<FirstName>", "<MiddleName>" and "<LastName>" is displayed
  
  Examples:
  | FirstName | MiddleName | LastName |
  | James     | j          | Smith    |
  | Jane      | J          | Smith    |
  | Sasha     | J          | Smith    |
  | David     | J          | Smith    |
  
  
  	@smoke
  Scenario: Add Employee without employee id
  When I add "John", "S" and "Smith"
  And I delete employee id
  And I click Save
  Then I see Employee has been succesfully added
  
  			@smoke
  Scenario: Add Employee negative scenario
  When I click Save
  Then I see required error message next to the first and last name
  #
  #Scenario: AddEmployee and Login Credentials
  #When I add firstName, middleName and last name
  #And I click on create login checkbox
  #And I enter username, password and confirm password
  #When I click Save
  #Then I see Employee has been succesfully added
  
  @inProgress
  Scenario: Add and Modify Employee Details
    When I add enter employee details
      | FirstName | MiddleName | LastName |
      | John      | J          | Smith    |
    And I click Save
    And I click on Edit
    Then I am able to modify Employee Details
      | DriverLisence | ExpirationDate | SSN         | SIN     | Gender | MaritalStatus | Nationality | DOB        |
      | N78787886     | 2021-12-08     | 123-45-6789 | 7687687 | Male   | Other         | Afghan      | 1980-10-10 |
      | Nhkjkgkhgkg   | 2018-12-08     | yiy-45-6789 | uyiy    | Female | Married       | Burmese     | 1980-10-10 |

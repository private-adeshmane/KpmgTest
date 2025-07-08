Feature: Add and Verify New Employee

  Scenario Outline: Admin adds a new employee and verifies the employee appears in
  the list

    Given I am on the OrangeHRM login page
    When I log in with username <username> and password <password>;

    Examples:
    |username|password|
    |admin   |admin123|
package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.AddEmployee;

public class EmployeeSteps {

    AddEmployee employeePage = new AddEmployee();

    @Given("I am on the OrangeHRM login page")
    public void launchLogin(){
        employeePage.launchLogin();
    }

    @When("I log in with username {} and password {}")
    public void login(String userName, String password){
        employeePage.login(userName,password);
    }
}

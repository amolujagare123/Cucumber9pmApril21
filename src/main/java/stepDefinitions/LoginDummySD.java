package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDummySD {

    @Given("I am on Login page of billing")
    public void i_am_on_login_page_of_billing() {

        System.out.println("I am on Login page of billing");

    }

   /* @When("I enter {string} and {string} for billing page")
    public void i_enter_and_for_billing_page(String username, String password) {

        System.out.println("username:"+username);

        System.out.println("password:"+password);

    }*/

    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\" for billing page$")
    public void i_enter_something_and_something_for_billing_page(String username, String password)  {

        System.out.println("username:"+username);

        System.out.println("password:"+password);
    }

    @When("I click on login button of billing page")
    public void i_click_on_login_button_of_billing_page() {

        System.out.println("I click on login button of billing page");
    }

    @Then("I should be redirected to the home page of billing application")
    public void i_should_be_redirected_to_the_home_page_of_billing_application() {


        System.out.println("I should be redirected to the home page of billing application");
    }

    @Then("There should be an another error message")
    public void there_should_be_an_another_error_message() {
        System.out.println("There should be an another error message");
    }

    @Then("There should be an error message")
    public void there_should_be_an_error_message() {
        System.out.println("There should be an error message");
    }
}

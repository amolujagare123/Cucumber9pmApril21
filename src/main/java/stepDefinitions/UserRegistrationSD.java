package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class UserRegistrationSD {

    @Given("^We are on user info page$")
    public void we_are_on_user_info_page() {
        System.out.println("We are on user info page");
    }

    @When("^we enter below data$")
    public void we_enter_below_data(DataTable dataTable) {

        List<String> data = dataTable.asList();

        System.out.println("Name:"+data.get(0));
        System.out.println("Email:"+data.get(1));
        System.out.println("Phone:"+data.get(2));
        System.out.println("City:"+data.get(3));

    }

    @Then("^data should be saved$")
    public void data_should_be_saved()  {
        System.out.println("data should be saved");
    }

    @And("^click on submit button$")
    public void click_on_submit_button()  {
        System.out.println("click on submit button");
    }
}

package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStockSD {


    @Given("^Open browser$")
    public void open_browser() throws Throwable {
        System.out.println("-----------open browser -------->>>");
    }

    @And("^maximize it$")
    public void maximize_it() throws Throwable {
        System.out.println("-----------Maximize it -------->>>");
    }


    @Given("^I am on Login page of stock$")
    public void i_am_on_login_page_of_stock()  {

        System.out.println("I am on Login page of stock");
    }

    @When("^I enter (.+) and (.+) for stock page$")
    public void i_enter_and_for_stock_page(String username, String password) {

        System.out.println("stock page username:"+username);
        System.out.println("stock page password:"+password);

    }

    @And("^I click on login button of stock page$")
    public void i_click_on_login_button_of_stock_page()  {
        System.out.println("I click on login button of stock page");
    }

}

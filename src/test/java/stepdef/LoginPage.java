package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login;

public class LoginPage extends Login {

    @Given("User navigates to the practise automation website")
    public void user_navigates_to_the_practise_automation_website() {
        practice_test();
    }

    @Given("User successfully enter login credentials")
    public void user_successfully_enter_login_credentials() {
        enter_username();
        enter_password();
    }

    @Given("User clicks on Submit button")
    public void user_clicks_on_submit_button() {
        click_submit();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}

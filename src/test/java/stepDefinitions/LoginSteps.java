package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("the user is on the login page")
    public void userIsOnLoginPage() {
    }

    @When("the user enters an invalid {string} and {string}")
    public void userEntersInvalidCredentials(String emailAddress, String password) {
    }

    @And("clicks the {string} button")
    public void userClicksButton(String button) {
    }

    @Then("the user is {string} login and should see an error message")
    public void verifyLoginStatusAndErrorMessage(String loginStatus) {
    }

    @Then("the user is {string} login and navigated to the home page")
    public void verifyLoginStatusAndNavigateToHomePage(String loginStatus) {
    }

    @Then("user is redirected to the registration page")
    public void userIsRedirectedToRegistrationPage() {
    }

}

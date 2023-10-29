package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {
    @Given("user is on registration page")
    public void userIsOnRegistrationPage() {
    }

    @When("user fills the registration form with {string}, {string}, {string}, {string}, and {string}")
    public void userFillsRegistrationForm(String firstName, String lastName, String emailAddress, String password, String confirmPassword) {
    }

    @And("click on {string} button")
    public void userClicksButton(String button) {
    }

    @Then("user should see errors messages under each required field")
    public void verifyErrorMessages() {
    }

    @Then("user is redirected to the account page")
    public void userIsRedirectedToAccountPage() {
    }
}

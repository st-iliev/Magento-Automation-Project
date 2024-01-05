package stepDefinitions;

import com.magneto.pages.BasePage;
import com.magneto.pages.MyAccountPage;
import com.magneto.pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class RegistrationSteps {
    private WebDriver driver;
    private BasePage basePage;
    private RegistrationPage registrationPage;
    private MyAccountPage myAccountPage;

    //Background of Registration functionality
    @Given("the user is on registration page")
    public void givenUserIsOnRegistrationPage() {
        basePage.clickOnACreateAnAccount();
    }

    // Scenario : Registration a new user is unsuccessful without credentials
    @When("the user leaves the registration form blank")
    public void whenUserLeavesRegistrationFormBlank() {
        registrationPage.fillRegistrationForm("","","","","");
    }
    @And("clicks on the \"Create an Account\" button")
    public void userClicksCreateAccountButton() {
        registrationPage.clickOnCreateAccountButton();
    }
    @Then("the user should see an error message \"This is a required field.\" under required fields")
    public void thenUserShouldSeeErrorMessagesUnderRequiredFields() {
        Assert.assertEquals("This is a required field.",registrationPage.getRequiredMessageForFirstNameField());
        Assert.assertEquals("This is a required field.",registrationPage.getRequiredMessageForLastNameField());
        Assert.assertEquals("This is a required field.",registrationPage.getRequiredMessageForEmailField());
        Assert.assertEquals("This is a required field.",registrationPage.getRequiredMessageForPasswordField());
        Assert.assertEquals("This is a required field.",registrationPage.getRequiredMessageForConfirmPasswordField());
    }

    // Scenario Outline: Registration a new user is successful with valid credentials
    @When("the user fills \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\" and \"(.*)\" fields")
    public void whenUserFillsRegistrationForm(String firstName, String lastName, String emailAddress, String password, String confirmPassword) {
        registrationPage.fillRegistrationForm(firstName, lastName, emailAddress, password, confirmPassword);
    }
    @Then("the user is redirected to account page")
    public void thenUserIsRedirectedToAccountPage() {
        Assert.assertEquals(driver.getCurrentUrl(),myAccountPage.getPageURL());
    }

    //Scenario Outline: Registration a new user with missing credential

}

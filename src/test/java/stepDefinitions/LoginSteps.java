package stepDefinitions;

import com.magneto.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    private BasePage basePage;
    private HomePage homePage;
    private LoginPage loginPage;
    private ForgotPasswordPage forgotPasswordPage;
    private RegistrationPage registrationPage;

    // Background of Login functionality
    @Given("the user is on the login page")
    public void userIsOnLoginPage() {
        basePage.clickOnSignIn();
    }

    // Scenario Outline : Unsuccessful login with invalid credentials
    @When("the user enters an invalid \"(.*)\" and \"(.*)\"")
    public void userEntersInvalidCredentials(String emailAddress, String password) {
        loginPage.fillSignInForm(emailAddress,password);
    }
    @And("clicks the \"Sign In\" button")
    public void userClicksSignInButton() {
        loginPage.clickOnSigninButton();
    }
    @Then("the user is unsuccessful login and should see an error message")
    public void verifyUnsuccessfulLogin() {
       Assert.assertEquals(basePage.getPageMessage(),"The account sign-in was incorrect or your account is disabled temporarily. " +
               "Please " +
               "wait and try again later.");
    }

    // Scenario: Unsuccessful login without credentials
    @When("the user leavs login form blank")
    public void userLeavesLoginFormBlank() {
        loginPage.fillSignInForm("","");
    }
    @Then("the user should see an messages \"This is a required field.\" under email and password fields")
    public void verifyErrorMessages() {
        Assert.assertEquals(loginPage.getRequiredMessageForEmailField(),"This is a required field.");
        Assert.assertEquals(loginPage.getRequiredMessageForPasswordField(),"This is a required field.");
    }

    // Scenario Outline : Successful login with valid credentials
    @When("the user enters \"(.*)\" and \"(.*)\"")
    public void userEntersValidCredentials(String emailAddress, String password) {
        loginPage.fillSignInForm(emailAddress, password);
    }
    @Then("the user is navigated to the home page")
    public void verifySuccessfulLogin() {
        Assert.assertEquals(basePage.driver.getCurrentUrl(),homePage.getPageURL());
    }
    @And("welcome message with user's first and last name is appear in top right corner")
    public void verifyWelcomeMessage() {
        Assert.assertEquals("Welcome, Ron Vezov!",homePage.userIsLogin());
    }

    //Scenario :  Successful redirection user to the registration page
    @When("the user clicks on the \"Create an Account\" button")
    public void userClicksCreateAccountButton() {
        loginPage.clickOnCreateAnAccount();

    }
    @Then("the user is redirected to registration page")
    public void verifyRedirectionToRegistrationPage() {
        Assert.assertEquals(basePage.driver.getCurrentUrl(),registrationPage.getPageURL());
    }

    // Scenario: Successful redirection user to the forgot password page
    @When("the user clicks on the \"Sign InForgot Your Password\" hyperlink")
    public void userClicksForgotPasswordLink() {
        loginPage.clickOnForgotYourPassword();
    }

    @Then("the user is redirected to forgotpassword page")
    public void verifyRedirectionToFoorgotPasswordPage() {
        Assert.assertEquals(basePage.driver.getCurrentUrl(),forgotPasswordPage.getPageURL());
    }

}

package StepDefinitions;

import Pages.BasePage;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class BasePageSteps {
    private WebDriver driver;
    private BasePage basePage;
    private HomePage homePage;
    @Given("the user is logged in")
    public void the_user_is_logged_in() {
    }
    @When("the user clicks on the {string}")
    public void the_user_clicks_on_the(String string) {
    }
    @When("the user clicks on the {string} link")
    public void the_user_clicks_on_the_link(String string) {
    }
    @Then("the user should be on the My Wish List page")
    public void the_user_should_be_on_the_my_wish_list_page() {
    }

}

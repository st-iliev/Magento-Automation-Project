package Pages;

import Utilities.Credentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    @Override
    public String getPageURL() {
        return "https://magento.softwaretestingboard.com/customer/account/login";
    }
    protected By pageTitle = By.xpath("//*[@data-ui-id='page-title-wrapper']");
    protected By alertMsg = By.xpath(("//*[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
    protected By loginFormTitle = By.id("block-customer-login-heading");
    protected By emailField = By.id("email");
    protected By emailFieldErrorMsg = By.id("email-error");
    protected By passwordField = By.id("pass");
    protected By passwordFieldErrorMsg = By.id("pass-error");
    protected By signInButton = By.id("send2");
    protected By forgotPassowrdLink = By.xpath("//*[@class='action remind']");
    protected By registrationFormTitle = By.id("block-new-customer-heading");
    protected By createAnAccountButton = By.cssSelector(".action.create.primary");

    public void fillSignInForm(String email,String password) {
        sendKeys(emailField, email);
        sendKeys(passwordField,password);
    }
    public void createAnAccount(){
        click(createAnAccountButton);
    }
    public void clickOnSigninButton(){
        click(signInButton);
    }
    public void clearSignInForm(){
        clear(emailField);
        clear(passwordField);
    }
}

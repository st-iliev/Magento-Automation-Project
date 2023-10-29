package Pages;

import org.openqa.selenium.By;

public class RegistrationPage extends BasePage{
    @Override
    public String getPageURL() {
        return "https://magento.softwaretestingboard.com/customer/account/create/";
    }
    protected By pageTitle = By.xpath("//*[@data-ui-id='page-title-wrapper']");
    protected By personInformationTitle = By.xpath("//*[@class='fieldset create info']//*[@class='legend']/span");
    protected By firstNameField = By.id("firstname");
    protected By firstNameFieldErrorMsg = By.id("firstname-error");
    protected By lastNameField = By.id("lastname");
    protected By lastNameFieldErrorMsg = By.id("lastname-error");
    protected By signInInformationTitle = By.xpath("//*[@class='fieldset create account']//*[@class='legend']/span");
    protected  By emailField = By.id("email");
    protected  By emailFieldErrorMsg = By.id("email_address-error");
    protected  By passwordField = By.id("password");
    protected  By passwordFieldPasswordStrengthMsg = By.id("password-strength-meter-label");
    protected  By passwordFieldErrorMsg= By.id("password-error");
    protected  By confirmPasswordField = By.id("password-confirmation");
    protected  By confirmPasswordFieldErrorMsg = By.id("password-confirmation-error");
    protected By createAnAccountButton = By.cssSelector(".action.submit.primary");
    public void clearRegistrationForm(){
        clear(firstNameField);
        clear(lastNameField);
        clear(emailField);
        clear(passwordField);
        clear(confirmPasswordField);
    }
    public void fillRegistrationForm(String firstName,String lastName,String email,String password,String confirmPassword){
        sendKeys(firstNameField,firstName);
        sendKeys(lastNameField,lastName);
        sendKeys(emailField,email);
        sendKeys(passwordField,password);
        sendKeys(confirmPasswordField,confirmPassword);
    }
    public void clickOnCreateAccountButton(){
        click(createAnAccountButton);
    }
}

package com.magneto.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    @Override
    public String getPageURL() {
        return "https://magento.softwaretestingboard.com/customer/account/login";
    }
    private By pageTitle = By.cssSelector(".base");
    protected By alertMsg = By.xpath(("//*[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
    protected By loginFormTitle = By.id("block-customer-login-heading");
    protected By loginFormText = By.cssSelector(".field.note");
    protected By emailField = By.id("email");
    protected By emailFieldErrorMsg = By.id("email-error");
    protected By passwordField = By.id("pass");
    protected By passwordFieldErrorMsg = By.id("pass-error");
    protected By signInButton = By.id("send2");
    protected By forgotPassowrdLink = By.linkText("Forgot Your Password?");
    protected By registrationFormTitle = By.id("block-new-customer-heading");
    protected By registrationFormText = By.xpath("//p[contains(text(),'Creating an account has many benefits:')]");
    protected By createAnAccountButton = By.cssSelector(".action.create.primary");

    public void fillSignInForm(String email,String password) {
        sendKeys(emailField, email);
        sendKeys(passwordField,password);
    }
    public void clickOnCreateAnAccount(){
        click(createAnAccountButton);
    }
    public void clickOnSigninButton(){
        click(signInButton);
    }
    public void clickOnForgotYourPassword(){
        click(forgotPassowrdLink);
    }
    public void clearSignInForm(){
        clear(emailField);
        clear(passwordField);
    }
}

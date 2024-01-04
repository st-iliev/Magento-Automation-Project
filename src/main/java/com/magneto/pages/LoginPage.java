package com.magneto.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    @Override
    public String getPageURL() {
        return "https://magento.softwaretestingboard.com/customer/account/login";
    }
    private By pageTitle = By.cssSelector(".base");
    private By loginFormTitle = By.id("block-customer-login-heading");
    private By loginFormText = By.cssSelector(".field.note");
    private By emailField = By.id("email");
    private By emailFieldErrorMsg = By.id("email-error");
    private By passwordField = By.id("pass");
    private By passwordFieldErrorMsg = By.id("pass-error");
    private By signInButton = By.id("send2");
    private By forgotPassowrdLink = By.linkText("Forgot Your Password?");
    private By registrationFormTitle = By.id("block-new-customer-heading");
    private By registrationFormText = By.xpath("//p[contains(text(),'Creating an account has many benefits:')]");
    private By createAnAccountButton = By.cssSelector(".action.create.primary");

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
    public String getRequiredMessageForEmailField(){
        return getText(emailFieldErrorMsg);
    }
    public String getRequiredMessageForPasswordField(){
        return getText(emailFieldErrorMsg);
    }
}

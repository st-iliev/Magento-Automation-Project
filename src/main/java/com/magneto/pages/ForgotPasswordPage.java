package com.magneto.pages;

import org.openqa.selenium.By;

public class ForgotPasswordPage extends BasePage {
    private By pageTitle = By.cssSelector(".base");
    private By formText = By.cssSelector(".field.note");
    private By emailField = By.id("email_address");
    private By emailFieldErrorMessage = By.id("email_address-error");
    private By resetMyPasswordButton = By.cssSelector("button[class='action submit primary']");
    @Override
    public String getPageURL() {
        return "https://magento.softwaretestingboard.com/customer/account/forgotpassword/";
    }
    public void fillEmailAddress(String value){
        sendKeys(emailField,value);
    }
    public void clickOnResetMyPasswordButton(){
        click(resetMyPasswordButton);
    }
}

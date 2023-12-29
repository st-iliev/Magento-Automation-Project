package com.magneto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckoutPage extends BasePage{
    //Shipping Address
    //When user is not login
    private By signInLink = By.linkText("Sign In");
    private By emailAddressField = By.id("customer-email");
    private By passwordField = By.id("customer-password");
    private By loginButton = By.linkText("Login");
    private By forgotPasswordLink = By.linkText("Forgot Your Password?");

    private By formTitle = By.linkText("Shipping Address");
    private By firstNameField = By.xpath("//input[@name='firstname']");
    private By firstNameErrorMessage = By.xpath("//input[@name='firstname']/following-sibling::div");
    private By lastNameField = By.xpath("//input[@name='lastname']");
    private By lastNameErrorMessage = By.xpath("//input[@name='lastname']/following-sibling::div");
    private By companyField = By.xpath("//input[@name='company']");
    private By streetAddress1Field = By.xpath("//input[@name='street[0]']");
    private By streetAddress1ErrorMessage = By.xpath("//input[@name='street[0]']/following-sibling::div");
    private By streetAddress2Field = By.xpath("//input[@name='street[1]']");
    private By streetAddress3Field = By.xpath("//input[@name='street[2]']");
    private By cityField = By.xpath("//input[@name='city']");
    private By cityErrorMessage = By.xpath("//input[@name='city']/following-sibling::div");
    private By stateProvinceDropDown = By.xpath("//input[@name='region_id']");
    private By stateProvinceErrorMessage = By.xpath("//input[@name='region_id']/following-sibling::div");
    private By zipPostalCodeField = By.xpath("//input[@name='postcode']");
    private By zipPostalCodeErrorMessage = By.xpath("//input[@name='postcode']/following-sibling::div");
    private By countryDropDown = By.xpath("//input[@name='country_id']");
    private By countryErrorMessage = By.xpath("//input[@name='country_id']/following-sibling::div");
    private By phoneNumberField = By.xpath("//input[@name='telephone']");
    private By phoneNumberErrorMessage = By.xpath("//input[@name='telephone']/following-sibling::div");
    private By shippingMethodTitle = By.linkText("Shipping Methods");
    private By tableRateRadio = By.xpath("//input[@name='ko_unique_3']");
    private By fixedRadio = By.xpath("//input[@name='ko_unique_4']");
    private By missingShippingMethodWarningMsg = By.xpath("//*[@data-bind='text: errorValidationMessage()']");

    //When user is login
    //using same locators when user is not login
    private By shippingAddressInformation = By.xpath("//*[@class='shipping-address-item selected-item']");
    private By newAddressButton = By.xpath("//button[@class='action action-show-popup']");
    private By saveInAddressBookCheckBox = By.id("shipping-save-in-address-book");
    private By shipHereButton = By.xpath("//button[@class='action primary action-save-address']");
    private By cancelButton = By.xpath("//button[@class='action secondary action-hide-popup']");

    private By nextButton = By.linkText("Next");


    //Payment Method - Form
    private By addressComfirm = By.id("billing-address-same-as-shipping-checkmo");
    private By placeOrderButton = By.linkText("Place Order");
    private By applyDiscountCode = By.id("block-discount-heading");
    private By invalidDiscountCodeErrorMessage = By.xpath("//*[@data-ui-id='checkout-cart-validationmessages-message-error']");
    private By discountCodeField = By.id("discount-code");
    private By discountCodeErrorMessage = By.id("discount-code-error");
    private By applyDiscountButton = By.linkText("Apply Discount");

    //Order Summary
    private By orderSummaryTitle = By.linkText("Order Summary");
    private By countOfProductsInCart = By.xpath("//*[@data-bind='text: getCartSummaryItemsCount()']");
    private By productsInOrder = By.className("minicart-items");
    private List<WebElement> products = finds(productsInOrder);
    //Ship To
    private By shipToText = By.linkText("Ship To:");
    private By shipToEditIcon = By.xpath("//button[@data-bind = 'click: back']");
    private By shippingInformation = By.className("shipping-information-content");
    //Shipping Method
    private By shippingMethodText = By.linkText("Shipping Method:");
    private By shippingMethodEditIcon = By.xpath("//button[@data-bind = 'click: backToShippingMethod']");
    private By shippingMethodInformation = By.xpath("//*[@data-bind='text: getShippingMethodTitle()']");
    // Successful purchase
    // orderNumberText element exist only if user is login
    private By orderNumberText = By.xpath("//*[@class='checkout-success']/p[1]");
    private By orderNumber = By.className("order-number");
    private By orderConfirmationText = By.xpath("//*[@class='checkout-success']/p[2]");
    private By countinueShopping = By.linkText("Continue Shopping");
    // printRecept element exist only if user is login
    private By printRecept = By.linkText("Print receipt");
    @Override
    public String getPageURL() {
        return "https://magento.softwaretestingboard.com/checkout/#payment";
    }

    //Number of products from Order Summary
    protected int GetCountOfAllProducts(){
        int totalCount = 0;
        for (var product : products){
            By quantityLocator = By.cssSelector(".product-item-details .details-qty .value");
            totalCount += Integer.parseInt(getText(quantityLocator));
        }
        return totalCount;
    }
}

package com.magneto.pages;

import org.openqa.selenium.By;
public class CheckoutPaymentPage extends BasePage{
    //Form
    private By addressComfirm = By.id("billing-address-same-as-shipping-checkmo");
    private By placeOrderButton = By.linkText("Place Order");
    private By discountCode = By.id("block-discount-heading");
    private By invalidDiscountCodeErrorMessage = By.xpath("//*[@data-ui-id='checkout-cart-validationmessages-message-error']");
    private By discountCodeField = By.id("discount-code");
    private By discountCodeErrorMessage = By.id("discount-code-error");
    private By applyDiscountButton = By.linkText("Apply Discount");

    @Override
    public String getPageURL() {
        return "https://magento.softwaretestingboard.com/checkout/#payment";
    }
}

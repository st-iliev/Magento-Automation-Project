package com.magneto.pages;

import org.openqa.selenium.By;

public class CheckoutSuccessPage extends BasePage{
    private By orderNumberText = By.xpath("//*[@class='checkout-success']/p[1]");
    private By orderNumber = By.className("order-number");
    private By orderConfirmationText = By.xpath("//*[@class='checkout-success']/p[2]");
    private By countinueShopping = By.linkText("Continue Shopping");
    private By printRecept = By.linkText("Print receipt");
    @Override
    public String getPageURL() {
        return "https://magento.softwaretestingboard.com/checkout/onepage/success/";
    }
}

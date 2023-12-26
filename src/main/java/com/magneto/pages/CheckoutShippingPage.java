package com.magneto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckoutShippingPage extends BasePage{
    //Shipping Address form
    private By formTitle = By.linkText("Shipping Address");
    private By firstNameField = By.id("Y79QYH7");
    private By firstNameErrorMessage = By.id("error-Y79QYH7");
    private By lastNameField = By.id("M44UWNH");
    private By lastNameErrorMessage = By.id("error-M44UWNH");
    private By companyField = By.id("GDMXBH4");
    private By streetAddress1Field = By.id("NAA4LUB");
    private By getStreetAddress1ErrorMessage = By.id("error-NAA4LUB");
    private By streetAddress2Field = By.id("LWCFPCC");
    private By streetAddress3Field = By.id("OS82PGV");
    private By cityField = By.id("S6PAMK3");
    private By cityErrorMessage = By.id("error-S6PAMK3");
    private By stateProvinceDropDown = By.id("RTKIV6C");
    private By getStateProvinceErrorMessage = By.id("error-TOVJU8P");
    private By zipPostalCodeField = By.id("GX05DI9");
    private By zipPostalCodeErrorMessage = By.id("error-GX05DI9");
    private By countryDropDown = By.id("QUAM19X");
    private By countryErrorMessage = By.id("error-QUAM19X");

    private By phoneNumberField = By.id("TIKE50P");
    private By phoneNumberErrorMessage = By.id("error-TIKE50P");
    private By questionMarkForPhoneNumberField = By.id("tooltip");

    private By shippingMethodTitle = By.linkText("Shipping Methods");
    private By tableRateRadio = By.xpath("//input[@name='ko_unique_3']");
    private By fixedRadio = By.xpath("//input[@name='ko_unique_4']");
    private By nextButton = By.linkText("Next");

    //Order
    private By orderSummaryTitle = By.linkText("Order Summary");
    private By countOfProductsInCart = By.xpath("//*[@data-bind='text: getCartSummaryItemsCount()']");
    private By productsInOrder = By.className("minicart-items");
    private List<WebElement> products = finds(productsInOrder);

    protected int GetCountOfAllProducts(){
        int totalCount = 0;
        for (var product : products){
            By quantityLocator = By.cssSelector(".product-item-details .details-qty .value");
            totalCount += Integer.parseInt(getText(quantityLocator));
        }
        return totalCount;
    }
    @Override
    public String getPageURL() {
        return "https://magento.softwaretestingboard.com/checkout/#shipping";
    }
}

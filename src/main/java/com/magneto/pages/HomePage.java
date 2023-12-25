package com.magneto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class HomePage extends BasePage{
    private By yogaCollection = By.className("block-promo home-main");
    private By pants = By.className("block-promo home-pants");
    private By tshirts = By.className("block-promo home-t-shirts");
    private By erinFavorites = By.className("bblock-promo home-erin");
    private By performanceCollection = By.className("block-promo home-performance");
    private By ecoCollection = By.className("block-promo home-eco");
    private By hotSellersTitleText = By.className("content-heading");
    private By productItems = By.cssSelector(".product-items.widget-product-grid");
    private List<WebElement> products = finds(productItems);

    @Override
    public String getPageURL() {
        return "https://magento.softwaretestingboard.com/";
    }

}

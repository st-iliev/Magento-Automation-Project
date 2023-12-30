package com.magneto.pages;

import org.openqa.selenium.By;

public class MenPage extends BasePage{
    private By menCollectionBanner = By.className("block-promo mens-main");
    private By lumaMenTeesBanner = By.className("block-promo mens-t-shirts");
    private By menPantsBanner = By.className("block-promo mens-pants");
    private By menShortsBanner = By.className("block-promo mens-category-shorts");
    private By menTeesBanner = By.className("block-promo mens-category-tees");
    private By menHoodiesBanner = By.className("block-promo mens-category-hoodies");

    @Override
    public String getPageURL() {
        return "https://magento.softwaretestingboard.com/men.html";
    }
}

package com.magneto.pages;

import org.openqa.selenium.By;

    public class WomenPage extends BasePage{
    private  By yogaCBanner = By.className("block-promo womens-main");
    private  By womenTeesBanner = By.className("block-promo womens-t-shirts");
    private  By womenPantsBanner = By.className("block-promo womens-pants");
    private  By erinRecommendsBanner = By.className("block-promo womens-erin");
    private  By womenYogaPansBanner = By.className("block-promo womens-category-pants");
    private  By womenShortsBanner = By.className("block-promo womens-category-shorts");
    private  By womenBrasBanner = By.className("block-promo womens-category-tanks");

    @Override
    public String getPageURL() {
        return "https://magento.softwaretestingboard.com/women.html";
    }
}

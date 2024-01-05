package com.magneto.pages;

import org.openqa.selenium.By;

public class GearPage extends BasePage{
    private  By yogaBanner = By.className("block-promo gear-main");
    private By fitnessBanner = By.className("block-promo gear-fitnes");
    private By waterBottleBanner = By.className("block-promo gear-equipment");
    private By bagBanner = By.className("block-promo gear-category-bags");
    private By gymEquipmentBanner = By.className("block-promo gear-category-equipment");
    private By watchesBanner = By.className("block-promo gear-category-watches");

    @Override
    public String getPageURL() {
        return "https://magento.softwaretestingboard.com/gear.html";
    }

    @Override
    protected By getLocatorByName(String nameOfLocator) {
        return null;
    }
}

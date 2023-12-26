package com.magneto.pages;

import org.openqa.selenium.By;

public class WhatsNewPage extends BasePage{
    //SideBar
    private By womensSubCategoryTitle = By.linkText("New in women's");
    private By womensSubCategories = By.xpath("//*[@class='items'][1]/li");
    private By mensSubCategoryTitle = By.linkText("New in men's");
    private By mensSubCategories = By.xpath("//*[@class='items'][2]/li");

    //Main
    private By yogaCollection = By.className("block-promo new-main");
    private By performanceCollection = By.className("block-promo new-performance");
    private By ecoCollection = By.className("block-promo new-eco");
    private By lumasLatestTitleText = By.className("content-heading");
    private By productItems = By.cssSelector(".product-items.widget-product-grid");

    @Override
    public String getPageURL() {
        return "https://magento.softwaretestingboard.com/what-is-new.html";
    }
}

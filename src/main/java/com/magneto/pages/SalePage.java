package com.magneto.pages;

import org.openqa.selenium.By;

public class SalePage extends BasePage{
    //SideBar
    private By womensSubCategoryTitle = By.linkText("New in women's");
    private By womensSubCategories = By.xpath("//*[@class='items'][1]/li");
    private By mensSubCategoryTitle = By.linkText("New in men's");
    private By mensSubCategories = By.xpath("//*[@class='items'][2]/li");
    private By gearDealsCategoryTitle = By.linkText("Gear Deals");
    private By gearDealsSubCategories = By.xpath(("//*[@class='items'][3]/li"));
    //Main
    private By womensDeals = By.className("block-promo sale-main");
    private By mensBargains = By.className("block-promo sale-mens");
    private By lumaGearSteals = By.className("block-promo sale-women");
    private By womensTshirts = By.className("block-promo sale-womens-t-shirts");

    @Override
    public String getPageURL() {
        return "https://magento.softwaretestingboard.com/sale.html";
    }
}

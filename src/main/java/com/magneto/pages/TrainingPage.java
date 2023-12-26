package com.magneto.pages;

import org.openqa.selenium.By;

public class TrainingPage extends BasePage{
    //SideBar
    private By shopBy = By.linkText("Shop By");
    private By category = By.cssSelector("dl[id='narrow-by-list2'] dt");
    private By videoDownloadLink = By.linkText("Video Download");
    private By videoDownloadCount = By.cssSelector(".count");
    //Main
    private By training = By.className("block-promo training-main");
    private By erinRecommends = By.className("block-promo training-erin");
    private By trainingRecomends = By.className("block-promo training-on-demand");
    private By topVideosTitle = By.cssSelector(".content-heading");
    @Override
    public String getPageURL() {
        return "https://magento.softwaretestingboard.com/training.html";
    }
}

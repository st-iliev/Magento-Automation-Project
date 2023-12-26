package com.magneto.pages;

import org.openqa.selenium.By;

public class VideoDownloadPage extends BasePage{
    //Main
    private By message = By.className("message info empty");
    @Override
    public String getPageURL() {
        return "https://magento.softwaretestingboard.com/training/training-video.html";
    }
}

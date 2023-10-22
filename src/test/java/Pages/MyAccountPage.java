package Pages;

import org.openqa.selenium.By;

public class MyAccountPage extends BasePage {
    @Override
    public String getPageURL() {
        return "https://magento.softwaretestingboard.com/customer/account/";
    }

    protected By pageTitle = By.xpath("//*[@data-ui-id='page-title-wrapper']");
    protected By myAccount = By.xpath("//a[@href='https://magento.softwaretestingboard.com/customer/account/']");
    protected By myOrders = By.xpath("//a[@href='https://magento.softwaretestingboard.com/sales/order/history/']");
    protected By myDownloadableProducts = By.xpath("//a[@href='https://magento.softwaretestingboard" +
            ".com/downloadable/customer/products/']");
    protected By myWishList = By.xpath("//a[@href='https://magento.softwaretestingboard.com/wishlist/']");
    protected By addressBook = By.xpath("//a[@href='https://magento.softwaretestingboard.com/customer/address/']");
    protected By accountInformation = By.xpath("//a[@href='https://magento.softwaretestingboard']");
    protected By storedPaymentMethods = By.xpath("//a[@href='https://magento.softwaretestingboard']");
    protected By myProductReviews = By.xpath("//a[@href='https://magento.softwaretestingboard.com/review/customer/']");

}


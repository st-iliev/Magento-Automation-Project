package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePage {

    public static WebDriver driver;
    public void setDriver(WebDriver driver){
        BasePage.driver = driver;
    }
    private By signIn = By.xpath("//*[@class='panel header']//*[@class='header " +
            "links']//a[contains(" +
            ".,'Sign " +
            "In')]");
    private By createAnAccount =By.xpath("//*[@class='panel header']//*[@class='header " +
            "links']//a[contains(.,'Create an Account')]");
    private By login = By.className("logged-in");
    private By nonLogin = By.className("not-logged-in");

    private By customerMenuButton = By.xpath("//*[@class='customer-welcome']//button[@tupe='button']");
    private By myAccount = By.xpath("//*[@class='panel header']//a[contains(.,'My " +
            "Account')]");
    private By myWishList = By.xpath("//*[@class='panel header']//a[contains(.,'My Wish " +
            "List')]");
    private By signOut =By.xpath("//*[@class='customer-welcome active']//a[contains(.," +
            "'Sign Out')]");
    //Footer
    private By writeForUs = By.xpat("//*[@href='https://softwaretestingboard.com/write-for-us/']");
    private By subscribe = By.xpat("//*[@href='https://softwaretestingboard.com/subscribe/']");
    private By contactUs = By.xpat("//*[@href='https://softwaretestingboard.com/contact/']");
    private By hire = By.xpat("//*[@href='https://adeunqa.com']");
    private By searchTerms = By.xpat("//*[@href='https://magento.softwaretestingboard.com/search/term/popular/']");
    private By privacyPolicy = By.xpat("//*[@href='https://magento.softwaretestingboard.com/privacy-policy-cookie-restriction-mode/']");
    private By advanceSearch = By.xpat("//*[@href='https://magento.softwaretestingboard.com/catalogsearch/advanced/']");
    private By copyRight = By.xpat("//*[@class='copyright']");
    public LoginPage clickSignIn(){
        click(signIn);
        return new LoginPage();
    }
    public RegistrationPage clickACreateAnAccount(){
        click(createAnAccount);
        return new RegistrationPage();
    }
    public MyAccountPage clickMyAccount(){
        click(customerMenuButton);
        click(myAccount);
        return new MyAccountPage();
    }
    public HomePage clickSignOut(){
        click(customerMenuButton);
        click(signOut);
        return new HomePage();
    }
    public abstract String getPageURL();
    protected void open() {driver.navigate().to(getPageURL());}
    protected WebElement find(By locator){
        return driver.findElement(locator);
    }
    protected void click(By locator){
        find(locator).click();
    }
    protected void clear(By locator){
        find(locator).clear();
    }
    protected void sendKeys(By locator, String text) {
        find(locator).sendKeys(text);
    }
    protected String getText(By locator){
        return find(locator).getText();
    }
}

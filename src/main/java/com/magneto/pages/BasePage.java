package com.magneto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public abstract class BasePage {

    public static WebDriver driver;
    public void setDriver(WebDriver driver){
        BasePage.driver = driver;
    }
    //Header
    private By signIn = By.xpath("//*[@class='panel header']//*[@class='headerlinks']//a[contains(.,'Sign In')]");
    private By createAnAccount =By.xpath("//*[@class='panel header']//*[@class='header " +
            "links']//a[contains(.,'Create an Account')]");
    private By login = By.className("logged-in");
    private By nonLogin = By.className("not-logged-in");

    private By customerMenuButton = By.xpath("//button[@tupe='button']");
    private By myAccount = By.linkText("My Account");
    private By myWishList = By.linkText("My Wish List");
    private By signOut =By.linkText("Sign Out");
    private By logo = By.cssSelector(".logo");
    private By searchField = By.id("search_mini_form");
    private By showCart = By.cssSelector(".action.showcart");

    //Navigation bar
    private By whatsNews = By.id("ui-id-3");
    private By women = By.id("ui-id-4");
    private By womenTops = By.id("ui-id-9");
    private By womenTopsJackets = By.id("ui-id-11");
    private By womenTopsHoodiesSweatshirts = By.id("ui-id-12");
    private By womenTopsTees= By.id("ui-id-13");
    private By womenTopsBrasTanks= By.id("ui-id-14");
    private By womenBottoms = By.id("ui-id-10");
    private By womenBottomsPants = By.id("ui-id-15");
    private By womenBottomsShorts = By.id("ui-id-16");
    private By men = By.id("ui-id-5");
    private By menTops = By.id("ui-id-17");
    private By menTopsJackets = By.id("ui-id-19");
    private By menTopsHoodiesSweatshirts = By.id("ui-id-20");
    private By menTopsTees = By.id("ui-id-21");
    private By menTopsTanks = By.id("ui-id-22");
    private By menBottoms = By.id("ui-id-18");
    private By menBottomsPants = By.id("ui-id-23");
    private By menBottomsShorts = By.id("ui-id-24");
    private By gear = By.id("ui-id-6");
    private By gearBags = By.id("ui-id-25");
    private By gearFirtnesEquipment = By.id("ui-id-26");
    private By gearWatches = By.id("ui-id-27");
    private By training = By.id("ui-id-7");
    private By trainingVideoDownload = By.id("ui-id-28");
    private By sale = By.id("ui-id-8");
    // Pages
    private By homeLink = By.linkText("Home");
    private By pageTitle = By.id("page-title-heading");

    //Footer
    private By writeForUs = By.linkText("Write for us");
    private By subscribe = By.linkText("Subscribe to our mailing list");
    private By contactUs = By.linkText("contactUs");
    private By hire = By.linkText("Hire a Sofware Testing/QA Company");
    private By searchTerms = By.linkText("Search Terms");
    private By policty = By.linkText("Privacy and Cookie Policy");
    private By advanceSerch = By.linkText("Advanced Search");
    private By copyRight = By.className("copyright");

    public abstract String getPageURL();
    protected void open() {driver.navigate().to(getPageURL());}
    protected WebElement find(By locator){
        return driver.findElement(locator);
    }
    protected List<WebElement> finds(By locator){
        return driver.findElements(locator);
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
    public LoginPage clickOnSignIn(){
        click(signIn);
        return new LoginPage();
    }
    public RegistrationPage clickOnACreateAnAccount(){
        click(createAnAccount);
        return new RegistrationPage();
    }
    public MyAccountPage clickOnMyAccount(){
        click(customerMenuButton);
        click(myAccount);
        return new MyAccountPage();
    }
    public HomePage clickOnSignOut(){
        click(customerMenuButton);
        click(signOut);
        return new HomePage();
    }
    public WhatsNewPage clickOnWhatsNew(){
        click(whatsNews);
        return new WhatsNewPage();
    }
    public Womenpage clickOnWomen(){
        click(women);
        return new Womenpage();
    }
    public MenPage clickOnMen(){
        click(men);
        return new MenPage();
    }
    public GearPage clickOnGear(){
        click(gear);
        return new GearPage();
    }
    public TrainingPage clickOnTraining(){
        click(training);
        return new TrainingPage();
    }
    public SalePage clickOnSale(){
        click(sale);
        return new SalePage();
    }
    public void clickOnSubCategory(WebDriver driver, By categoryName , By subCategory){
        Actions actions = new Actions(driver);
        actions.moveToElement((WebElement) categoryName).perform();
        click(subCategory);
    }
   public void clickOnSubSubCategory(WebDriver driver,By categoryName , By subCategory , By subSubCategory){
       Actions actions = new Actions(driver);
       actions.moveToElement((WebElement) categoryName).perform();
       actions.moveToElement((WebElement) subCategory).perform();
       click(subSubCategory);
   }
}

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
    private By demoMessage = By.xpath("//*[@class='message global demo']//p");
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
    //Cart
    private By showCart = By.cssSelector(".action.showcart");
    private By proceedToCheckoutButton = By.id("top-cart-btn-checkout");
    private By viewAndEditCart = By.linkText("View and Edit Cart");
    private By productsInCart = By.id("mini-cart");


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

    //Message
    private By message = By.xpath(("//*[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
    private By shoppingCartLink = By.linkText("shopping cart");
    //Shopping Options
    private By filterShoppingTitles = By.id("narrow-by-list");
    private List<WebElement> shoppingFilters = finds(filterShoppingTitles);
    // TODO for all subCategory

    //SideBar
    private By compareProductsTitle = By.id("block-compare-heading");
    private By compareProductsCount = By.cssSelector(".counter.qty");
    private By compareProducts = By.id("compare-items");
    private By compareButton = By.linkText("Compare");
    private By clearAllLink = By.id("compare-clear-all");
    private By textForRemovingCompareProduct = By.id("modal-content-51");
    private By closePopupWindow = By.xpath("//button[@class='action-close']");
    private By okButtonForRemovingCompareProduct = By.className("action-primary action-accept");
    private By cancelButtonForRemovingCompareProduct = By.className("action-secondary action-dismiss");
    private By recentlyOrderedText = By.id("block-reorder-heading");
    private By recentlyOrderedProducts = By.id("cart-sidebar-reorder");
    private List<WebElement> products = finds(recentlyOrderedProducts);
    private By recenlyOrderedAddToCartButton = By.xpath("//*[@id='cart-sidebar-reorder-advice-container']//button" +
            "[@title='Add to Cart']");
    private By recentlyOrderedViewAllLink = By.linkText("View All");
    private By myWishListTitle = By.linkText("My Wish List");
    private By myWishListCount = By.cssSelector(".counter");
    private By myWishListProducts = By.id("wishlist-sidebar");
    private By goToWishList = By.linkText("Go to Wish List");
    //Main
    private By modeGrid = By.id("mode-grid");
    private By modeList = By.id("mode-list");
    private By toolbarAmount = By.id("toolbar-amount");
    private By sortByDropDown = By.id("sorter");
    private By showProductPerPageDropDown = By.id("limiter");

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
    public void clickOnSubCategoryOnNavigationBar(WebDriver driver, By categoryName , By subCategory){
        Actions actions = new Actions(driver);
        actions.moveToElement((WebElement) categoryName).perform();
        click(subCategory);
    }
   public void clickOnSubSubCategoryOnNavigationBar(WebDriver driver,By categoryName , By subCategory ,
                                                  By subSubCategory){
       Actions actions = new Actions(driver);
       actions.moveToElement((WebElement) categoryName).perform();
       actions.moveToElement((WebElement) subCategory).perform();
       click(subSubCategory);
   }
    public void clickOnSubCategoryOnSideBar(By subCategoryType,String subCategoryName){
        var allSubCategory = finds(subCategoryType);
        for(var subCategory : allSubCategory){
            if(getText((By)subCategory).equals(subCategoryName)){
                click((By)subCategory);
            }
        }
    }
    public int GetNumberOfCompareProducts(By locator){
        var compareProducts = finds(locator).size();
        return compareProducts;
    }
}


package stepDefinitions;

import com.magneto.pages.BasePage;
import com.magneto.pages.GearPage;
import com.magneto.pages.SalePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SaleSteps {
    private WebDriver driver;
    private BasePage basePage;
    private SalePage salePage;
    private GearPage gearPage;

    // Background of Sale page
    @Given("the user is on the sale page")
    public void userIsOnLoginPage() {
        basePage.clickOnSale();
    }

    // Scenario Outline : User is redirect to the selected women's subcategory
    @When("the user clicks on the \"(.*)\" on left side bar")
    public void theUserClicksOnTheOnLeftSideBar(By subCategoryType , String subCategoryName)  {
        salePage.clickOnSubCategoryOnSideBar(subCategoryType,subCategoryName);
    }

    @Then("the user should be redirect on \"(.*)\" page")
    public void theUserShouldBeRedirectOnPage(String subCategoryName)  {
        Assert.assertEquals(salePage.getPageTitle(),subCategoryName);
    }

    @And("^all products from this category should be displayed\\.$")
    public void allProductsFromThisCategoryShouldBeDisplayed() {
        Assert.assertTrue(salePage.getNumberOfProductsOnPage() > 0, "The number of products should be greater than 0");
    }

    // Scenario: User is successful redirect to Women Sale
    @When("the user clicks on the Women's Deals banner")
    public void theUserClicksOnTheBanner(){
        salePage.clickOnWomenDealsBanner();
    }
    @Then("the user is redirected to the collection page")
    public void theUserIsRedirectedToTheCollectionPage() {
        Assert.assertEquals(driver.getTitle(),"Women Sale");
    }

    @And("all products from Women Sale should be displayed")
    public void allProductsFromWomenSaleShouldBeDisplayed(){
        Assert.assertTrue(basePage.getNumberOfProductsOnPage() > 0, "The number of products should be greater than 0");
    }

    // Scenario: User is successful redirect to Men Sale
    @When("the user scrolls down until they see banner with text Men's Bargains")
    public void theUserScrollsDownUntilTheySeeBannerWithTextMensBargains(){
        salePage.scrollDownToElement(driver,"Men's Bargains");
    }
    @And("the user clicks on the Men's Bargains banner")
    public void theUserClicksOnTheMenSBargainsBanner() {
        salePage.clickOnMensBargainsBanner();
    }
    @Then("the user is redirected to the Men Sale page")
    public void theUserIsRedirectedToTheMenSalePage(){
        Assert.assertEquals(basePage.getPageTitle(),"Men Sale");
    }
    @And("all products from Men Sale should be displayed")
    public void allProductsFromMenSaleShouldBeDisplayed(){
        Assert.assertTrue(basePage.getNumberOfProductsOnPage() > 0, "The number of products should be greater than 0");
    }
    // Scenario: User is successful redirect to Gear page
    @When("the user scrolls down until they see banner with text Luma Gear Steals")
    public void theUserScrollsDownUntilTheySeeBannerWithTextLumaGearSteals(){
        salePage.scrollDownToElement(driver,"Luma Gear Steals");
    }
    @And("the user clicks on the Luma Gear Steals banner")
    public void theUserClicksOnTheLumaGearStealsBanner(){
        salePage.clickOnLumaGearStealsBanner();
    }
    @Then("the user is redirected to the Gear page")
    public void theUserIsRedirectedToTheGearPage() {
        Assert.assertEquals(driver.getCurrentUrl(),gearPage.getPageURL());
    }

    @And("the page title should be Gear")
    public void thePageTitleShouldBeGear() {
        Assert.assertEquals(basePage.getPageTitle(),"Gear");
    }

    // Scenario: User is successful redirect to Tees collection
    @When("the user scrolls down until they see banner with text Tees")
    public void theUserScrollsDownUntilTheySeeBannerWithTextTees(){
        salePage.scrollDownToElement(driver,"Tees");
    }
    @And("the user clicks on the Tees banner")
    public void theUserClicksOnTheTeesBanner() {
        salePage.clickOnWomensTshirtsBanner();
    }
    @Then("the user is redirected to the Tees collection")
    public void theUserIsRedirectedToTheTeesCollection() {
        Assert.assertEquals(basePage.getPageTitle(),"Tees");
    }

    @And("all tees products should be displayed")
    public void allTeesProductsShouldBeDisplayed() {
        Assert.assertTrue(basePage.getNumberOfProductsOnPage() > 0, "The number of products should be greater than 0");
    }

    // Scenario: Discount banner verification
    @When("the user scrolls down until they see discount banner with 20% OFF")
    public void theUserScrollsDownUntilTheySeeDiscountBannerWithOFF() {
        salePage.scrollDownToElement(driver,"discountBanner");
    }

    @Then("the discount banners should be displayed")
    public void theDiscountBannersShouldBeDisplayed() {
        Assert.assertTrue(salePage.isElementDisplayed("discountBanner"));
    }
    // Scenario: Free shipping banner verification
    @When("he user scrolls down until they see banner with text free shipping")
    public void theUserScrollsDownUntilTheySeeBannerWithTextFreeShipping() {
        salePage.scrollDownToElement(driver,"freeShippingBanner");
    }

    @Then("the free shipping banner should be displayed")
    public void theFreeShippingBannerShouldBeDisplayed() {
        Assert.assertTrue(salePage.isElementDisplayed("freeShippingBanner"));
    }

}

package Runners;

import Pages.BasePage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected RegistrationPage registrationPage;
    private final String baseURL = "https://magento.softwaretestingboard.com/";
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @BeforeMethod
    public void loadApplication(){
        driver.get(baseURL);
        basePage.setDriver(driver);
        homePage = new HomePage();
        loginPage = new LoginPage();
    }
    @AfterMethod
    public void takeScreenShotForFailedTest(){
        //TODO
    }
    @AfterClass
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }

    }

}

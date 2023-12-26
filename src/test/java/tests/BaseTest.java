package tests;

import com.magneto.pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected ForgotPasswordPage forgotPasswordPage;
    protected RegistrationPage registrationPage;
    protected MyAccountPage myAccountPage;
    protected SalePage salePage;
    protected  TrainingPage trainingPage;
    protected  VideoDownloadPage videoDownloadPage;
    protected  WhatsNewPage whatsNewPage;
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
        forgotPasswordPage = new ForgotPasswordPage();
        registrationPage = new RegistrationPage();
        myAccountPage = new MyAccountPage();
        salePage = new SalePage();
        trainingPage = new TrainingPage();
        videoDownloadPage = new VideoDownloadPage();
        whatsNewPage = new WhatsNewPage();
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

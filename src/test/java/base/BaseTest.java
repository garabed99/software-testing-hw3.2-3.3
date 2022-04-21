package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import constants.urls.Urls;

public class BaseTest {
    public static WebDriver driver;
    public HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
    }

    @BeforeMethod
    public HomePage goHome(){
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.get(Urls.SUT_URL);
        driver.manage().window().maximize();
        return homePage;
    }
}

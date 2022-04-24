package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import com.google.common.io.Files;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.ITestResult;
import pages.HomePage;
import constants.urls.Urls;

import java.io.File;
import java.io.IOException;

public class BaseTest {
    public static WebDriver driver;
    public HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
        goHome();
    }

//    @BeforeMethod
    public void goHome(){
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.get(Urls.SUT_URL);
        driver.manage().window().maximize();
    }

//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }

    @AfterMethod
    public void recordFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

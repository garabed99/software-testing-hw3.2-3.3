package pages;
import base.BaseTest;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import static constants.locators.CareersPageConstants.*;

public class CareersPageTest extends BaseTest {
private By jobTitle = By.xpath(JOB_TITLE);
private By location = By.xpath(FIRST_LOCATION);

    @Test
    public void checkRemotePosition() {
        CareersPage careersPage = homePage.goToCareersPage();
        careersPage.isPositionRemote();
        assertTrue(driver.findElement(location).getText().contains("Remote"), "No such position");
    }

}
package pages;
import base.BaseTest;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import static constants.locators.CareersPageConstants.*;

public class CareersPageTest extends BaseTest {
private By jobTitle = By.xpath(JOB_TITLE);
    @Test
    public void testSelectIT() {
    }

    @Test
    public void selectITinGermany() {
        CareersPage careersPage = homePage.goToCareersPage();
        careersPage.selectITinGermany();
        assertTrue(driver.findElement(jobTitle).getText().contains("Senior Site Reliability Engineer"), "No such position");

    }

    @Test
    public void testGoToSelectedCareersPage() {

    }
}
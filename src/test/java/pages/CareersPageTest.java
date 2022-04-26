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
    public void selectITinPortland() {
        CareersPage careersPage = homePage.goToCareersPage();
        careersPage.selectITinPortland();
        assertTrue(driver.findElement(jobTitle).getText().contains("Senior Manager, Application"), "No such position");

    }

    @Test
    public void testGoToSelectedCareersPage() {

    }
}
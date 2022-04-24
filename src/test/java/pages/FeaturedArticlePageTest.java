package pages;
import base.BaseTest;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static constants.locators.FeaturedArticlePageConstants.ARTICLE_TITLE;
import static constants.locators.FeaturedArticlePageConstants.OUTPUT_RESULT;
import static org.testng.Assert.*;

public class FeaturedArticlePageTest extends BaseTest {
    private By articleTitle = By.xpath(ARTICLE_TITLE);
    private By outputResult = By.xpath(OUTPUT_RESULT);
//    private By articleTitle1 = By.tagName("h1");

    @Test
    public void testChangeLanguage() {
        FeaturedArticlePage featuredArticlePage = homePage.goToFeaturedArticlePage();
        featuredArticlePage.changeLanguage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertTrue(driver.findElement(articleTitle).getText().contains("l'élément de"), "Not Found");
    }

    @Test
    public void testInteractWithExample() {
        FeaturedArticlePage featuredArticlePage = homePage.goToFeaturedArticlePage();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        featuredArticlePage.interactWithExample();
        assertTrue(driver.findElement(outputResult).getText().contains("Brine shrimp button clicked"), "Not Found");
    }
}
package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static constants.locators.FeaturedArticlePageConstants.ARTICLE_TITLE;
import static org.testng.Assert.*;

public class FeaturedArticlePageTest extends BaseTest {
    private By articleTitle = By.xpath(ARTICLE_TITLE);
//    private By articleTitle1 = By.tagName("h1");

    @Test
    public void testChangeLanguage() {
        FeaturedArticlePage featuredArticlePage = homePage.goToFeaturedArticlePage();
        featuredArticlePage.changeLanguage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertTrue(driver.findElement(articleTitle).getText().contains("l'élément de"), "Not Found");

    }
}
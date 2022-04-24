package pages;
import constants.dataproviders.dataprovider;
import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static constants.locators.SelectedCareersPageConstants.*;
import static constants.locators.SelectedSearchResultPage.*;
import static constants.locators.SearchResultsPageConstants.*;
import static org.testng.Assert.*;

public class HomePageTest extends BaseTest {
private By titleSearch = By.xpath("//*[@id=\"content\"]/article/div[2]/ul/li[1]/h3/a");
private By titleCareer = By.xpath(POSITION_TITLE);
private By inThisArticle = By.xpath(IN_THIS_ARTICLE);
private By firstParagraph = By.xpath(FIRST_SENTENCE);
private By resultsFound = By.xpath(RESULTS_FOUND);

    @Test
    public void testValidSearch() {
         homePage.search(".reduce()");
         SearchResultsPage searchResultsPage = homePage.goToSearchResultsPage();
         SelectedSearchResultPage selectedSearchResultPage = searchResultsPage.goToSpecificResultPage(0);
         selectedSearchResultPage.changeLanguageToFrench();
         assertTrue(driver.findElement(firstParagraph).getText().contains("La méthode reduce()"), "wrong page");

        //foreach the list to check the h3 if it contains the text

//         SelectedSearchResultPage selectedSearchResultPage = searchResultsPage.goToSelectedSearchResultsPage();
//         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void testInvalidSearch() {
        homePage.search("jkhdasgfjasdhgf");
        SearchResultsPage searchResultsPage = homePage.goToSearchResultsPage();
        searchResultsPage.getSearchedResults();
        assertTrue(driver.findElement(resultsFound).getText().contains("Found 0 matches"), "Seems like website found a result");
    }

    @Test
    public void testGoToCareersPage() {
        CareersPage careersPage = homePage.goToCareersPage();
        careersPage.selectIT();
        careersPage.goToSelectedCareersPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertTrue(driver.findElement(titleCareer).getText().contains("Manager, "), "Not Found");

    }

    @Test
    public void testChangeTheme() {
        homePage.changeTheme();
    }
}
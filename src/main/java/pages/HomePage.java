package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static constants.locators.HomePageConstants.*;

public class HomePage {
    private WebDriver driver;
    private By searchBar = By.xpath(SEARCH_BAR);
    private By searchIcon = By.xpath(SEARCH_ICON);
    private By featuredArticle = By.xpath(FEATURED_ARTICLE);
    private String careersBtn = CAREERS_JS;
    private By themeBtn = By.className(THEME_BUTTON);
    private String lightTheme = LIGHT_THEME_JS;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void search(String searchText) {
        WebElement searchInput = new WebDriverWait(driver, 3)
                .until(ExpectedConditions.presenceOfElementLocated(searchBar));
        searchInput.sendKeys(searchText);
    }

    public SearchResultsPage goToSearchResultsPage() {
        driver.findElement(searchIcon).click();
        return new SearchResultsPage(driver);
    }

    public CareersPage goToCareersPage() {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript(careersBtn);

        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        return new CareersPage(driver);
    }

    public FeaturedArticlePage goToFeaturedArticlePage() {
        driver.findElement(featuredArticle).click();
        return new FeaturedArticlePage(driver);
    }

    public void changeTheme() {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement themeButton = driver.findElement(themeBtn);
        themeButton.click();
        js.executeScript(lightTheme);
    }

}

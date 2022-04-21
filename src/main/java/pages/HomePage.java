package pages;
import org.openqa.selenium.*;
import static constants.locators.HomePageConstants.*;

public class HomePage {
    private WebDriver driver;
    private By searchBar = By.xpath(SEARCH_BAR);
    private By searchIcon = By.xpath(SEARCH_ICON);
    private By featuredArticle = By.xpath(FEATURED_ARTICLE);
    private By careersBtn = By.xpath(CAREERS);
    private By themeBtn = By.xpath(THEME_BUTTON);
    private String lightTheme = LIGHT_THEME_JS;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void search(String searchText) {
        WebElement searchInput = driver.findElement(searchBar);
        searchInput.sendKeys(searchText);
    }

    public SearchResultsPage goToSearchResultsPage() {
        driver.findElement(searchIcon).click();
        return new SearchResultsPage(driver);
    }

    public CareersPage goToCareersPage() {
        driver.findElement(careersBtn).click();
        return new CareersPage(driver);
    }
}

package pages;
import org.openqa.selenium.*;
import static constants.locators.SearchResultsPageConstants.*;

public class SearchResultsPage {
    private WebDriver driver;
    private By firstResult = By.xpath(FIRST_RESULT);

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public SelectedSearchResultPage goToSelectedSearchResultsPage() {
        driver.findElement(firstResult).click();
        return new SelectedSearchResultPage(driver);
    }
}

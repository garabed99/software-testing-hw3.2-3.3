package pages;
import org.openqa.selenium.*;
import java.util.List;
import static constants.locators.SearchResultsPageConstants.*;

public class SearchResultsPage {
    private WebDriver driver;
    private By firstResult = By.xpath(FIRST_RESULT);

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getSearchedResults() {
        List<WebElement> searchList = driver.findElements(By.className("search-result-entry"));
        return searchList;
    }



    public SelectedSearchResultPage goToSpecificResultPage(int num) {
        getSearchedResults().get(num).findElement(By.xpath("h3/a")).click();
        return new SelectedSearchResultPage(driver);
    }
}

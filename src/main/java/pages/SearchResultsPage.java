package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import static constants.locators.SearchResultsPageConstants.*;

public class SearchResultsPage {
    private WebDriver driver;
    private By firstResult = By.xpath(FIRST_RESULT);
    private By resultNotFound = By.xpath(RESULTS_NOT_FOUND);

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

//    public List<WebElement> getSearchedResults() {
//        List<WebElement> searchList = driver.findElements(By.className("search-result-entry"));
//        return searchList;
//    }

    public SelectedSearchResultPage getFirstSearchedResult() {
        driver.findElement(firstResult).click();
        return new SelectedSearchResultPage(driver);
    }

    public SelectedSearchResultPage getResultNotFound() {
        driver.findElement(resultNotFound).getText();
        return new SelectedSearchResultPage(driver);
    }

//    public SelectedSearchResultPage goToSpecificResultPage(int num) {
//        WebElement delay = new WebDriverWait(driver, 3)
//                .until(ExpectedConditions.presenceOfElementLocated());
//        getSearchedResults().get(num).findElement(By.xpath("h3/a")).click();
//        return new SelectedSearchResultPage(driver);
//    }

//    public SelectedSearchResultPage goToFirstResultPage() {
//        driver.findElement()
//    }
}

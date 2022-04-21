package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import static constants.locators.HomePageConstants.*;
import static constants.urls.Urls.SUT_URL;

public class HomePage {
    private WebDriver driver;
    private By searchBar = By.xpath(SEARCH_BAR);
    private By burgerIcon = By.xpath(BURGER_ICON);
    private By questionsButton = By.xpath(QUESTIONS_BUTTON);
    private By workHere = By.xpath(WORK_HERE);

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public AllQuestionsPage goToAllQuestionsPage() {
        driver.findElement(burgerIcon).click();
        driver.findElement(questionsButton).click();
        return new AllQuestionsPage(driver);
    }

    public void search(String searchText) {
        driver.findElement(searchBar).sendKeys(searchText + Keys.ENTER);
    }

    public WorkHerePage goToWorkHerePage() {
        driver.findElement(workHere).click();
        return new WorkHerePage(driver);
    }

}

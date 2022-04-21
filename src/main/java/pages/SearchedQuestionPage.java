package pages;

import org.openqa.selenium.*;

import static constants.locators.SearchedQuestionPageConstants.*;

public class SearchedQuestionPage {
    private WebDriver driver;
    private By searchBar = By.xpath(POST_ACTIVITY_BUTTON);
    private By burgerIcon = By.xpath(SHARE_BUTTON);
    private By questionsButton = By.xpath(COPY_LINK);

    public SearchedQuestionPage(WebDriver driver) {
        this.driver = driver;
    }


}

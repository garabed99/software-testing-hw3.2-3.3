package pages;

import org.openqa.selenium.*;

import static constants.locators.QuestionPageConstants.*;

public class QuestionPage {
    private WebDriver driver;
    private By searchBar = By.xpath(POST_ACTIVITY_BUTTON);
    private By burgerIcon = By.xpath(SHARE_BUTTON);
    private By questionsButton = By.xpath(COPY_LINK);

    public QuestionPage(WebDriver driver) {
        this.driver = driver;
    }


}

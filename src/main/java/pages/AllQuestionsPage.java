package pages;

import org.openqa.selenium.*;

import static constants.locators.AllQuestionsPageConstants.*;

public class AllQuestionsPage {
    private WebDriver driver;
    private By postActivityButton = By.xpath(FILTER_BUTTON);
    private By highestScore = By.xpath(HIGHEST_SCORE);
    private By applyFilterButton = By.xpath(APPLY_FILTER_BUTTON);
    private By secondResult = By.xpath(SECOND_RESULT);

    public AllQuestionsPage(WebDriver driver) {
        this.driver = driver;
    }

    //gets title
    public String getSecondHighestViewedQuestion() {
        driver.findElement(postActivityButton).click();
        driver.findElement(highestScore).click();
        driver.findElement(applyFilterButton).click();
        WebElement secondResultTitle = driver.findElement(secondResult);
        return secondResultTitle.getText();
    }

    //goes to the page
    public void goToSecondHighestViewedQuestion() {
        WebElement filterBtn = driver.findElement(postActivityButton);
        filterBtn.click();
        WebElement highestScoreOption = driver.findElement(highestScore);
        highestScoreOption.click();
        WebElement applyFilterBtn = driver.findElement(applyFilterButton);
        applyFilterBtn.click();
        WebElement secondResultTitle = driver.findElement(secondResult);
        secondResultTitle.click();

    }
}

package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static constants.locators.FeaturedArticlePageConstants.*;


public class FeaturedArticlePage {
    private WebDriver driver;
    private By languageBtn = By.xpath(LANGUAGE_BUTTON);
    private By frenchLang = By.xpath(FRENCH_LANGUAGE);
    private By exampleSection = By.xpath(GO_TO_EXAMPLES);
    private By exampleIframe = By.xpath(EXAMPLE_IFRAME);
    private By exampleBtn = By.xpath(EXAMPLE_BUTTON);
    private By chooseBtn = By.xpath(CHOOSE_BUTTON);
    private By brineShrimp = By.xpath(BRINE_SHRIMP);
    private By confirmBtn = By.xpath(CONFIRM_BUTTON);
    private By outputResult = By.xpath(OUTPUT_RESULT);




    public FeaturedArticlePage(WebDriver driver) {this.driver = driver;}

    public void changeLanguage() {
        driver.findElement(languageBtn).click();
        driver.findElement(frenchLang).click();
    }
//    Brine shrimp button clicked
    public void interactWithExample() {
        driver.findElement(exampleSection).click();
        WebElement iframe = driver.findElement(exampleIframe);
        driver.switchTo().frame(iframe);
        driver.findElement(exampleBtn).click();
        driver.findElement(chooseBtn).click();
        driver.findElement(brineShrimp).click();
        driver.findElement(confirmBtn).click();
    }

}

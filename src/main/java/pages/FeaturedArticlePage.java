package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

import static constants.locators.FeaturedArticlePageConstants.*;


public class FeaturedArticlePage {
    private WebDriver driver;
    private By languageBtn = By.xpath(LANGUAGE_BUTTON);
    private By frenchLang = By.xpath(FRENCH_LANGUAGE);
//    private By exampleSection = By.xpath(GO_TO_EXAMPLES);

    private By resultSection = By.xpath(GO_TO_RESULTS);
    private By exampleIframe = By.xpath(EXAMPLE_IFRAME);
    private By innerExampleBtn = By.xpath(DETAILS_BUTTON);
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
    public void interactWithExample() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(resultSection).getText();
        System.out.println(("example = " + driver.findElement(resultSection).getText()));
        WebElement iframe = driver.findElement(exampleIframe);
        System.out.println("switchto iFrame:");
        driver.switchTo().frame(iframe);
        System.out.println("click exampleBtn:");
        driver.findElement(innerExampleBtn).click();
        System.out.println("click chooseBtn:");
        driver.findElement(chooseBtn).click();
        System.out.println(" select shrimp:");
        driver.findElement(brineShrimp).click();
        System.out.println("click confirm:");
        driver.findElement(confirmBtn).click();
    }

}

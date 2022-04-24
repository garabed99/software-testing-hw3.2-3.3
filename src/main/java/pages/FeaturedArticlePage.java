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

    public FeaturedArticlePage(WebDriver driver) {this.driver = driver;}

    public void changeLanguage() {
        driver.findElement(languageBtn).click();
        driver.findElement(frenchLang).click();
    }

}

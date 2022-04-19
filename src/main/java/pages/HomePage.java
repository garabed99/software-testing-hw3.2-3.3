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

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToAllQuestionsPage() {
        driver = new ChromeDriver();
        driver.get(SUT_URL);
        driver.manage().window().maximize();
        driver.getWindowHandle();

        WebElement burgerIco = driver.findElement(burgerIcon);
        burgerIco.click();
        WebElement questionBtn = driver.findElement(questionsButton);
        questionBtn.click();
    }

}

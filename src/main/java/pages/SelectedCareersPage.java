package pages;
import org.openqa.selenium.*;
import static constants.locators.SelectedCareersPageConstants.*;

public class SelectedCareersPage {
    private WebDriver driver;
    private By positionTitle = By.xpath(POSITION_TITLE);

    public SelectedCareersPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPositionTitle() {
        return driver.findElement(positionTitle).getText();
    }
}

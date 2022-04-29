package pages;
import org.openqa.selenium.*;
import static constants.locators.CareersPageConstants.*;

public class CareersPage {
    private WebDriver driver;
    private By team = By.id(TEAM);

    private By itTeam = By.xpath(IT_TEAM);
    private By firstOption = By.xpath(FIRST_OPTION);


    public CareersPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectIT() {
        driver.findElement(team).click();
        driver.findElement(itTeam).click();
    }

    public SelectedCareersPage goToSelectedCareersPage() {
        driver.findElement(firstOption).click();
        return new SelectedCareersPage(driver);
    }

    public void isPositionRemote() {
        driver.findElement(team).click();
        driver.findElement(itTeam).click();
//        driver.findElement(location).click();
//        driver.findElement(portland).click();
    }
}

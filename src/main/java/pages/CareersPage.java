package pages;
import org.openqa.selenium.*;
import static constants.locators.CareersPageConstants.*;

public class CareersPage {
    private WebDriver driver;
    private By allTeams = By.id(ALL_TEAMS);
    private By itTeam = By.xpath(IT_TEAM);
    private By firstOption = By.xpath(FIRST_OPTION);

    public CareersPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectIT() {
        driver.findElement(allTeams).click();
        driver.findElement(itTeam).click();
    }

    public SelectedCareersPage goToSelectedCareersPage() {
        driver.findElement(firstOption).click();
        return new SelectedCareersPage(driver);
    }
}

package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import static constants.locators.WorkHerePageConstants.*;

public class WorkHerePage {
    private WebDriver driver;
    private By departmentOption = By.xpath(DEPARTMENT_OPTION);
    private By engineeringOption = By.xpath(ENGINEERING_DEPARTMENT);
    private By firstResult = By.xpath(FIRST_RESULT);

    public WorkHerePage(WebDriver driver) { this.driver = driver; }

    public String getFirstCareerOpportunity() {
        driver.findElement(departmentOption).click();
        driver.findElement(engineeringOption).click();
        WebElement result = driver.findElement(firstResult);
        return result.getText();
    }

}

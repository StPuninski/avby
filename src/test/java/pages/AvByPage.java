package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
public abstract class AvByPage extends BasePage {

    private static final String URL = "https://av.by";
    private static final By NEW_CARS = By.className("summary-count");
    private static final By MARK_AUTO = By.id("search_extend_link");


    public AvByPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public BasePage openPage() {
        driver.get(URL);
        isPageOpened();
        return this;
    }

    @Override
    public BasePage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(NEW_CARS));
        return this;
    }

    public void searchAuto() {
        driver.findElement(MARK_AUTO).click();
    }
}

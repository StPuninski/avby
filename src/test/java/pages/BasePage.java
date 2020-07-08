package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver,10);

    }

    protected abstract BasePage openPage();
    protected abstract BasePage isPageOpened();


    public abstract void login(ChromeOptions chromeOptions);

}

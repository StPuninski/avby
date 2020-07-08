package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import utils.CapabilitiesGenerator;


    public class BaseTest {
        WebDriver driver;
        LoginPage loginPage;

        @BeforeMethod
        public void setUp(ITestContext context) {
            driver = new ChromeDriver(CapabilitiesGenerator.getChromeOptions());
            loginPage = new LoginPage(driver) {
                @Override
                public LoginPage isPageOpened() {
                    return null;
                }

                @Override
                public void login(ChromeOptions chromeOptions) {

                }
            };
        }
    }

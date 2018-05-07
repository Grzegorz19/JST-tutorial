package tests;

import driver.manager.DriverManager;
import driver.manager.DriverUtils;
import navigation.ApplicationURLs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static navigation.ApplicationURLs.APPLICATION_URL;
import static navigation.ApplicationURLs.LOGIN_URL;

import java.util.concurrent.TimeUnit;

public class TestBase {

    @BeforeMethod
    public void beforeTest(){
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPage(LOGIN_URL);
    }

    @AfterMethod
    public void afterTest() {
        DriverManager.disposeDriver();
    }
}

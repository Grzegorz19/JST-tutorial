package tests;

import driver.manager.DriverUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import page.objects.*;
import tests.TestBase;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.Set;

import static navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.Assert.assertTrue;

public class PositiveLoginTests extends TestBase {

    @Test
    public void asUserLoginUsingValidLoginAndPassword(){
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        boolean isBannerAfterLoginDisplayed = loginPage
                .typeIntoUsernameField("j2ee")
                .clearInputInPasswordField()
                .typeIntoPasswordField("j2ee")
                .clickOnLoginButton()
                .isBannerAfterLoginDisplayed();

        assertTrue(isBannerAfterLoginDisplayed);
    }

}

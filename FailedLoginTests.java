package tests;

import driver.manager.DriverUtils;
import org.testng.annotations.Test;
import page.objects.LandingPage;
import page.objects.LoginPage;
import tests.TestBase;
import page.objects.TopMenuPage;

import static navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.AssertJUnit.assertEquals;

public class FailedLoginTests extends TestBase {

    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword()
    {
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage
                .typeIntoUsernameField("NotExistingUser")
                .clearInputInPasswordField()
                .typeIntoPasswordField("NotProperPassword")
                .clickOnLoginButton();

        String warningMessage = loginPage.getWarningMessage();

        assertEquals(warningMessage, "Invalid username or password. Signon failed.");
    }

}

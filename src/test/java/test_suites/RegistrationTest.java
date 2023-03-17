package test_suites;


import Pages.Environment;
import Pages.UserRegistrationPage;
import com.shaft.validation.Assertions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.browser.BrowserFactory;

import Pages.Login;
import org.testng.annotations.Test;

public class RegistrationTest {

    private WebDriver driver;
    String firstName = "Ahmed";
    String lastName = "M.Reda";
    String phone = "01016822000";
    String email = "AhmedMohmedReda@gmail.com";

    @BeforeClass
    public void beforeClass() throws Exception {
        driver = BrowserFactory.getBrowser();
        new Login(driver).login();
    }

    @BeforeMethod
    public void navigateToRegistration() throws InterruptedException {

        if (BrowserActions.getCurrentURL(driver).contains("registration")) {
            Thread.sleep(8000);
        } else {
            BrowserActions.navigateToURL(driver, Environment.getInstance().codenboxautomationlabURL +"/registration-form/");
        }
    }

    @Test
    public void VerifyRegisterNewUser() throws InterruptedException {
        new UserRegistrationPage(driver).UserRegister(firstName, lastName, phone, email);
        String ActualResult = new UserRegistrationPage(driver).successfulRegisterMessage();
        Assertions.assertEquals("Thank you for registering for our event.", ActualResult);
    }

    @AfterClass
    public void afterMethod() {
        BrowserActions.closeCurrentWindow(driver);
    }


}



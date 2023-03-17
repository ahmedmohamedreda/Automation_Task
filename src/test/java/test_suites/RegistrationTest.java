package test_suites;


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
    String ExpectedResult = "Thank you for registering for our event.";


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
            BrowserActions.navigateToURL(driver, "https://codenboxautomationlab.com/registration-form/");
        }
    }

    @Test
    public void VerifyRegisterNewUser() throws InterruptedException {
        new UserRegistrationPage(driver).UserRegister();
       String  ActualResult=new UserRegistrationPage(driver).successfulRegisterMessage();
        Assertions.assertEquals(ExpectedResult,ActualResult);
    }

    @AfterClass
    public void afterMethod() {
        BrowserActions.closeCurrentWindow(driver);
    }


}



package test_suites;


import Pages.Environment;
import Pages.UserRegistrationPage;
import com.github.javafaker.Faker;
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



    @BeforeClass
    public void beforeClass() throws Exception {
        driver = BrowserFactory.getBrowser();
        new Login(driver).login();
    }
    // Launch the browser and navigate to the registration page
    @BeforeMethod
    public void navigateToRegistration() throws InterruptedException {

        if (BrowserActions.getCurrentURL(driver).contains("registration")) {
            Thread.sleep(8000);
        } else {
            BrowserActions.navigateToURL(driver, Environment.getInstance().codenboxautomationlabURL +"/registration-form/");
        }
    }
    /*
    This code uses a try-catch block to catch any exceptions thrown by the Faker library to generate the required data.
    If an exception is caught, the test fails and an error message is printed to the console.*/
    @Test
    public void VerifyRegisterNewUser() throws InterruptedException {
        //generates fake data using the JavaFaker library instead of hard-coding values
        Faker faker = new Faker();
        String firstName = "";
        String lastName = "";
        String phone = "";
        String email = "";
        try {
            firstName = faker.name().firstName();
            lastName = faker.name().lastName();
            phone = faker.phoneNumber().phoneNumber();
            email = faker.internet().emailAddress();
        } catch (Exception e) {
            e.printStackTrace();
            Assertions.assertFail("Failed to generate fake data");
        }

        new UserRegistrationPage(driver).UserRegister(firstName, lastName, phone, email);
        String ActualResult = new UserRegistrationPage(driver).successfulRegisterMessage();
        Assertions.assertEquals("Thank you for registering for our event.", ActualResult);
    }

    @AfterClass
    public void afterMethod() {
        BrowserActions.closeCurrentWindow(driver);
    }


}



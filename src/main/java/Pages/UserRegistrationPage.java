package Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserRegistrationPage {


    private final WebDriver driver;


    public UserRegistrationPage(WebDriver driver) {
        this.driver = driver;
    }
//User Registration Locators

    //credentials to Register
    private By Signup_btn = By.id("nf-field-15");
    private By first_name_field = By.id("nf-field-17");
    private By last_name_field = By.name("lname");
    private By phone_field = By.name("nf-field-20");
    private By email_field = By.name("email");
    private By courseBook_dropdown = By.name("nf-field-22");
    private By linkedin_checkbox = By.id("nf-label-class-field-23-1");
    public By successfulRegisterMessage_txt = By.xpath("//div[@class='nf-response-msg']");


    public void UserRegister(String firstName, String lastName, String phone, String email) throws InterruptedException {
        ElementActions.click(driver, first_name_field);
        ElementActions.type(driver, first_name_field, firstName);
        ElementActions.click(driver, last_name_field);
        ElementActions.type(driver, last_name_field, lastName);
        ElementActions.click(driver, phone_field);
        ElementActions.type(driver, phone_field, phone);
        ElementActions.click(driver, email_field);
        ElementActions.type(driver, email_field, email);
        ElementActions.click(driver, courseBook_dropdown);
        ElementActions.click(driver, linkedin_checkbox);
        ElementActions.click(driver, Signup_btn);
    }

    public String successfulRegisterMessage() throws InterruptedException {
        Thread.sleep(1000);
        String MessageTxt = ElementActions.getText(driver, successfulRegisterMessage_txt);
        return MessageTxt;
    }
}


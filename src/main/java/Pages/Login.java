package Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.browser.BrowserActions;
public class Login {
	  public  WebDriver driver;
	    public Login(WebDriver driver) {
		this.driver = driver;
	    }

	    public void login(){
	        BrowserActions.navigateToURL(driver, Environment.getInstance().codenboxautomationlabURL);
	    }

	}



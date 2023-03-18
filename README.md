# Selenium - SHAFT_ENGINE

## What is it
SHAFT is a unified test automation engine. Powered by best-in-class frameworks, SHAFT provides a wizard-like syntax to drive your automation efficiently, maximize your ROI, and minimize your learning curve.

## Requirements
```
• Java 15
```

## Dependencies
```
• Maven
• Selenium 
```

## Currently supported browsers are
```
• chrome
• firefox
• headless 
```

### Updations and Implementations:
```
• the website that used:(https://codenboxautomationlab.com/) 
• Create project maven with shaft framwork.
• create the page, tests packages
• Create pages for locators and actions
• Create tests for locators and actions
• Retry failed test cases.
• fixed errors on the test script.
• Step 4: Running Tests
  Run your TestClass.java as a TestNG Test Class.
  The execution report will open automatically in your default web browser after the test run is completed.
  Join our GitHub Repo stars to get notified by email when a new release is pushed out.
  After upgrading your Engine to a new major release it is sometimes recommended to delete 
  the properties folder src\main\resources\properties and allow SHAFT to regenerate the defaults
  by running any test method.
• upload the project on GitHub

```

### Using selenium to automate the following scenario:
```
1. Open codenboxautomationlab website.
1. Enter First Name which must start with capital letter.
2. Enter Last Name which must start with capital letter and can’t be equal First Name.
3. Enter a valid Mobile Number.
4. Enter a valid E-mail that should be unique for every user.
6. After successful registration.
9- verify that the user successful registration.
```
### Code Structure :
```
• generates fake data using the JavaFaker library instead of hard-coding values, making the script more flexible and reusable.
• add some error handling in case the Faker library fails to generate the required data.

```

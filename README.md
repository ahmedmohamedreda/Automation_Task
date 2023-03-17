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
• the website that used:(https://www.nagwa.com/) 
• Create project maven with shaft framwork.
• create the page, tests, and utilities packages
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
1. Open Nagwa website.
2. Choose a language to open the home page.
3. Use the search icon to start searching on Nagwa lessons.
4. Write any lesson name for example “addition” then search.
5. A list with all lessons in Nagwa that match this name will appear.
6. Click on 2nd lesson in the search results to open its home page.
7. Go to worksheet section then click preview button.
8. Worksheet home page will open then count number of questions displayed on it and 
print the count.
9- Assert the count number of questions
```
```

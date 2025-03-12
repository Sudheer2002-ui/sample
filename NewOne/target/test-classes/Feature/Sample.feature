Feature:

@SmokeTest
Scenario: To check the title of the app
Given User opens the browser
And User navigates to the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" web page
Then User verifies the title of the  Webpage
And User closes the browser

@RegressionTest
Scenario Outline: To check the login functionality
Given User opens the browser
And User navigates to the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" web page
When User enters '<Username>' the  username
And User enters '<Password>' the password
And User clicks on the login button
And User Verifies the login functionality
And User closes the browser
Examples:
|Username|Password|
|Admin|admin123|
|Admin|admin123|
Feature:
Background:
Given User opens the browser
And User navigates to the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" web page

@SmokeTest
Scenario: To check the title of the app
Then User verifies the title of the  Webpage
And User closes the browser

@SystemTest
Scenario Outline: To check the login functionality
When User enters '<Username>' the  username
And User enters '<Password>' the password
And User clicks on the login button
And User Verifies the login functionality
And User closes the browser
Examples:
|Username|Password|
|Admin|admin123|
|Admin|admin123|
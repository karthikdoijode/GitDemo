Feature: Login for shoppersstack website    #describes the feature being tested
Background: User enters shoppersstack login page
Scenario Outline: check the login with valid credentials # describes a specific test case

Given user opens the login site  # describes the initial state
When user enters the valid "<username>" and "<password>" # describes the action 
When user clicks on login button icon #additional conditions to the step
Then users home page should be displayed #describes the expected outcome
Then close the browser #additional condition

Examples:
| username | password |
| navaa@gmail.com | India@123 |
| amrutarao345@yahoo.com | Amruta@123 |
#| santhoshonnegowda@gmail.com | Hlsk1234$ |
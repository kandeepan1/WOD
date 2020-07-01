Feature: Offnet Flow Existing Customer

Scenario Outline: Exitsing Customer purchase one hour pass with saved payments

Given Click on Signin Link in Store page
And Type Username in login page<username>
And Type Password in login page<lpassword>
And Click Sign In Button in login page
And Select one hour pass in Store page
And Click Contiune button in Store page
And Click Saved wallet on payment page
And Click Contiune button in payment page
Then Click Confirm button on Confirm Order page
And Click Purchase Another Pass button on Order Completion page

Examples:
|username|lpassword|
|haribabu|MSDhoni@123|

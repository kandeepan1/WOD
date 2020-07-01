Feature: Offnet Flow New Customer Creation (Positive and Negative Scenario)

Scenario Outline: New Customer Creation with mandatory fields

Given Store page click one hour pass
And Click Contiune Button
And Type First Name<FirstName>
And Type Last Name<LastName>
And Type Email ID<EmailID>
And Type ZipCode<ZipCode>
And Click AccountCreation ContiuneButton
When Click Email as UserName
And Type Password <password>
And Type Confirm Password <password>
And Click Contiune Button in CIMA Page
When Type First Name in paymentpage<PFirstName>
And Type Last Name in paymentpage<PLastName>
And Type Billing Address<BillingAdd>
And Type City Name<CityName>
And Select State
And Type Zipcode paymentpage<ZipCode>
Then Switch to iframe
And Type CardNumber<CardNumber>
And Type Expiration<Expiration>
And Type CVV<CVV>
Then Switch out of iframe
And Click Contiunebutton
Then Click Confirm button
And Click Purchase Another Pass button on Order Completion page

Examples:
|FirstName|LastName|EmailID|ZipCode|password|password|
|Chris|Mike|Chresss@gmail.com|19087|MSDhoni_0|MSDhoni_0|

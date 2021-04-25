Feature: SAL2 Create Opputunity

Background:
Given Open browser

Scenario Outline: SAL2 Create Opputunity
Given Load SalesForce as <url>
And Enter UserName as <username>
And Enter Password as <password>
And Click Login Button
Then Verify Home Page appeared
Given Click App Launcher
And Click View All
Then App Launcher should open
Given Click Individuals
Then Individuals Page should open
Given Click New Individuals
Then  New Individuals Page should pop up
Given Enter Solicitation as <sol>
And Enter Individual First Name as <fName>
And Enter Individual Last Name as <lName>
And Click Save button in Individual
Then New Individual should have created with as <sol>,<fName>,<lName>

Examples:
|url|username|password|sol|fName|lName|
|'https://login.salesforce.com'|'mercury.bootcamp@testleaf.com'|'Bootcamp$123'|'Ms'|'Sara'|'Sabreen'|
|'https://login.salesforce.com'|'mercury.bootcamp@testleaf.com'|'Bootcamp$123'|'Ms'|'Sara'|'Sabreen'|

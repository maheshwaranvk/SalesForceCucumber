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
Given Click Opputunities
Then Oppurtunities Page should open
Given Click New Oppurtunity
Then  New Oppurtunity Page should pop up
Given Enter Opputunity Name as <opName>
And Enter Oppurtunity Close Date
And Enter Oppurtunity Stage
And Click Save button in NewOppurtunity
Then New Oppurtunity should have created with as <opName>

Examples:
|url|username|password|opName|
|'https://login.salesforce.com'|'mercury.bootcamp@testleaf.com'|'Bootcamp$123'|'Mahesh'|

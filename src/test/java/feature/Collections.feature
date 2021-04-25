Feature: Collections of Test Cases

Background:
Given Click App Launcher
And Click View All
Then App Launcher should open

Scenario Outline: SAL2 Create Opputunity
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
|sol|fName|lName|
|'Ms'|'Sara'|'Sabreen'|

Scenario Outline: SAL2 Create Opputunity
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
|opName|
|'Mahesh'|

Scenario Outline: SAL67 Automation For Delete service Territory
Given Click on Service Territories
Then Service Territories Page should open
Given Under Service Territories on Left Corner Click the Dropdown Option
And  Select All ServiceTerritories
Then All ServiceTerritories should get Load
Given Select The Newly created Service territory
And Click on the Dropdown Icon on right Corner
And Click on delete
Then Delete Confirmation box opens up
Given Click on Delete on Confirmation box
Then Verify Whether the Service Territory is deleted Successfully

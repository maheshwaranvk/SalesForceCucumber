Feature: SAL67 Automation For Delete service Territory

Background:
Given Open browser

Scenario Outline: SAL67 Automation For Delete service Territory
Given Load SalesForce as <url>
And Enter UserName as <username>
And Enter Password as <password>
And Click Login Button
Then Verify Home Page appeared
Given Click App Launcher
And Click View All
Then App Launcher should open
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


Examples:
|url|username|password|
|'https://login.salesforce.com'|'mercury.bootcamp@testleaf.com'|'Bootcamp$123'|

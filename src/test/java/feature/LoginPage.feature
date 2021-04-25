Feature: SalesForce Login Page

Background:
Given Open browser

Scenario Outline: TC001 ApplicationLogin
Given Load SalesForce as <url>
And Enter UserName as <username>
And Enter Password as <password>
And Click Login Button
Then Verify Home Page appeared

Examples:
|url|username|password|
|'https://login.salesforce.com'|'mercury.bootcamp@testleaf.com'|'Bootcamp$123'|
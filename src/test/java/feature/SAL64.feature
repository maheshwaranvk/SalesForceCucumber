Feature: SAL64 Automation For Create Service Territories

Scenario: SAL64 Automation For Create Service Territories
Given Click App Launcher
And Click View All
Then App Launcher should open
Given Click on Service Territories
Then Service Territories Page should open
Given Click on New in Service Territories Page
And Enter Your Name in the Name field in new ST Page
And Click on Operating Hours and Choose the First option in new ST Page
And Check Active Field in new ST Page
And Enter the City your residing in City Field in new ST Page
And Enter the State your residing in State Field in new ST Page
And Enter the Country your residing in Country Field in new ST Page
And Enter your current Postal Zip Code  in new ST Page
And Click on Save in new ST Page
Then Verify Service Territory is created Successfully
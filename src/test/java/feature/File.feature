Feature: Assessment File Verification

Background:
Given Click App Launcher
And Click View All
Then App Launcher should open

Scenario:
Given Click Service Console from App Launcher
And Select Files from the DropDown
And Click on the latest modified item link
And Click on Public link
Then Verify the new link text field is disabled to create public link
Given Download the file into a specified folder inside the project
Given Click on Share
And Click on search user and select the Derrick Dsouza
And Verify the Error message "Can't share file with the file owner."
And Click on Upload Files and browse a file from your local
And Click on DrowDown for the newly uploaded file and select View File Details
Then Verify the file name and extension of the newly uploaded file
And Close the file window tab
Then Click on DropDown for the newly uploaded file and select Delete
And Confirm Delete
And Verify the success message displayed for the delete
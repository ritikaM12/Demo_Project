Feature: Home

Scenario: Verify links are working
Given Browser is opened 
When user is navigated to homepage
And user verify links
Then Browser is closed

Scenario: Check validations on contact page
Given Browser is opened 
When user is navigated to homepage
Then user click Get in touch button
Then submit form without entering values
Then verify validations are showing 
Then Browser is closed


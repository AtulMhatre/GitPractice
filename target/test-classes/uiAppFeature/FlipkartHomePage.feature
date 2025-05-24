Feature: Verify Flipkart HomePage
@sanity @regression
Scenario: Verify title of page
Given User is at landing page
Then Title contains "Atul"

@regression
Scenario: Verify search Functionality

Given User is at landing page
When user searches for "mobile" in text box
Then mobile search results should displayed
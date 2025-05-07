Feature: Amazon HomePage Verification

Scenario: Verify title page

Given User is on landing page
Then Tiltle contains "Shopping"

Scenario: Verify Cart Icon

Given User is on landing page
Then Cart Icon should displayed
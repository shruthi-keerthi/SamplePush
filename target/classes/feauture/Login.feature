Feature: LoggedIn User

  Scenario: Log into Argos application as a valid user
    Given User navigates to the practise automation website
    And User successfully enter login credentials
    And User clicks on Submit button
    Then I should be logged in successfully
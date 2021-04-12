Feature: All login tests


  Scenario: to test the functionality of login button for valid input
    Given I am on Login page
    When I enter valid username and valid password
    And I click on login button
    Then I should be redirected to the home page
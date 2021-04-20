Feature: All login tests

  Background: before all the scenarios
    Given Open browser
    And maximize it

  @loginreal
  Scenario: to test the functionality of login button for valid input
    Given I am on Login page
    When I enter valid username and valid password
    And I click on login button
    Then I should be redirected to the home page

  @login  #<--tag
  Scenario: to test the functionality of login button for valid input on billing
    Given I am on Login page of billing
    When I enter "usename-valid" and "password-valid" for billing page
    And I click on login button of billing page
    Then I should be redirected to the home page of billing application


  @login @forhooks
  Scenario: to test the functionality of login button for invalid input on billing
    Given I am on Login page of billing
    When I enter "usename-invalid" and "password-invalid" for billing page
    And I click on login button of billing page
    Then There should be an error message


  @login @forhooks
  Scenario: to test the functionality of login button for blank input on billing
    Given I am on Login page of billing
    When I enter " " and " " for billing page
    And I click on login button of billing page
    Then There should be an another error message


    @userReg
    Scenario: to test the functionality of submit button for valid input
      Given We are on user info page
      When we enter below data
      | amol | amol@gmail.com | 8989 | pune |
      And click on submit button
      Then data should be saved


      @LoginWithMultipleData
      Scenario Outline: to test the functionality of login button for various inputs
        Given I am on Login page of stock
        When I enter <username> and <password> for stock page
        And I click on login button of stock page

        Examples:
          | username  | password  |
          | rohit     | rohit123  |
          | tushar    | Tushar123 |
          | Madhuri   | madhuri123|


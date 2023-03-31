Feature: Login Functionality

  Background:
    Given Navigate to MainPage

  Scenario Outline:Login with valid username and password

    And User sending the keys in Left Nav
      | userName2       | <name>     |
      | password2       | <password>     |
      | integrationCode | <intCode>  |
      | priorityCode    | <priority> |
    Examples:
      | name | code | intCode | priority |


  Scenario Outline:User Login Negative Test


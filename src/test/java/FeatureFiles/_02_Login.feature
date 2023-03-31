Feature: Login Functionality


  Scenario Outline: Login with valid username and password
    Given Navigate to MainPage
    When User sending the keys in LeftNav
      | userName2 | <name>     |
      | password2 | <password> |
    And Click on the element in LeftNav
      | login |

    Then Success message account is displayed

    And  Click on the element in LeftNav
      | logOut |
    Examples:
      | name      | password |
      | John_Wick | 123456*  |


  Scenario Outline: Negative Test
    Given Navigate to MainPage
    When User sending the keys in LeftNav
      | userName2 | <name>     |
      | password2 | <password> |
    And Click on the element in LeftNav
      | login |
    Then Success message should not be displayed
    Examples:
      | name      | password |
      | Recep     | 123456*  |
      | John_Wick | 12345    |



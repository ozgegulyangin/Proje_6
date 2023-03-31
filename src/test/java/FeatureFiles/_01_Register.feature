Feature: Register Functionality

  Scenario: Create Account

    Given Navigate to MainPage
    And Click to RegisterButton
    And User sending the keys in Dialog Content
      | FirstName       | John      |
      | LastName        | Wick      |
      | Adress          | Kadıköy   |
      | City            | Istanbul  |
      | State           | Türkiye   |
      | ZipCode         | 34100     |
      | SSN             | 123456    |
      | UserName        | John_Wick |
      | Password        | 123456*   |
      | ConfirmPassword | 123456*   |

    When Click on the RegisterButtonTwo
    Then Success message should be displayed





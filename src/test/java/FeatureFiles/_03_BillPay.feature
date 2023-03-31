Feature: Bill Pay Functionality

  Background:
    Given Navigate to MainPage
    When User sending the keys in LeftNav
      | userName2 | John_Wick |
      | password2 | 123456*   |
    And Click on the element in LeftNav
      | login         |
      | billpayButton |

  Scenario Outline: 3 Bill Pay Test

    And Enter payee information
      | billName          | <name>    |
      | billAdress        | <address> |
      | billCity          | <1>       |
      | billState         | <2>       |
      | billZipcode       | <3>       |
      | phoneNumber       | <7>       |
      | billAccountNumber | <4>       |
      | verifyAccount     | <5>       |
      | amount            | <6>       |

    And Click on the element in Dialog
      | sendPayment   |

    Then Success message bill pay displayed


    Examples:
      | name              | address | 1        | 2       | 3     | 7           | 4      | 5      | 6   |
      | Elektrik Faturası | x       | istanbul | türkiye | 34100 | 05005005050 | 123456 | 123456 | 85  |
      | Su Faturası       | x       | istanbul | türkiye | 34100 | 05005005050 | 123456 | 123456 | 100 |
      | Doğalgaz Faturası | x       | istanbul | türkiye | 34100 | 05005005050 | 123456 | 123456 | 120 |







Feature: Withdraw amount safely by not crossing the minimum balance in account requirement

  Scenario: Withdraw amount safely
    Given Account balance is "1000"
    When Minimum account balance maintained is "500"
    Then Successfully withdraw "100"

  Scenario: Withdraw amount unsafely
    Given Account balance is "1000"
    When Minimum account balance maintained is "500"
    Then Successfully withdraw "50"
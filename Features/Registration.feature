Feature: New Registration

  Scenario: Registration with valid creds
    Given Click on My Account Page
    And Click on registration link
    When User Enter the below Feilds
      | firstName | Ayat                |
      | lastName  | Aleem               |
      | email     | ateefa138@gmail.com |
      | telephone |          8208817166 |
      | Password  | Ayat1313@@          |
    Then Clcik on accept agreement
    And Click on the continue button
    Then Registration is successfull

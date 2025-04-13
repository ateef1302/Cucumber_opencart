Feature: Login with Valid Credentials


  Scenario: Successful Login with Valid Credentials
    Given the user navigates to login page
    When user enters email as "aleemateefa.nbnscoe@gmail.com" and password as "Feeta1313@@"
    And the user clicks on the Login button
    Then the user should be redirected to the MyAccount Page
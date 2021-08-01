Feature: Fb signup feature to validate the add new user functionality

  Scenario Outline: Verify that user is able to create the account
    Given User has launched the FB Application
    When User click on the Create New Account Link
    And User enters "<FirstName>" "<LastName>" "<Mobile Number>" "<Password>"
    And User selects "<Date>" "<Month>" "<Year>"
    And User clicks on Signup button
    Then User should be able to see the success message

    Examples: 
      | FirstName | LastName | MobileNumber | Password | Date | Month | Year |
      | Emir      | Ahmed    |    7012271825 | xyz123   |    3 |     4 | 1999 |

  @DataTable
  Scenario: User is able to create new account using cucumber datatable
    Given User has launched the FB Application
    When User click on the Create New Account Link
    And User creates the new Account
      | Field        | Value     |
      | FirstName    | Emir      |
      | LastName     | Ahmed     |
      | MobileNumber | 701271825 |
      | Password     | abc345    |
    And User clicks on Signup button
    Then User should be able to see the success message

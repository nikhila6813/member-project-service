Feature: Get, update and delete member details
  
  Scenario: Get All members
    When User requests list of all members
    Then user recieves a status of 200


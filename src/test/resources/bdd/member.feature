Feature: Get, update and delete member details
  
  Scenario: Get All members
  	Given 1 member exists
    When User requests list of all members
    Then user recieves a status of 200
    And MemberResponse object is returned with 1 member info
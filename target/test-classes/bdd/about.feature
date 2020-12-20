Feature: Base API for member-project service
  
  Scenario: Get project version
    When User requests version info
    Then Version request returns a status of 200
    And user receives version 1.0


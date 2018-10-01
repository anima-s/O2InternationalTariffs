Feature: Calling Abroad

  Scenario: User is calling to India from UK using Pay Monthly facility
    Given I am on Calling abroad page
    When I select India from the available countries
    And I click on Pay Monthly tab
    Then I should be able to see the tariffs for India

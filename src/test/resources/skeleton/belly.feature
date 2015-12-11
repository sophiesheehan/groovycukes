Feature: Belly

  Scenario: a few cukes
    Given I have 42 cukes in my belly
    When I wait 1 hour
    Then my belly should GROWL
    
  Scenario: not enough Cukes
    Given I have 10 cukes in my belly
    When I wait 1 hour
    Then my belly should be silent

#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Login
Feature: Login
  Login with Scenario Outline

  @Valid
  Scenario Outline: Login with scenario outline
   	Given Navigate to login Page
    When login with email address <email> and password <password>
    Then should arrive at my account page

    Examples: 
      | email | password |
      | my@fake.com   | iFGeFYmXIrUhQZHvW7P22w==   |
      | saya@fake.com | iFGeFYmXIrUhQZHvW7P22w==  |
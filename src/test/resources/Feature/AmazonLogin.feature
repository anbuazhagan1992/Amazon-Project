
Feature: Product page check  in Amazon App

  Scenario Outline: Validate the home page
  
    Given User is on Amazon home page
    When User enters the "<mobiles>" in search bar
    Then User is on product details page

    Examples: 
      | mobiles |
      | iphone  |
      | samsung |
      | redmi   |
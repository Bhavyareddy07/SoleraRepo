#Author : Bhavya.R@solera.com
#Date
#Discription
Feature: feature to test login functionally

  @testcaseone
  Scenario Outline: check login is succesfull with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to the home page

    Examples: 
      | username                  | password            |
      | Seleniumtesting@gmail.com | Seleniumtesting@123 |
      | user1                     | pass1               |
      | user2                     | pass2               |

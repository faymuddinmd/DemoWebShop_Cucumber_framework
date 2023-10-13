Feature: Login Data Driven

  Scenario Outline: Login Data Driven
    Given user launch browser
    And Open url "https://demowebshop.tricentis.com/"
    And Click on Login
    And Enter the Email as "<email>" and password as "<password>"
    And Click on Login button
    Then User navigate to Dashboard

    Examples: 
      | email                  | password    |
      | testing+100@gmail.com  | password123 |
      | testing+200@gmail.com  | password123 |
      | testing+2000@gmail.com | password123 |

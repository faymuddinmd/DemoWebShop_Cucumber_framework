Feature: login with valid credentials
 Scenario: successful login with valid credentials
Given user launch browser
   And Open url "https://demowebshop.tricentis.com/"
   And Click on Login
   And Enter the Email as "testing+100@gmail.com" and password as "password123"
   And Click on Login button
   Then User navigate to Dashboard
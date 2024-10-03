Feature: Automation testing scenarios

		@Registration
  Scenario: User registration page
    Given user launches the browser application
    And user landed on the homepage
    When user clicks on register button
    And Giving all the details for registration
    And clicks on submit
    Then user registration successful
   
   	@Placeorder
  Scenario: Placing order
    Given user launches the browser application
    And user landed on the homepage
    When user clicks PracticeSite button
    And user adding products to basket
    And user navigate to BasketPage and clicks on checkout button
    And Giving all the billingdetails for Order
    Then user clicks on placeorder button
  

Feature: Swag Lab Add Multiple Product Functionality
  Add to cart feature allows the user to add items to the cart

  Background:
    Given User is successfully logged in to SwagLabs account

  Scenario: User is adding multiple items to the cart
    When User clicks on Add to cart for multiple products
    | product |
		| Sauce Labs Backpack |
		| Sauce Labs Bike Light |
		| Sauce Labs Bolt T-Shirt|
    And clicks on the cart
    Then User should view the added products in Your Cart
    And user clicks on Checkout button
    Then User should Enter Customer details
    |firstname| lastname |postalcode|
    | Gaurav | Telgu | 436512  |
    And Click on Continue
    Then User should view Checkout overview 
    And Click on Finish
    Then User should view Thank you for your order!
    
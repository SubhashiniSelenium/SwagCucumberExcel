Feature: Swag labs
@tc01_Login
Scenario:
    Login to Swag labs
    Given the user launched the chrome browser
    When the user opens Swaglabs homepage
    Then the user enters username and password
    And click the login button

@tc02_Search
Scenario:
    Search the product
    Given the user launches chrome browser
    When the user opened Swaglabs homepage
    Then the user enter username and password
    Then clicks the login button
    And the user clicks the A to Z icon

@tc03_Cart
Scenario:
    Adding product to the cart
    Given user launched the chrome browser
    When the user opens Swaglab homepage
    Then  user enters username and password
    Then clicked the login button
    Then the clicks the product to cart
    And the product is added to cart
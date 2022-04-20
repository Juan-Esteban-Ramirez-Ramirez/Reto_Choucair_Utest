# Autor : Juanes Ramirez Ramirez

@HU
Feature: as a user I want to enter the Utest.com page to register as a new user.

  Scenario: verify new user registration successfully
    Given the user is on the main page of the web application
    When the user fills in all the required information fields

    |firstName|lastName|email     |city    |postal|country |createKey  |
    |Juan     |Ramirez |@gmail.com|Envigado|055421|Colombia|JuanRa2022*|

    Then verify that the user was created successfully
    |confirm      |
    |The last step|

# Autor : Juanes Ramirez Ramirez

@HU
Feature: as a user I want to enter the Utest.com page to register as a new user.

  Scenario: verify new user registration successfully
    Given the user is on the main page of the web application
    When the user clicks the Join today button
    And enter form one data
    |firstName|lastName|email         |
    |Juan     |Ramirez |9999@gmail.com|
    And enter form data two
    |city    |postal|country |
    |Envigado|055421|Colombia|
    And select the data in form three
    And create a valid password
    |createKey  |
    |JuanRa2022*|
    Then verify that the user was created successfully
    |confirm      |
    |The last step|

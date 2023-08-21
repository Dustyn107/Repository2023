Feature: post un usuario

  Scenario: Crear un usuario nuevo
    Given url "https://petstore.swagger.io/v2/user/createWithList"
    And request { "id": 3, "username": "jgarzon", "firstName": "juan", "lastName": "garzon", "email": "TEST@TESTING.COM", "password": "123456", "phone": "2345676", "userStatus": 0 }
    When method post
    Then status 200

Feature: Get de un usuario

  Scenario: Get a user
    Given url "https://petstore.swagger.io/v2/user/jgarzon"
    When method get
    Then status 200

Feature: Put un usuario

  Scenario: put a user
    Given url "https://petstore.swagger.io/v2/user/jgarzon"
    And request { "id": 3, "username": "jgarzon", "firstName": "jose", "lastName": "garzon", "email": "personal@test.com", "password": "123456", "pone": "2345676", "userStatus": 0 }
    When method put
    Then status 200

Feature: Get un usuario actualizado

  Scenario: Get a user
    Given url "https://petstore.swagger.io/v2/user/jgarzon"
    When method get
    Then status 200
    And match $.firstName == "jose"

Feature: Delete de un usuario

  Scenario: Delete a user
    Given url "https://petstore.swagger.io/v2/user/jgarzon"
    When method delete
    Then status 200
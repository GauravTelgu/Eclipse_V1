Feature: Online Fake API-Passenger-Get

  #@execute
  Scenario: Get all passenger details
    #Given url 'https://api.instantwebtools.net/v1/airlines'
    Given url baseURI
    And path 'passenger'
    When method GET
    Then status 200
    
   # @execute
  Scenario: Get all passenger details
    Given url secureBaseURL
    And header Authorization = 'Bearer '+authInfo.authToken
    And path 'passenger'
    When method GET
    Then status 200
Feature: Online Fake API-Airlines-Put

@execute
 Scenario: Update every detail of a passenger.
    Given url secureBaseURL
    And header Authorization = 'Bearer '+authInfo.authToken
   	And path 'airlines/667945df7ad8fb0bc9433c48'
   	* def airlineputpayload = read('Airline_put_payload.json')
   	And request airlineputpayload
    When method PUT
    Then status 200
    
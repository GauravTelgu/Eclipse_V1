Feature: Online Fake API-Airlines-Put

#@execute
 Scenario: Update every detail of a passenger.
    Given url secureBaseURL
    And header Authorization = 'Bearer '+authInfo.authToken
   	And path 'passenger/667945df7ad8fb0bc9433c48'
   	* def passengerpayload = read('Passenger_Put_payload.json')
   	And request passengerpayload
    When method PUT
    Then status 200
    
    
    
    
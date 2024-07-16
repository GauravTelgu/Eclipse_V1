Feature: Fake API Get Passenger data using secure data
 
  #@execute
  Scenario: Add all data of passenger
    # Given url 'https://api.instantwebtools.net/v1/passenger'
    #Given url nonSecureBaseURL
    Given url secureBaseURL
    And header Authorization = 'Bearer '+authInfo.authToken
    And path 'passenger'
    And request {"_id":"66781445d6a086b675bb228e","name":"Gaurav Telgu","trips":200,"airline":[{"_id":"66038402-402d-4a3f-baef-7cb5f53697a8","name":"Haulmer Airlines","country":"Chile","logo":"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR7vAC_SGHIGl8NuaJlU0k5pB2Pc7dK0NkD1A&s","slogan":"Haulmer","head_quaters":"Curicó, Chile","website":"www.haulmer-airlines.com","established":"2024","__v":0}],"__v":0}
    When method POST
    Then status 200
    
    
    
     #@execute
  Scenario: Add passenger details using payload from file
    Given url secureBaseURL
    And header Authorization = 'Bearer '+authInfo.authToken
    And path 'passenger'
    * def PassengerPayload = read('Passenger_post_payload.json')
    And request PassengerPayload
    When method POST
    Then status 200
    
      
   # @execute
  Scenario: Add Passenger details using multiline payload
    Given url secureBaseURL
    And header Authorization = 'Bearer '+authInfo.authToken
    And path 'passenger'
    And request
      """
      	{
  "_id": "6686849d4cb5f785007bef4f",
  "name": "Gaurav Telgu",
  "trips": 200,
  "airline": [
    {
      "_id": "66038402-402d-4a3f-baef-7cb5f53697a8",
      "name": "Haulmer Airlines",
      "country": "Chile",
      "logo": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR7vAC_SGHIGl8NuaJlU0k5pB2Pc7dK0NkD1A&s",
      "slogan": "Haulmer",
      "head_quaters": "Curicó, Chile",
      "website": "www.haulmer-airlines.com",
      "established": "2024",
      "__v": 0
    }
  ],
  "__v": 0
}

      """
    When method POST
    Then status 200
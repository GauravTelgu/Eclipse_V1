Feature: Online Fake API-Airlines-Post

	#@execute
Scenario: Create a new airline
  Given url secureBaseURL
    And header Authorization = 'Bearer '+authInfo.authToken
  And path 'airlines'
  And request
    """
    {
      			"_id":"252d3bca-d9bb-476c-9a97-562d685e235c",
      			"name": "Sri Lankan Airways",
      			"country": "Sri Lanka",
      			"logo": "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png",
      			"slogan": "From Sri Lanka",
      			"head_quaters": "Katunayake, Sri Lanka",
      			"website": "www.srilankaaairways.com",
      			"established": "1990"
      }
    """
  When method POST
  Then status 200
  #And match response._id == "252d3bca-d9bb-476c-9a97-562d685e235c"
    #And match response.name == "Quatar Airways"
    #And match response.country == "Qatar"
    #And match response.logo == "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/300px-Qatar_Airways_Logo.svg.png"
    #And match response.slogan == "Going Places Together"
    #And match response.head_quaters == "Qatar Airways Towers, Doha, Qatar"
    #And match response.website == "www.qatarairways.com"
    #And match response.established == "1994"
    
       
    #@execute
  Scenario: Add airline details using payload from file
    Given url secureBaseURL
    And header Authorization = 'Bearer '+authInfo.authToken
    And path 'airlines'
    * def airlinesPaylod = read('Airlinepayload.json')
    And request airlinesPaylod
    When method POST
    Then status 200
    
    
    #@execute
    Scenario: Add airline details using singleline payload
    Given url secureBaseURL
    And header Authorization = 'Bearer '+authInfo.authToken
    And path 'airlines'
    And request {"_id":"1111","name":"Sri Lankan Airways","country":"Sri Lanka","logo":"https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png","slogan":"From Sri Lanka","head_quaters":"Katunayake, Sri Lanka","website":"www.srilankaaairways.com","established":"1990"}
    When method POST
    Then status 200
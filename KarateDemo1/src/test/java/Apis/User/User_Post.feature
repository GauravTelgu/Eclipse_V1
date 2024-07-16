Feature: Req-Res_Post feature

	@execute
Scenario: Create a new user
  Given url baseURI
  And path 'users'
  And request
    """
    {
    "name": "morpheus",
    "job": "leader"
		}
    """
  When method POST
  Then status 201
 
    
Feature: Req-Res_Post feature for Register

	@execute
Scenario: Register Successfull
  Given url baseURI
  And path 'register'
  And request
    """
    {
    "email": "eve.holt@reqres.in",
    "password": "pistol"
		}
    """
  When method POST
  Then status 200
  
 @execute
Scenario: Register Unsuccessfull
  Given url baseURI
  And path 'register'
  And request
    """
    {
    "email": "sydney@fife"
		}
    """
  When method POST
  Then status 400
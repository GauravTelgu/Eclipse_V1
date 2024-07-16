Feature: Req_Res Delete Feature


@execute
Scenario: Delete User Details
	  Given url baseURI
	  And path 'users/2'
	  When method DELETE
	  Then status 204
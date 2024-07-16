package com.maveric.git.dataprovider;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

	@DataProvider
	public Object[][] getInValidUsernameorInvalidPassword(){
		return new Object[][] {
			{"Gaurav","Gt@250398"},
			{"GauravTelgu","Gaurav@25"}};
	
}
	
	@DataProvider
	public Object[][] getUsernameandPassword(){
		return new Object[][] {
			{"GauravTelgu","Gt@250398"},
		};
}
}

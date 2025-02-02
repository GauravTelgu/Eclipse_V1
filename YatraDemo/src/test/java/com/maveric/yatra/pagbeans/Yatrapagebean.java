package com.maveric.yatra.pagbeans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Yatrapagebean {

	@FindBy(how = How.XPATH, using = "//a[@title='Flights']")
	private WebElement Flights;

	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Round Trip')]")
	private WebElement RoundTrip;

	@FindBy(how = How.XPATH, using = "//input[@id='BE_flight_origin_city']")
	private WebElement FlightOrigin;

	@FindBy(how = How.XPATH, using = "//input[@class='required_field cityPadLeft ac_input dest_ac']")
	private WebElement FlightDestination;

	public void setFlightOrigin(String flightOrigin) {
		this.FlightOrigin.sendKeys(flightOrigin);
	}

	public void setFlightDestination(String flightDestination) {
		this.FlightDestination.sendKeys(flightDestination);
	}

	public void ClickFlights() {
		Flights.click();
	}

	public void Roundtrip() {
		RoundTrip.click();
	}

}

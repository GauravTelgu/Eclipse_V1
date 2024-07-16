package com.maveric.project.stepdefs;

import org.openqa.selenium.WebDriver;

import com.maveric.project.utils.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberStepDef1 {

	private WebDriver driver;
	String baseurl = "https://www.google.com";

	@Before
	public void SetupEnv() {
		driver = DriverFactory.getDriver();

	}

	@Given("User should open Google translater page")
	public void user_should_open_google_translater_page() {
		// System.out.println("--> Given");
	}

	@When("User entered {string} word into {string} language and select {string} language")
	public void user_entered_word_into_language_and_select_language(String string, String string2, String string3) {
		// System.out.println("-- > When word : " + string + "from " + string2 + "To" +
		// string3);
	}

	@Then("Google translater should display word {string} into {string} language")
	public void google_translater_should_display_word_into_language(String string, String string2) {
		// System.out.println("-- > When word : " + string + "To" + string2);
	}

	@After
	public void tearEnv() {
		driver.quit();
	}

}

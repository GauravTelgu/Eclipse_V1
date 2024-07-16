package com.maveric.project.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.maveric.project.utils.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CucumberStepDef {

	private WebDriver driver;
	String baseurl ="https://www.google.com";
	
	@Before
	public void SetupEnv() {
		driver=DriverFactory.getDriver();
		
	}

	@Given("User should open Google search page")
	public void user_should_open_google_search_page() {
		driver.get(baseurl);
	}

	@When("User entered {string} in search box")
	public void user_entered_in_search_box(String string) {
		driver.findElement(By.name("q")).sendKeys("Agile Methodology");
	}

	@When("click on submit button")
	public void click_on_submit_button() {
		driver.findElement(By.name("btnK")).submit();
	}

	@Then("Multiple Links should be displayed on {string} topic")
	public void multiple_links_should_be_displayed_on_topic(String string) {
		System.out.println("Agile Methodologies Displayed");
	}
	
	/*
	 * @After public void tearEnv() { driver.quit(); }
	 */
}

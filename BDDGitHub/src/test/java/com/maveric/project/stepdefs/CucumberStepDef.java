package com.maveric.project.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.maveric.project.utils.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberStepDef {

	private WebDriver driver;
	String baseurl = "https://github.com/login";

	@Before
	public void SetupEnv() {
		driver=DriverFactory.getDriver();
	}
	
	@Given("User should open GitHub login page")
	public void user_should_open_git_hub_login_page() {
		driver.get(baseurl);
	}

	@When("User enters their username and password")
	public void user_enters_their_username_and_password() {
		driver.findElement(By.name("login")).sendKeys("GauravTelgu");
		driver.findElement(By.name("password")).sendKeys("Gt@250398");
		
		
	}

	@When("clicks on the submit button")
	public void clicks_on_the_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
	}

	@Then("User should be redirected to their GitHub dashboard")
	public void user_should_be_redirected_to_their_git_hub_dashboard() {
		System.out.println("Logged in Successfully");
	}

	/*
	 * @After public void teardownEnv() { driver.quit(); }
	 */
}

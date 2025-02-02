package com.maveric.swaglabs.stepdefs;

import java.util.Map;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.maveric.swaglabs.databeans.Userbean;
import com.maveric.swaglabs.pagebeans.LoginPageBean;
import com.maveric.swaglabs.utils.DriverFactory;
import org.junit.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SwagLabsStepdef {

	private WebDriver driver;
	private LoginPageBean pagebean;
	String baseurl = "https://www.saucedemo.com/";
	
	@Before
	public void SetupEnv() {
		driver= DriverFactory.getdriver();
		pagebean = PageFactory.initElements(driver, LoginPageBean.class);
	}
	
	@Given("User is on Swag Labs login page")
	public void user_is_on_swag_labs_login_page() {
	    driver.get(baseurl);
	}

	@DataTableType
	public Userbean userbeandata(Map<String, String> inputbean) {
		Userbean bean = new Userbean();
		bean.setUsername(inputbean.get("username"));
		bean.setPassword(inputbean.get("password"));
		return bean;
		
	}
	
	@When("User enter wrong credentials")
	public void user_enter_wrong_credentials(Userbean bean) throws Exception {
		pagebean.setUsername(bean.getUsername());
		Thread.sleep(3000);
		pagebean.setPassword(bean.getPassword());
		Thread.sleep(3000);
		System.out.println("User entered wrong credentials");
		
		
	}

	@When("click on login")
	public void click_on_login() throws Exception {
		pagebean.Login();
		Thread.sleep(2000);
	}

	@Then("{string} message should display")
	public void message_should_display(String string) {
		String expectedErrorMsg = "Epic sadface: Username and password do not match any user in this service";
		String ActualErrorMsg = pagebean.getErrormsg();
		Assert.assertEquals(expectedErrorMsg, ActualErrorMsg);
	}

	@When("User enter valid credentials")
	public void user_enter_valid_credentials(Userbean bean) throws Exception {
		
		pagebean.setUsername(bean.getUsername());
		Thread.sleep(3000);
		pagebean.setPassword(bean.getPassword());
		Thread.sleep(3000);
		pagebean.Login();
		Thread.sleep(3000);
		System.out.println("User has successfully logged in");
		
	}
	

	@When("click on submit")
	public void click_on_submit() {
		//
	}

	@Then("user able to login to Swag Labs home page.")
	public void user_able_to_login_to_swag_labs_home_page() {
	    
	}
	
	@After
	public void teardownEnv(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
			byte [] screenShot= takesScreenshot.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenShot, "image/png", "errorScreen");
		}
		driver.quit();
	}	
}

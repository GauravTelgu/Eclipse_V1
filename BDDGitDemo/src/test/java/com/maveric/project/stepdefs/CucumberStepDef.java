package com.maveric.project.stepdefs;

import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.maveric.git.databeans.UserBean;
import com.maveric.git.pagebeans.LoginPageBean;
import com.maveric.project.utils.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class CucumberStepDef {

	private WebDriver driver;
	private LoginPageBean pagebean;
	String baseurl = "https://github.com/login";

	/*
	 * @BeforeAll public static void beforeAll() {
	 * System.out.println("  Before All "); }
	 */

	@Before
	public void SetupEnv() {
		//System.out.println("Before  ");
		driver = DriverFactory.getDriver();
		pagebean = PageFactory.initElements(driver, LoginPageBean.class);
	}

	/*
	 * @BeforeStep public void beforeEachStep() {
	 * System.out.println(" ----> beforeEachStep "); }
	 */
	
	

	@Given("User is on github loging page")
	public void user_is_on_github_loging_page() {
		driver.get(baseurl);
	//	pagebean = PageFactory.initElements(driver, LoginPageBean.class);
	}

	@DataTableType
	public UserBean userBeanData(Map<String, String> inputBean) {
		UserBean bean = new UserBean();
		bean.setUserName(inputBean.get("username"));
		bean.setPassword(inputBean.get("password"));
		return bean;
	}
	
	@When("User enter wrong credentials")
	public void user_enter_wrong_credentials(UserBean bean) {
		pagebean.setUsername(bean.getUserName());
		pagebean.setPassword(bean.getPassword());
		pagebean.signIn();
		String expectedErrorMsg = "Incorrect username  password.";
		String ActualErrorMsg = pagebean.getErrorMessage();
		Assert.assertEquals(expectedErrorMsg, ActualErrorMsg);
	}

	@When("click on submit")
	public void click_on_submit() {
	}

	@Then("{string} message should display")
	public void message_should_display(String string) {

	}

	@When("User enter valid credentials")
	public void user_enter_valid_credentials(UserBean bean) {
		System.out.println("bean  -> "+bean);
		pagebean.setUsername(bean.getUserName());
		pagebean.setPassword(bean.getPassword());
		//pagebean.signIn();
		Assert.fail();
	}

	@Then("user able to see home page of corresponding github account")
	public void user_able_to_see_home_page_of_corresponding_github_account() {

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
